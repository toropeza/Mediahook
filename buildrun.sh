#!/usr/bin/bash

# Package Jar
echo Building Package...
mvn package

# Run App
java -jar target/swagger-spring-1.0.0.jar