
#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER saipavan9594

# Add the application's jar to the container
COPY target/section11-accounts-0.0.1-SNAPSHOT.jar section11-accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/section11-accounts-0.0.1-SNAPSHOT.jar"]
