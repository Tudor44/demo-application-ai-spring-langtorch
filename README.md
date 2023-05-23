# Demo chat with Spring Boot, OpenAI and Langtorch framework.

## Introduction

This project showcases a demo chat application using Java 17 and Spring Boot, with Langtorch an experimental Large Language Model framework for Java.

## Dependencies

- Java 17
- Spring Boot 3
- Langtorch 0.0.10


## Installation

In the following sections, you'll find instructions on setting up and running the project.

### Prerequisites

- Java 17
- An IDE that supports Spring Boot (like IntelliJ IDEA or Eclipse)

### Setup

1. Clone the repository to your local machine
2. Import the project into your chosen IDE
3. Ensure Java 17 is selected as the SDK
4. Configure the application properties adding your key:

    ```properties
    # application.properties
    spring.openai.key=YOUR_OPENAI_KEY
    ```

## Usage

To run the application, use the following command into the folder which :

```bash
./mvnw spring-boot:run -Dspring.config.location=application.properties
  ```


![Alt Text](https://im4.ezgif.com/tmp/ezgif-4-dce0c53428.gif)


## License

This project is licensed under the terms of the MIT license.
