FROM openjdk:17-alpine
LABEL authors="MQa010225"

USER root

WORKDIR /opt/mom
ExPOSE 8080

COPY./target/mom-0.0.1-SNAPSHOT.jar /opt/mom/mom.jar

RUN adduser -D -u 1000 mom

