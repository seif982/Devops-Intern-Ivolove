_ // استدعاء المكتبة المشتركة المطلوبة في اللاب

pipeline {
    agent { label 'docker-agent' } // تشغيل الـ Pipeline على الـ Slave اللي عملناه

    environment {
        DOCKER_CREDS_ID = 'docker-hub-creds'
        IMAGE_NAME = "seif982/jenkins-app"
        // تحديد الـ Namespace بناءً على اسم الفرع
        K8S_NAMESPACE = "${env.BRANCH_NAME == 'prod' ? 'prod' : (env.BRANCH_NAME == 'stag' ? 'stag' : 'dev')}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Push Image') {
            steps {
                script {
                    // استخدام الـ Shared Library لبناء الصورة
                    dockerOps.buildAndPush(IMAGE_NAME, DOCKER_CREDS_ID)
                }
            }
        }

        stage('Deploy to K8s') {
            steps {
                script {
                    echo "🚀 Deploying to Namespace: ${K8S_NAMESPACE}"
                    // أمر الـ Deploy باستخدام الـ Namespace المتغير
                    sh "kubectl apply -f deployment.yaml -n ${K8S_NAMESPACE}"
                }
            }
        }
    }
}
