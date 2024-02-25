FROM openjdk:17
MAINTAINER javablog.com
COPY target/springboot-pipeline-0.0.1-SNAPSHOT.jar springboot-pipeline-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-pipeline-0.0.1-SNAPSHOT.jar"]