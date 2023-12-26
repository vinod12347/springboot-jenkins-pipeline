node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/vinod12347/springboot-jenkins-pipeline.git'
  }

  stage("Compilation") {
    sh "chmod 777 ./mvnw"
    sh "./mvnw clean package"
  }
    stage("Deployment") {
      sh 'java -jar ./target/*.jar'
    }
}
