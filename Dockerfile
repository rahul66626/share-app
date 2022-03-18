FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/share-app-*.jar share-app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/share-app.jar"]