# Use a base image that contains Java
FROM openjdk:17-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8888 available to the world outside this container
EXPOSE 8888

# Add the application's jar to the container
ADD target/config-server-0.0.1-SNAPSHOT.jar config-server.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/config-server.jar"]
