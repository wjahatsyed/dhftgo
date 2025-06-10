# 🚀 Delivery Hero Replica (Foodpanda Clone) - Fullstack Microservices System

A comprehensive, production-grade clone of Delivery Hero / Foodpanda built with modern technologies and architecture patterns, based on *Chris Richardson's Microservices Patterns*. This project includes a Java/Kotlin backend, React-based admin frontend, Kotlin Android app, Kubernetes deployment, and DevOps automation.

---

## 🧠 Project Vision

This monorepo demonstrates a complete microservices-based food delivery platform — covering customer ordering, restaurant/vendor management, rider delivery coordination, and payment processing — following best practices in scalability, observability, and cloud-native design.

---

## 🏗️ Architecture Overview

- **Microservices-based backend**: Spring Boot (Java + Kotlin)
- **Frontend admin portal**: React + TypeScript
- **Android mobile app**: Kotlin + Jetpack
- **Service communication**: REST, Kafka/RabbitMQ
- **Authentication**: Keycloak + JWT + OAuth2
- **Orchestration**: Kubernetes + Helm + GitHub Actions
- **Event-driven**: SAGA, CQRS, Event Sourcing

---

## 🛠️ Tech Stack

| Layer       | Technologies |
|-------------|--------------|
| Backend     | Java 17, Spring Boot, Spring Cloud, Kafka, RabbitMQ, PostgreSQL, Redis |
| Frontend    | React, TypeScript, TailwindCSS |
| Android     | Kotlin, Jetpack, Retrofit, Room, Firebase |
| Security    | Keycloak, OAuth2, JWT |
| DevOps      | Docker, Kubernetes, Helm, GitHub Actions, Terraform |
| Observability | Prometheus, Grafana, Micrometer, Jaeger |

---

## 📦 Monorepo Structure

delivery-hero-clone/
├── backend/
│ ├── api-gateway/
│ ├── auth-service/
│ ├── order-service/
│ ├── payment-service/
│ ├── delivery-service/
│ ├── vendor-service/
│ ├── notification-service/
│ ├── inventory-service/
│ └── common-libs/
├── frontend/
│ └── admin-ui/
├── android/
│ └── customer-app/
├── deploy/
│ ├── docker/
│ ├── kubernetes/
│ └── helm/
├── docs/
│ └── architecture/
└── README.md

yaml
Copy
Edit

---

## 🔄 Key Features

- ✅ Reactive Order and Delivery flow with Saga pattern (choreography + orchestration)
- ✅ JWT-based secure login via Keycloak
- ✅ Async message processing via RabbitMQ
- ✅ CI/CD with GitHub Actions & K8s deployment
- ✅ Dockerized services with Helm charts
- ✅ Native Android app for customer orders

---

## 🚧 Project Roadmap

### Phase 1: Foundations & Auth
- [ ] Create base project structure and services
- [ ] Implement AuthService (Keycloak integration)
- [ ] Setup PostgreSQL and Redis
- [ ] Dockerize services
- [ ] Create GitHub Actions CI pipeline

### Phase 2: Core Ordering Flow
- [ ] OrderService with REST APIs
- [ ] VendorService for menu & fulfillment
- [ ] PaymentService with mock gateway
- [ ] DeliveryService with rider assignment
- [ ] Implement Saga (Order-Payment-Delivery)

### Phase 3: Frontend & Android
- [ ] Admin Panel (React + Tailwind)
- [ ] Android App (Kotlin + Jetpack)
- [ ] Firebase push notifications
- [ ] JWT integration in both clients

### Phase 4: DevOps & Observability
- [ ] Helm Charts + Kubernetes deployment
- [ ] Prometheus + Grafana setup
- [ ] Jaeger for distributed tracing
- [ ] Terraform for cloud provisioning (optional)

---

## 🧪 Test Strategy

- Unit & Integration Testing (JUnit, Mockito)
- End-to-End Testing with TestContainers
- Android UI Testing with Espresso
- CI-based test automation

---

## 🤝 Contributions

You're welcome to contribute! Fork the repo, raise an issue, or submit a PR. Let's build this like a real product.

---

## 📜 License

This project is open-source under the MIT License.
