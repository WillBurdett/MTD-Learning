FROM openjdk:8-jdk-alpine
ENV MONGO_DB_USERNAME=rootuser \
    MONGO_DB_PWD=rootpass
COPY  target/MTD-learning-0.0.1-SNAPSHOT.jar MTD-learning-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/MTD-learning-0.0.1-SNAPSHOT.jar"]