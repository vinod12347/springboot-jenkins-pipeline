node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/vinod12347/springboot-jenkins-pipeline.git'
  }

  stage("Compilation") {
    sh "chmod 777 ./mvnw"
    sh "./mvnw clean package"
  }
    stage("Staging") {
                sh "pid=\$(lsof -i:8081 -t); kill -TERM \$pid " 
                  + "|| kill -KILL \$pid"
                withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                    sh 'nohup ./mvnw spring-boot:run -Dserver.port=8081 &'
                }

  
}
