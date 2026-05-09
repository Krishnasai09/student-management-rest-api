# API Documentation

## Base URL

```bash
http://localhost:9090
```

---

# Register Student

## Endpoint

```bash
POST /registerStudent
```

## Request Body

```json
{
  "name": "Ravi",
  "mobile": 12345
}
```

## Success Response

```json
{
  "id": 1,
  "name": "Ravi",
  "mobile": 12345
}
```

## Status Code

```bash
200 OK
```

---

# Get All Students

## Endpoint

```bash
GET /getDetails
```

## Success Response

```json
[
  {
    "id": 1,
    "name": "Ravi",
    "mobile": 12345
  },
  {
    "id": 2,
    "name": "Likhita",
    "mobile": 12345
  }
]
```

## Status Code

```bash
200 OK
```

---

# Get Student By ID

## Endpoint

```bash
GET /getStudentById/{id}
```

## Example

```bash
GET /getStudentById/1
```

## Success Response

```json
{
  "id": 1,
  "name": "Ravi",
  "mobile": 12345
}
```

## Status Code

```bash
200 OK
```

---

# Update Student

## Endpoint

```bash
PUT /updateStudent/{id}
```

## Example

```bash
PUT /updateStudent/1
```

## Request Body

```json
{
  "name": "Updated Ravi",
  "mobile": 678910
}
```

## Success Response

```json
{
  "id": 1,
  "name": "Updated Ravi",
  "mobile": 678910
}
```

## Status Code

```bash
200 OK
```

---

# Delete Student

## Endpoint

```bash
DELETE /deleteStudent/{id}
```

## Example

```bash
DELETE /deleteStudent/1
```

## Success Response

```json
{
  "message": "Student deleted successfully"
}
```

## Status Code

```bash
200 OK
```

---

# Exception Handling

Implemented centralized exception handling using:

- `@RestControllerAdvice`
- Custom Exceptions
- Structured JSON Error Responses
- HTTP Status Codes

## Custom Exceptions Used

- `StudentIdNotFoundException`
- `RegisterStudentInvalidDataException`
- `InvalidUpdateStudentException`

## Example Error Response

```json
{
  "message": "Id Not Found",
  "status": 404
}
```

---

# Database Integration

The application uses MySQL database integration with Spring Data JPA for storing and managing student records.

## Database Table

Table Name:

```bash
student_table_jpa1
```

## Sample Stored Records

| id  | mobile | name     |
| --- | ------ | -------- |
| 1   | 12345  | Krishna  |
| 2   | 12345  | Likhita  |
| 3   | 678910 | Kamesh   |
| 4   | 678910 | Sharmila |
| 5   | 12345  | Pavan    |

---

# API Screenshots

## Register Student API

![Register Student](../screenshots/register-student.png)

---

## Get All Students API

![Get All Students](../screenshots/get-all-students.png)

---

## Get Student By ID API

![Get Student By ID](../screenshots/get-student-by-id.png)

---

## Update Student API

![Update Student](../screenshots/update-student.png)

---

## Delete Student API

![Delete Student](../screenshots/delete-student.png)

---

## Exception Handling Response

![Exception Response](../screenshots/exception-response.png)

---

## MySQL Database Table

![MySQL Table](../screenshots/mysql-student-table.png)

---

# Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST APIs
- Postman
- Git & GitHub
