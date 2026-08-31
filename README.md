# AuraFit Backend Ecosystem 🏃‍♂️☁️

A highly scalable, cloud-native REST API built to serve the AuraFit mobile application. This backend handles user authentication, secure data persistence, and fitness telemetry routing.

## 🏗️ Architectural Overview
This system is engineered with a focus on zero-downtime deployment, secure environment variable injection, and decoupled microservice architecture. It is fully containerized to ensure a strict "Build Once, Run Anywhere" standard.

## 💻 Tech Stack
*   **Core Framework:** Java 21, Spring Boot 3.x
*   **Security:** Spring Security, JJWT (JSON Web Tokens)
*   **Database:** PostgreSQL (Neon Cloud)
*   **ORM:** Spring Data JPA, Hibernate
*   **Deployment:** Docker, Render Cloud
*   **API Documentation:** Swagger UI / OpenAPI 3.0

## 🔐 Security Features
*   Stateless JWT-based authentication for mobile client requests.
*   100% isolation of cryptographic secrets and database credentials using Runtime Environment Variables (no hardcoded secrets).
*   Configured SLF4J logging for secure, non-leaking error monitoring.

## 🚀 How to Run Locally (Using Docker)
To run this application on your local machine without installing Java or PostgreSQL, you only need Docker.

**1. Pull and Run the Container:**
Execute the following command in your terminal. Replace the `YOUR_...` placeholder values with your actual Neon database credentials and JWT secret.

```powershell
docker run -p 8081:8080 `
  -e DB_URL="jdbc:postgresql://your-neon-url" `
  -e DB_USER="your-db-username" `
  -e DB_PWD="your-db-password" `
  -e aurafit.app.jwtSecret="your-base64-encoded-secret" `
  -e aurafit.app.jwtExpirationMs="172800000" `
  -d bhush007/aurafit-backend:latest
