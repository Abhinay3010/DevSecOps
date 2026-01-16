FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./mvnw package || true
EXPOSE 8080
CMD ["java","-jar","target/user-service-1.0.0.jar"]
