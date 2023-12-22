pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
              echo '${M2}'
                echo '${JAVA_HOME}'
            }
        }
         stage('Deploy') {
            steps {
               sh 'mvn spring-boot:run'
            }
        }
    }
}
