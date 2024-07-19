# Use a base image that contains Java
FROM openjdk:17-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8761 available to the world outside this container
EXPOSE 8761

# Add the application's jar to the container
ADD target/discovery-server-0.0.1-SNAPSHOT.jar discovery-server.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/discovery-server.jar"]
