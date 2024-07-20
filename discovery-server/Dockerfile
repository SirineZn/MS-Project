FROM amazoncorretto:17

# Make port 8761 available to the world outside this container
EXPOSE 8761

# Add the application's jar to the container
ADD target/discovery-server*.jar discovery-server.jar

# Run the jar file
CMD ["java", "-jar", "discovery-server.jar"]
