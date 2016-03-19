FROM java:openjdk-8-jdk

ADD build/libs/microservice-demo-0.1.0.jar app.jar

EXPOSE 9527

ENTRYPOINT ["java", "-Dserver.port=9527", "spring.data.mongodb.uri=mongodb://127.0.0.1:27017/thoughtworks", "-jar","/app.jar"]