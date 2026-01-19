# 1. Use Maven base image with java 17
FROM maven:3.8.4-openjdk-17 AS build

# 2. Create work directory
WORKDIR /app

# 3. Copy the application source code into the container
COPY . .

# 4. Build the app using mvn package
RUN mvn package -DskipTests

# 5. Expose port 8080
EXPOSE 8080

# 6. Run the app on jar file
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]