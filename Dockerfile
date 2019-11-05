FROM openjdk:8u171-jre-alpine AS base
WORKDIR /product-api
EXPOSE 8080

FROM maven:3.5-jdk-8 as maven
COPY ./pom.xml ./pom.xml
RUN mvn package
COPY ./src ./src
RUN mvn install -Dmaven.test.skip=true

FROM base AS final
COPY --from=maven target/products-api-1.0.0-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-jar", "products-api-1.0.0-SNAPSHOT.jar"]