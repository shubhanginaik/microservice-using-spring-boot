# Project Name

## Description
This project is a simple microservice architecture using Spring Boot. 
It consists of a Eureka server, a Config server, an API Gateway, a Department service, and an Employee service. 
The Eureka server is used for service discovery, the Config server is used for externalized configuration, 
the API Gateway is used for routing requests to the appropriate service, the Department service is used to manage departments, 
and the Employee service is used to manage employees.

First I have created a servise-registry using Eureka server. Then I have created a config-server to store the configuration of all the services. 
Then I have created a department-service and employee-service. 
Finally I have created a api-gateway to route the requests to the appropriate service.


## Features
- api-gateway
- config-server
- department-service
- employee-service
- eureka-server

## how to run
-open the services one by one rather than opening spring-boot-microservice folder directly.
- left side of the project you can see maven, click '+' sign to open each service, and then run the services.

## Technologies
- Java
- Spring Boot
- Spring Cloud
- Eureka
- Config Server
- API Gateway
- Zipkin

## Installation
To install and run this project, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/shubhanginaik/microservice-using-spring-boot.git
    ```
2. Navigate to the project directory:
    ```sh
    cd your-repo
    ```
3. Build the individual projects using Maven:
    ```sh
    mvn clean install
    ```

## Usage
First start the Eureka server, then start the config server, and finally start the other services.

## Contributing
Guidelines for contributing to the project.

## Credits
like to thank my mentor and the entire team at Tech Elevator for their support and guidance.
[Link to the project's license.](https://www.youtube.com/watch?v=HFl2dzhVuUo)

## License
This project is licensed under the MIT License - see the `LICENSE` file for details.