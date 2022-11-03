node {
    stage('Build') {
        sh 'echo "esta construyendo"'
    }
    stage('Test') {
        sh 'echo "este es uun cambio de prueba"'
    }

    stage('Deploy') {
        sh 'echo "Hello World"'
    }
}
