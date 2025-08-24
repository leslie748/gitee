# 第一阶段：构建Spring Boot应用
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
# 下载依赖
RUN mvn dependency:go-offline
COPY src ./src
# 构建JAR包
RUN mvn package -DskipTests

# 第二阶段：运行应用
FROM openjdk:17-jdk
WORKDIR /app
# 从构建阶段复制JAR包
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
    