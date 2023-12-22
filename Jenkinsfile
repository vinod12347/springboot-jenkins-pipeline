pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               sh '${M2}/mvn clean install'
            }
        }
         stage('Deploy') {
            steps {
               sh '${M2}/mvn spring-boot:run'
            }
        }
    }
}
