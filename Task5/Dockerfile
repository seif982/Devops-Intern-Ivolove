# Stage 1: البناء باستخدام صورة مافن رسمية وموجودة
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app

# نسخ الملفات
COPY pom.xml .
COPY src ./src

# تنفيذ البناء
RUN mvn clean package -DskipTests

# Stage 2: التشغيل باستخدام صورة جافا رشيقة وموجودة
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# نسخ الملف من المرحلة الأولى
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]