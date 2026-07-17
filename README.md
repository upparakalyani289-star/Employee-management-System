# Employee Management System

## Project Description
A Spring Boot CRUD application to manage employee records using Spring Boot, Spring Data JPA, and MySQL. This project provides REST APIs to create, read, update, and delete employee details.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Features
- Add Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee

## API Endpoints

### Create Employee
POST /api/employees

### Get All Employees
GET /api/employees

### Get Employee By ID
GET /api/employees/{id}

### Update Employee
PUT /api/employees/{id}

### Delete Employee
DELETE /api/employees/{id}

## How to Run

1. Clone the repository.
2. Configure MySQL database.
3. Update `application.properties`.
4. Run `EmployeeManagementSystemApplication.java`.
5. Test APIs using Postman.

---

## Screenshots

### POST API
![POST API](screenshots/Screenshot%202026-07-17%20115540.png)

### GET API
![GET API](screenshots/Screenshot%202026-07-16%20141017.png)

### GET BY ID API
![GET BY ID API](screenshots/Screenshot%202026-07-17%20115444.png)

### PUT API
![PUT API](screenshots/Screenshot%202026-07-16%20135652.png)

### DELETE API
![DELETE API](screenshots/Screenshot%202026-07-17%20115708.png)

### Spring Boot Application Running
![Application Running](screenshots/Screenshot%202026-07-17%20115643.png)
