# Shipment Price Calculator
## Description
Shipment Price Calculator is a self-contained module for evaluating shipment prices onto given list of transactions.
It extracts base price and applies discount rules to it.
Rules that module applies:
* independently of supplier, the price for a small package is always the lowest one among all suppliers.
* every third large package for 'La Poste' is free, once per calendar month.
* there is a limit of how many discounts a user can get, limit is 10€.
These rules are applied when customer is from France.

## Requirements
To run the module on your machine, it must have either Java JDK 17+ and Maven or Docker installed.
Depending on your setup, follow the relevant instructions below.
The input file must contain one transaction per line.
Transaction format is `YYYY-MM-DD SIZE SUPPLIER`, where `SIZE` is `S`, `M` or `L` and `SUPPLIER` supplier's abbreviation in upper case.

## Running the solution
**Running with Java JDK + Maven**
1. navigate to project root directory. In this case it is `ShipmentDiscountModule`.
2. build the project, repo version contains only source code. Command below runs tests, then builds:\
`mvn clean package`\
To build without running tests:\
`mvn clean package -DskipTests`
3. run the JAR file.\
`java -jar target/ShipmentDiscountModule-1.0-SNAPSHOT.jar`

**Testing**\
To execute tests, inside the ./src/test/java directory run command\
`mvn test`

**Running with Docker**
1. build an image with command (instead of shipment_pricing_module any name will suffice)\
`docker build -t shipment_pricing_module:1.0 .`
2. run the container\
`docker run shipment_pricing_module:1.0`

To see the module's output, run the container in non-detached mode. Note that while the tests are executed during the image build, their output is not shown when running the container. However test report can be accessed in the directory _testReportHTML_, index.html (base report).

## Project structure
Project was created with maven build in mind, so structure itself follows it.
```
src/
┣━━━ main/
┃    ├──── java/        -> source code
┃    └──── resources/   -> file with transactions (input.txt)
┃
┗━━━ test/
     └──── java/        -> unit tests
```

## Notes
* The project reads input data from the file located at: `./src/main/resources/input.txt`. To run custom data edit this file.
* Correct input `2015-02-01 S MR` output after evaluation `2015-02-01 S MR 1.50 0.50`.
* Incorrect input `2015-02-29 CUSPS` output after evaluation `2015-02-29 CUSPS Ignored`.

**Author:** Darius Jomantas
