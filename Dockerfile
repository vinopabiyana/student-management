FROM eclipse-temurin:24-jdk-alpine

ADD target/student_management.jar student_management.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar","student-management.jar"]