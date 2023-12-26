node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/vinod12347/springboot-jenkins-pipeline.git'
  }

  stage("Compilation") {
    sh "mvn clean install"
  }
    stage("Deployment") {
      sh 'java -jar ./*.jar'
    }
}
