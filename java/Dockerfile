FROM openjdk:11-alpine

# Copy the JAR file to the container
COPY target/*.jar /app.jar

# Set the working directory
WORKDIR /app

# Define the entrypoint
ENTRYPOINT ["java", "-jar", "app.jar"]

# Expose the application port (adjust if needed)
EXPOSE 8080