
FROM openjdk:17-jdk
WORKDIR /app
COPY target/springboot-empDemo-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8086
ENTRYPOINT ["java", "-jar", "/app.jar"]

