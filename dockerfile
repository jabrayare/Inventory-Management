# Use a base image
FROM openjdk:17-jdk-alpine

export DOCKER_BUILDKIT=0
export COMPOSE_DOCKER_CLI_BUILD=0

# Set the working directory
WORKDIR /app

# Copy the build files
COPY build/libs/Inventory-management-system.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
