# Use Java 21 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy everything
COPY . .

# Fix Maven permission issue
RUN chmod +x mvnw

# Build the Spring Boot app
RUN ./mvnw clean package -DskipTests

# Run the final JAR
CMD ["java", "-jar", "target/*.jar"]
