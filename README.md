# ONLINE-MARKETPLACE
### Online Marketplace backend API built using Spring Boot, Spring Security, Spring Data JPA with MySQL, MongoDB, Event Driven Architecture with Kafka, Resiliency of Synchronous communication using Resilience 4j, and SCM using Git. 

<img width="807" alt="Screenshot 2023-07-14 at 6 29 52 PM" src="https://github.com/amoghabn/online-marketplace/assets/112653296/4514a76b-8239-488c-a649-e1eea7965194">

# Steps to run in Local machine
#### 1. Setup MySQL DB (To be utilized by Order Service and Inventory Service)
#### 2. Setup MongoDB (To be utilized by Product Service)
#### 3. Run Discovery server
#### 4. Run API Gateway
#### 5. Run Product Service
#### 6. Run Inventory Service
#### 7. Run Order Service
#### 8. Run Notificatoin Service 
#### 9. Login to Eureka Server(Discovery Server with username:eureka password:password) can see the status of all microservices.
#### 10. To Use Zookeeper, kafka and Keycloak can make use of Docker compose and run `docker compose up -d`
#### 11. login to keycloak and do the realm settings and with the help of authorization token, link postman and generate access token using the auth token from keycloak. 
#### 12. Now We can test using GET and POST methods from postman and check the functionalities of product service, order service, notification service and inventory service.

### Complete Dockerization IN PROGRESS
