# Spring Boot Student API

A demo project showcasing a secure RESTful Student API built with **Spring Boot**, **JPA**, **H2 Database (in-memory)**, **Swagger (OpenAPI)** for documentation, and **Docker** support for easy deployment.

---

## ✨ Features

- **List All Students:** View student records with name and passport number
- **Update Student:** Edit a student’s name and passport (by ID)
- **In-memory H2 Database:** Loaded with 50+ demo students at startup
- **API Documentation:** Swagger UI auto-generated docs and try-out (no code or curl needed)
- **H2 Console:** Visual database browser at `/h2-console`
- **Basic Authentication:** HTTP Basic Auth for API endpoints
- **Demo Home Page:** Friendly index at `/` with project links & instructions
- **Docker Ready:** One-step container build & portability
- **Clean Code:** Simple structure and easy to extend

---

## 🏗️ Project Structure

src/
├── main/
│ ├── java/com/example/
│ │ ├── SpringBoot2JPAWithHibernateAndH2Application.java
│ │ ├── SecurityConfig.java
│ │ ├── OpenApiConfig.java (if OpenAPI security - optional)
│ │ └── student/
│ │ ├── Student.java
│ │ ├── StudentController.java
│ │ └── StudentRepository.java
│ └── resources/
│ ├── application.properties
│ ├── data.sql
│ └── static/index.html
├── test/... (standard Spring Boot tests)
Dockerfile
pom.xml
README.md

---

## 🚀 Quick Start

### 1. **Run Locally (with Maven & Java 21+)**

Build the project
mvn clean package
Run the JAR
java -jar target/spring-boot-jpa-hibernate-h2-\*.jar
text

- Visit: [http://localhost:8080/](http://localhost:8080/)
- Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

### 2. Run with Docker

Build Docker image
docker build -t springboot-student-api .
Run the container
docker run -p 8080:8080 springboot-student-api
text

_Note: Works identically in Docker locally and in cloud platforms (Render, etc.)_

---

## 🛡️ API Security

- Endpoints under `/students` require HTTP Basic Auth.
- **Demo credentials:**
  - Username: `demo`
  - Password: `demo`
- Enter credentials when prompted or use the "Authorize" (lock) button in Swagger UI.

---

## 📖 How to Use

### Major Endpoints

| Method | Endpoint         | Description                 | Auth Required? |
| ------ | ---------------- | --------------------------- | :------------: |
| GET    | `/students`      | List all students           |       ✅       |
| PUT    | `/students/{id}` | Update student's info by ID |       ✅       |

### Sample `data.sql` Content

- Loads >50 students on app start, for real data demo.

---

## 🗃️ Developer Tools

- **Swagger UI:**
  Interactive docs — test every endpoint in browser.

- **H2 Console:**
  Explore the in-memory DB at `/h2-console`

  **Settings for login:**

  - JDBC URL: `jdbc:h2:mem:testdb`
  - User Name: `sa`
  - Password: _(leave blank)_

---

## 🌐 Demo & Links

- **Home Page:** `/` — intro, features, usage and navigation
- **API Docs:** `/swagger-ui/index.html`
- **H2 Console:** `/h2-console`
- **Live Example:** _[Add your Render or other deployment link here if public]_
- **Source Code:** [github.com/TST14/springboot-jpa-hibernate-h2](https://github.com/TST14/springboot-jpa-hibernate-h2)

---

## 🛠️ Developer Setup Notes

- Built for Java 21 and Maven 3.9+
- Easily portable to any containerized hosting (free on Render)
- All configuration is in `application.properties`
- Security via Spring Security, can be enhanced for JWT/OAuth later

---

## 💡 Customization

- Add more API endpoints: `POST`, `DELETE`
- Switch H2 to persistent or remote DB
- Add OpenAPI security schemes in Swagger UI by editing annotations/config
- Extend Student fields for richer data models

---

## 📜 License

This project is open-source; feel free to use, fork, and modify for learning and demo purposes.

---

_Developed by [TST14](https://github.com/TST14)._
