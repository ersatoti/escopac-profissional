# escopa-profissional

## Visão Geral

Projeto spring boot implementando generic-api subindo acoplado ao eureka server

## Build
* Requer [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

# maven
mvn install

# Configurações
Os parâmetros da aplicação estão presentes em [application.properties](./src/main/resources/application.properties)

# Run appliction docker

mvn clean package
mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

Run with docker-compose
docker-compose build && docker-compose up
