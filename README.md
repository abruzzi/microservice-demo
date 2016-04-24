### Micro-service demo

1.  Mongodb as database        
1.  Spring-boot as framework
1.  Docker/Docker-compose as container
1.  Gradle as build script

While as I add a auth-interceptor, you need to specific a `profile` before launch the app:

```sh
java -jar -Dspring.profiles.active=production build/libs/microservice-demo-0.1.0.jar
```

or 

```sh
java -jar -Dspring.profiles.active=testing build/libs/microservice-demo-0.1.0.jar
```

### How to run (on Mac)?

```sh
$ gradle build
$ docker-compose build
$ docker-compose up
```

### Or if you have a real-docker env

```sh
$ gradle build
$ docker build -t microservice-demo/jigsaw .
$ docker run -P -d --name jigsaw --link mongodb microservice-demo/jigsaw
```