FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/brief-service.jar app.jar
COPY wait-for-mysql.sh wait-for-mysql.sh

RUN apk add --no-cache bash mariadb-client
RUN chmod +x wait-for-mysql.sh

CMD ["./wait-for-mysql.sh", "mysql", "root", "root", "java", "-jar", "app.jar"]
