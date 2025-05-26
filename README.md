# microService
# Overview

The Quiz Microservice is a scalable, RESTful service built using Java and Spring Boot, designed to manage quiz-related functionalities. It consists of two core services: Quiz Service and Question Service, each interacting with separate PostgreSQL databases (Quiz DB and Question DB). The Quiz Service allows users to create quizzes by selecting questions from the Question DB, while the Question Service manages question creation and retrieval. The architecture leverages Service-Oriented Architecture (SOA) and Microservices principles, utilizing Eureka for service registry, API Gateway for routing, and OpenFeign for inter-service communication. All components are organized in separate classes/packages for modularity and maintainability, with optimized RESTful APIs for high performance.

# Features

Quiz Service: Create, retrieve, update, and delete quizzes, storing quiz metadata in the Quiz DB and referencing questions from the Question DB.

Question Service: Manage questions (create, retrieve, update, delete) stored in the Question DB.

Service Registry: Eureka Server for dynamic service discovery.

API Gateway: Centralized routing for all API requests.

OpenFeign: Declarative client for communication between Quiz Service and Question Service.

Optimized APIs with efficient database queries and lightweight JSON payloads.

Scalable microservice architecture for independent deployment and integration.

# System Architecture

Quiz Service: Handles quiz creation by allowing users to select questions from the Question DB via the Question Service. Stores quiz metadata in the Quiz DB.

Question Service: Manages question data in the Question DB, providing APIs for question operations.

Quiz DB: PostgreSQL database storing quiz metadata (e.g., quiz title, selected question IDs).

Question DB: PostgreSQL database storing question data (e.g., question text, options, correct answer).

Eureka Server: Registers Quiz Service and Question Service for discovery.

API Gateway: Routes external requests to the appropriate service.

OpenFeign: Enables Quiz Service to call Question Service APIs for fetching questions.

**quiz-microservice/
├── quiz-service/
│   ├── src/main/java/com/example/quiz/
│   │   ├── controller/      # REST controllers for quiz APIs
│   │   ├── service/         # Business logic for quiz operations
│   │   ├── repository/      # Data access for Quiz DB (PostgreSQL)
│   │   ├── model/           # Quiz entity classes
│   │   ├── feign/           # OpenFeign client for Question Service
│   ├── src/main/resources/
│   │   ├── application.yml  # Quiz Service configuration
├── question-service/
│   ├── src/main/java/com/example/question/
│   │   ├── controller/      # REST controllers for question APIs
│   │   ├── service/         # Business logic for question operations
│   │   ├── repository/      # Data access for Question DB (PostgreSQL)
│   │   ├── model/           # Question entity classes
│   ├── src/main/resources/
│   │   ├── application.yml  # Question Service configuration
├── api-gateway/
│   ├── src/main/java/com/example/gateway/
│   │   ├── config/          # Gateway routing configuration
│   ├── src/main/resources/
│   │   ├── application.yml  # API Gateway configuration
├── service-registry/
│   ├── src/main/java/com/example/eureka/
│   ├── src/main/resources/
│   │   ├── application.yml  # Eureka Server configuration
├── pom.xml                   # Maven dependencies (parent/child modules)
├── README.md                 # This file**
