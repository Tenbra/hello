FROM eclipse-temurin:17.0.17_10-jre-alpine-3.23
RUN mkdir /opt/app 
COPY target/hello*.jar /opt/app/hello.jar
CMD ["java", "-jar", "/opt/app/hello.jar"]