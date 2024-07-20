# Use a base image that contains Java
FROM amazoncorretto:17


# Make port 8081 available to the world outside this container
EXPOSE 8081

# Add the application's jar to the container
ADD target/event-management-system-0.0.1-SNAPSHOT.jar event-management-system.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/event-management-system.jar"]
