pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
              echo '${env.M2}'
                echo '${env.JAVA_HOME}'
            }
        }
         stage('Deploy') {
            steps {
               sh 'mvn spring-boot:run'
            }
        }
    }
}
