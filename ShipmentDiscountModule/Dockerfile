FROM maven:3.8.5-openjdk-17-slim AS build
COPY pom.xml /usr/sourceCode/pom.xml
COPY src/ /usr/sourceCode/src
WORKDIR /usr/sourceCode
RUN mvn clean package

FROM eclipse-temurin:17-jre-alpine
WORKDIR /usr/app
COPY --from=build /usr/sourceCode/target/ShipmentDiscountModule-1.0-SNAPSHOT.jar /usr/app/ShipmentDiscountModule-1.0-SNAPSHOT.jar
CMD ["java","-jar","/usr/app/ShipmentDiscountModule-1.0-SNAPSHOT.jar"]
