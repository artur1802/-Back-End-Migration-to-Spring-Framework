
# **Back-End Migration to Spring Framework**

## **Overview**
This project is a backend migration application for a travel agency, transitioning from a deprecated legacy system to a modern backend using the Spring framework. The backend supports a front-end Angular application that allows users to select vacation destinations, add excursions, and view the total price for the excursions. 

## **Screenshots**
**Frontend Interface**

![Screenshot 2024-08-03 140223](https://github.com/user-attachments/assets/48e2eae8-3bda-4fe5-9d86-6caa11e16a17)

**Add Customer:**

![Screenshot 2024-08-03 140315](https://github.com/user-attachments/assets/cea03ccb-0f9b-4df4-8ae3-5bebf83148ee)

**Select Vacation Country:**

![Screenshot 2024-08-03 140402](https://github.com/user-attachments/assets/481f0af3-034b-4529-b3f9-21a26feb278e)

**Add Excursion and View Price:**

![Screenshot 2024-08-03 140425](https://github.com/user-attachments/assets/f2198742-ddd9-4320-a0eb-b540338d9018)

![Screenshot 2024-08-03 140442](https://github.com/user-attachments/assets/263fa521-dd44-4ed2-ae11-86c0500617dd)

**Order Tracking Number**

![Screenshot 2024-08-03 140604](https://github.com/user-attachments/assets/7feb5186-f4af-44d1-901f-c44fe2ed075e)

## **Features**
- **Spring Initializr setup with essential dependencies**: Spring Data JPA, Rest Repositories, MySQL Driver, and Lombok.
- **Organized package structure**: Controllers, entities, DAOs, and services.
- **Service layers and validation mechanisms** to ensure data integrity.
- **RESTful checkout controller** with cross-origin support.
- **Sample data insertion** to ensure persistent information.

## **Technologies Used**
- **Spring Framework:** For building the backend application.
- **Spring Data JPA:** For data persistence and interactions.
- **MySQL:** Database for storing customer and booking data.
- **Lombok:** To reduce boilerplate code in Java classes.
- **Angular:** Front-end framework for the application.

## **What I Learned**
- **Spring Framework**: Gained proficiency in setting up and using Spring Boot, Spring Data JPA, and other related dependencies.
- **RESTful Services**: Developed and tested RESTful services for handling customer orders and ensuring smooth interaction between front-end and back-end.
- **Database Integration**: Integrated MySQL database with the Spring Boot application and implemented data persistence.
- **Code Organization**: Learned best practices for organizing code into controllers, services, DAOs, and entities.
- **Validation and Error Handling**: Implemented input validation and error handling to ensure data integrity and application stability.
- **Frontend and Backend Integration**: Enhanced understanding of connecting Angular frontends with Spring backends.

  ## **How to Run**
1. **Clone the repository**:
    ```bash
    git clone <repository_url>
    cd Back-End programming
    ```

2. **Update application.properties**: Update the `application.properties` file with your MySQL database credentials.

3. **Build and run the project (backend programming folder**:
    ```bash
    mvn spring-boot:run
    ```

  3. **Build and run the project (Frontend programming folder**:
    ```bash
    ng serve
    ```

5. **Access the application**: Open your browser and navigate to `http://localhost:4200`.
