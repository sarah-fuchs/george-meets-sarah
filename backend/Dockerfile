FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests
RUN ls -la target
CMD ["java", "-jar", "target/george-meets-sarah-0.0.1-SNAPSHOT.jar"]
