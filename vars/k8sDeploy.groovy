def call() {
    // افترضنا أن ملف الـ deployment موجود
    sh "kubectl apply -f deployment.yaml"
}
