pipeline {
    agent any
    tools{
        maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
               sh 'mvn clean install'
            }
        }
         stage('Deploy') {
            steps {
               sh './mvnw spring-boot:run'
            }
        }
    }
}
