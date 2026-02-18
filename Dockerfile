# Use official lightweight JDK 21 image
#FROM eclipse-temurin:17-jre-jammy
FROM eclipse-temurin:21-jdk-alpine



# Set working directory inside container
WORKDIR /app

# Copy the built jar file into container
COPY target/*.jar app.jar

# Expose application port (change if needed)
EXPOSE 4568

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
