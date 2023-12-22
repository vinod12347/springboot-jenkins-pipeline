pipeline {
    agent any
    tools {
        maven 'Maven 3.9.6'
        jdk 'Corretto-17.0.9.8.1'
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
