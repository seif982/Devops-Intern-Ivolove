# المرحلة الأولى: بناء التطبيق (لازم نسميها build)
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# المرحلة الثانية: التشغيل
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# هنا الدوكر هيفهم إن build هي المرحلة اللي فوق
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
