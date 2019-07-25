# Retail Store API App #

## Version ##

`0.0.1`

## Summary ##

This application calculate the net amount payable by the customer after deduction of different discount schemes.

* [Prerequisites](#markdown-header-prerequisites)
* [Build](#markdown-header-build)
* [Test](#markdown-header-test)
* [Run](#markdown-header-run)
* [Author](#markdown-header-author)

## Prerequisites ##

Ensure local installation of following softwares/tools:

* JDK - 1.8
* Git (2.9.0 or higher) - only for cloning project from repository
* Apache Maven (3.3.9 or higher)


## Build

Open your command/shell terminal

Clone locally, an appropriate version of sample-test from [git](https://github.com/sammeraj/xebia).

Execute standard maven command to build and install library:

~~~bash
# CD into project folder

# Build package(downloading dependencies)
mvn clean install
~~~
Verify that it generates below artifacts:

* ./target/test-*.jar

---

## Test

This api can be tested using below url.

`http://localhost:8080/getBill/1245`


---

## Run

Local

```
# java -jar <JAR_NAME>.jar

java -jar test/target/test-0.0.1-SNAPSHOT.jar

```

## Author ##

Meraj Ahmad
