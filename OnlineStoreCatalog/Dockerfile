# Use a base image that contains Java
FROM openjdk:17-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8082 available to the world outside this container
EXPOSE 8082

# Add the application's jar to the container
ADD target/online-store-catalog-0.0.1-SNAPSHOT.jar online-store-catalog.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/online-store-catalog.jar"]
