node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/vinod12347/springboot-jenkins-pipeline.git'
  }

  stage("Compilation") {
    sh "sudo ./mvnw clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "sudo ./mvnw test -Punit"
    }
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}
