FROM java:openjdk-8-jdk

ADD build/libs/microservice-demo-0.1.0.jar app.jar

EXPOSE 9527

ENTRYPOINT ["java", "-Dserver.port=9527", "-Dmongo.host=192.168.99.100", "-Dmongo.database=thoughtworks", "-jar","/app.jar"]