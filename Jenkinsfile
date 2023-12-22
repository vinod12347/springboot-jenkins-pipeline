pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
              echo '${env.BUILD_NUMBER}'
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
