node {
    stage('Build') {
        sh 'echo "esta construyendo"'
    }
    stage('Test') {
        sh 'echo "Hello World"'
    }

    stage('Deploy') {
        sh 'echo "Hello World"'
    }
}
