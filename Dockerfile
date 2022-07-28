# syntax = docker/dockerfile:1.3-labs
# NOTE: the above syntax line has special meaning and is not a comment

FROM ubuntu:22.04
SHELL ["/bin/bash", "-c"]
RUN apt-get update && apt-get install -y openjdk-18-jdk vim make
ENV JAVA_HOME=/usr/lib/jvm/java-18-openjdk-amd64
WORKDIR /code
