FROM openjdk:8
COPY target/spring-boot-jenkinsfile-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8000
WORKDIR /app
CMD /bin/bash -c 'java -jar spring-boot-jenkinsfile-0.0.1-SNAPSHOT.jar'