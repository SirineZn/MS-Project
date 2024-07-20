# Use a base image that contains Java
FROM amazoncorretto:17

# Make port 8888 available to the world outside this container
EXPOSE 8888

# Add the application's jar to the container
ADD target/config-server*.jar config-server.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "config-server.jar"]
