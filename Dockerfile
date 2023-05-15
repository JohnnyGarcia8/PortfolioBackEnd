
FROM amazoncorretto:17-alpine-jdk

MAINTAINER Jonathan 

COPY  target/Jonathan-0.0.1-SNAPSHOT  jonathan-app.jar

EXPOSE 8080

ENTRYPOINT  ["java", "-jar", "jonathan-app.jar"]

