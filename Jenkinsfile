node {
    def appProperties= readProperties file: "./src/main/resources/application.properties";
    def appSpecificProps= readProperties file: "./servicemeshbanker/service-specific.properties"
    def imageName=appProperties['app.docker.imagename'];
    def tagName=appProperties['app.dokcer.tagname'];
    def repositoryName=appProperties['app.docker.repositoryname'];
    def pushedImageName= repositoryName+'/'+imageName+':'+tagName;
        stage('clone') {
           echo "hello world"
          git branch: 'feature/BEE7429', credentialsId: 'gitusernameandpass', url: 'https://github.com/vinod12347/springboot-jenkins-pipeline.git'
           echo "repository cloned successfully"
        }
         stage('compile') {
           echo "compiling the Code started"
          bat "mvn clean install"
           echo "compiling the code ended"
        }
        stage('read file'){
            println("file props:"+appProperties['server.port'])
             println("docker image name:"+appProperties['app.docker.imagename'])
             println("docker image tagname:"+appProperties['app.dokcer.tagname'])
             println("docker repository:"+appProperties['app.docker.repositoryname'])

        }
        stage("Docker build"){

    bat 'docker version'
    bat 'docker build -t '+imageName+' .'
    bat 'docker image list'
    bat 'docker tag '+imageName+' '+pushedImageName
    println("image build  successfully")
}

withCredentials([string(credentialsId: 'docker-hub-credentials', variable: 'docker-crd')]) {

   bat 'docker login -u kjvinodraj@gmail.com -p %docker-crd%'
   println("login to doker hub sccessfully")
}
stage("Push Image to Docker Hub"){
        bat 'docker push '+pushedImageName;
        println("Image Pushed Successfully")
    }

    stage("kubernetes deployment"){
        println("deploying the code started")
        withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'jenkinsuser', namespace: '', restrictKubeConfigAccess: false, serverUrl: 'http://localhost:8001/') {
    // some block
     bat "kubectl apply -f deployment.yml"
        println("deployed successfully")
}
    }
}
