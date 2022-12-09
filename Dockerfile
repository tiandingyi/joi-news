FROM openjdk:8-jdk-alpine

COPY joi-news-1.0-SNAPSHOT.jar /joi-news-1.0-SNAPSHOT.jar

EXPOSE 8092

ENTRYPOINT ["java", "-jar","/joi-news-1.0-SNAPSHOT.jar"]
