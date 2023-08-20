FROM openjdk:11
EXPOSE 8080
ADD target/hello-1-0.0.1-SNAPSHOT.jar hello-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/hello-1-0.0.1-SNAPSHOT.jar" ]