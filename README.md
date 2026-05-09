# Student Management REST API

A backend REST API application developed using Spring Boot and MySQL to manage student records with complete CRUD functionality, centralized exception handling, and RESTful architecture principles.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST APIs
- Postman

---

## Features

- Register Student
- Get All Students
- Get Student By ID
- Update Student
- Delete Student
- Global Exception Handling
- Structured API Error Responses
- HTTP Status Code Management

---

## Project Architecture

Controller Layer → Service Layer → Repository Layer → MySQL Database

---

## API Endpoints

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| POST   | /students      | Register Student  |
| GET    | /students      | Get All Students  |
| GET    | /students/{id} | Get Student By ID |
| PUT    | /students/{id} | Update Student    |
| DELETE | /students/{id} | Delete Student    |

---

## Exception Handling

Implemented centralized exception handling using:

- `@RestControllerAdvice`
- Custom Exceptions
- Structured Error Responses
- HTTP Status Codes

Example exceptions:

- StudentIdNotFoundException
- RegisterStudentInvalidDataException
- InvalidUpdateStudentException

---

## Tools Used

- Spring Tool Suite / VS Code
- Postman
- MySQL Workbench
- Git & GitHub

---

## Future Enhancements

- Swagger API Documentation
- JWT Authentication
- Role-Based Authorization
- Docker Deployment
- Validation using DTOs

---

## Author

Ravi Lingeswara Krishna Sai
