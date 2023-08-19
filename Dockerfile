FROM openjdk:11
EXPOSE 8080
ADD target/hello1.jar hello1.jar
ENTRYPOINT [ "java","-jar","/hello1.jar" ]