node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/vinod12347/springboot-jenkins-pipeline.git'
  }

  stage("Compilation") {
    sh "chmod 777 ./mvnw"
    sh "./mvnw clean install"
  }
    stage("Deployment") {
      sh "chmod 777 ./mvnw"
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}
