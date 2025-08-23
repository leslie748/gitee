FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY src ./src
COPY pom.xml .

# 增加打包过程的详细输出，便于排查问题
RUN mvn clean package -DskipTests -X && \
    ls -l /app/target/  # 列出target目录内容，确认JAR是否生成

FROM openjdk:17-jdk
WORKDIR /app

# 使用通配符匹配JAR文件，避免文件名版本问题
COPY --from=build /app/target/*.jar /app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
    