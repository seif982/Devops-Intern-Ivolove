def buildImage(imageName, tag) {
    echo "🐳 Building Docker Image: ${imageName}:${tag}"
    sh "docker build -t ${imageName}:${tag} ."
}

def scanImage(imageName, tag) {
    echo "🔍 Scanning Image with Trivy..."
    // هنفترض إن trivy متسطب على الـ Slave
    sh "trivy image ${imageName}:${tag} || echo 'Scan failed but continuing...'"
}

def pushImage(imageName, tag, credentialsId) {
    echo "🚀 Pushing Image to Docker Hub..."
    withCredentials([usernamePassword(credentialsId: credentialsId, 
                                      passwordVariable: 'PASS', 
                                      usernameVariable: 'USER')]) {
        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
        sh "docker push ${imageName}:${tag}"
    }
}

