
# **Back-End Migration to Spring Framework**

## **Overview**
This project involves migrating a legacy back-end system built in the early 1990s to a modern Spring framework. 

## **Features**
- **Spring Initializr setup with essential dependencies**: Spring Data JPA, Rest Repositories, MySQL Driver, and Lombok.
- **Organized package structure**: Controllers, entities, DAOs, and services.
- **Service layers and validation mechanisms** to ensure data integrity.
- **RESTful checkout controller** with cross-origin support.
- **Sample data insertion** to ensure persistent information.

## **Technologies Used**
- **Java**
- **Spring Framework**
- **MySQL**
- **Lombok**

## **What I Learned**
- **Spring Framework**: Gained proficiency in setting up and using Spring Boot, Spring Data JPA, and other related dependencies.
- **RESTful Services**: Developed and tested RESTful services for handling customer orders and ensuring smooth interaction between front-end and back-end.
- **Database Integration**: Integrated MySQL database with the Spring Boot application and implemented data persistence.
- **Code Organization**: Learned best practices for organizing code into controllers, services, DAOs, and entities.
- **Validation and Error Handling**: Implemented input validation and error handling to ensure data integrity and application stability.

  ## **How to Run**
1. **Clone the repository**:
    ```bash
    git clone <repository_url>
    cd Back-End programming
    ```

2. **Update application.properties**: Update the `application.properties` file with your MySQL database credentials.

3. **Build and run the project**:
    ```bash
    mvn spring-boot:run
    ```

4. **Access the application**: Open your browser and navigate to `http://localhost:8080`.
