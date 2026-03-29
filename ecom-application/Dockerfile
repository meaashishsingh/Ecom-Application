FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/ecom-application-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]


# Container starts
#      ↓
# ENTRYPOINT runs
#      ↓

# java -jar app.jar
#      ↓
# Spring Boot starts