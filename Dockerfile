
FROM openjdk:8-jdk-alpine
LABEL maintainer="faruquebraimo@gmail.com"
ARG JAR_FILE=*.jar
COPY --from=maven target/frame-blog-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-jar", "application.jar"]