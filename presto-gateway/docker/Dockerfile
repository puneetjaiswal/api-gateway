# Docker-Build to be ran from directory presto-gateway

FROM openjdk:8-jdk-alpine

ENV PRESTO_GATEWAY_VERSION 2.0.0-jar-with-dependencies 

RUN mkdir -p /opt/gateway/conf

COPY gateway-ha-config.yml /opt/gateway/conf
COPY target/presto-gateway-${PRESTO_GATEWAY_VERSION}.jar /opt/gateway

ENTRYPOINT["entrypoint.sh"]

