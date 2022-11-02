node {
    stage('Build') {
        sh 'echo "esta construyendo"'
    }
    stage('Test') {
        sh 'echo "desde test"'
    }

    stage('Deploy') {
        sh 'echo "Hello World"'
    }
}
