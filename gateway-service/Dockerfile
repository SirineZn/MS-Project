# Use a base image that contains Java
FROM amazoncorretto:17

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8761 available to the world outside this container
EXPOSE 8761

# Add the application's jar to the container
ADD target/gateway-service*.jar gateway-service.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "gateway-service.jar"]
