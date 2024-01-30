def call() {
    sh 'trivy image narian318/youtube:latest > trivyimage.txt'
}
