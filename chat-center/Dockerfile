FROM openjdk:17

# 设置工作目录
WORKDIR /app

# 将本地的 JAR 文件复制到容器中
COPY chat-center.jar /app/chat-center.jar

# 暴露应用程序的端口（如果应用程序监听特定端口）
EXPOSE 8100

# 启动 Java 应用程序
CMD ["java", "-jar", "-Dspring.profiles.active=prod", "chat-center.jar"]