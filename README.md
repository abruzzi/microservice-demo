### Micro-service demo

1.  Mongodb as database        
1.  Spring-boot as framework
1.  Docker/Docker-compose as container
1.  Gradle as build script

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