FROM openjdk:8-alpine

EXPOSE 1200

ADD artifact/github-actions-1.0.0.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]