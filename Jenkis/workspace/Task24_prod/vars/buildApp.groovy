def call() {
    echo "🏗️ Building Application..."
    sh "mvn clean package -DskipTests"
}
