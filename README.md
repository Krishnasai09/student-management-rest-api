# Student Management REST API

A backend REST API application developed using Spring Boot and MySQL to manage student records with complete CRUD functionality, centralized exception handling, and RESTful architecture principles.

---

## Features

- Register Student
- Get All Students
- Get Student By ID
- Update Student
- Delete Student
- Global Exception Handling
- Structured JSON Error Responses
- HTTP Status Code Management
- MySQL Database Integration

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST APIs
- Postman
- Git & GitHub

---

## Project Architecture

```text
Client → Controller → Service → Repository → MySQL Database
```

---

## API Endpoints

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| POST   | /registerStudent     | Register Student  |
| GET    | /getDetails          | Get All Students  |
| GET    | /getStudentById/{id} | Get Student By ID |
| PUT    | /updateStudent/{id}  | Update Student    |
| DELETE | /deleteStudent/{id}  | Delete Student    |

---

## Exception Handling

Implemented centralized exception handling using:

- `@RestControllerAdvice`
- Custom Exceptions
- Structured JSON Error Responses
- HTTP Status Codes

### Custom Exceptions

- `StudentIdNotFoundException`
- `RegisterStudentInvalidDataException`
- `InvalidUpdateStudentException`

---

## API Documentation

Detailed API documentation available here:

[View API Documentation](docs/api-documentation.md)

---

## API Screenshots

### Register Student API

![Register Student](screenshots/register-student.png)

---

### Get All Students API

![Get All Students](screenshots/get-all-students.png)

---

### Get Student By ID API

![Get Student By ID](screenshots/get-student-by-id.png)

---

### Update Student API

![Update Student](screenshots/update-student.png)

---

### Delete Student API

![Delete Student](screenshots/delete-student.png)

---

### Exception Handling Response

![Exception Response](screenshots/exception-response.png)

---

### MySQL Database Table

![MySQL Database](screenshots/mysql-student-table.png)

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
- DTO Validation
- API Validation using Hibernate Validator

---

## Author

Krishna Sai
