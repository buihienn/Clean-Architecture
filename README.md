# Clean-Architecture

- This is a demo project for implementing Clean Architecture using Spring Boot.
- Clean Architecture principles.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/username/CleanArchitecture.git
2. Navigate to the project directory:
   - cd Clean-Architecture
3. Run the application:
   - ./mvnw spring-boot:run

## Cấu trúc thư mục mẫu:
```
src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   ├── demo/
│   │   │   │   ├── CleanArchitecture/
│   │   │   │   │   ├── api/                # Layer API (Controllers, DTOs)
│   │   │   │   │   │   ├── UserController.java
│   │   │   │   │   │   ├── dto/
│   │   │   │   │   │   │   ├── UserDTO.java
│   │   │   │   │   ├── app/                # Layer Application (Use Cases, Services, Mappers)
│   │   │   │   │   │   ├── services/
│   │   │   │   │   │   │   ├── UserService.java
│   │   │   │   │   │   │   ├── servicesImplement/
│   │   │   │   │   │   │   │   ├── UserServiceImplement.java
│   │   │   │   │   │   ├── mapper/
│   │   │   │   │   │   │   ├── UserMapper.java
│   │   │   │   │   │   │   ├── UserMapperImplement.java
│   │   │   │   │   ├── domain/             # Layer Domain (Entities, Repositories)
│   │   │   │   │   │   ├── entities/
│   │   │   │   │   │   │   ├── User.java
│   │   │   │   │   │   ├── repositories/
│   │   │   │   │   │   │   ├── UserRepository.java
│   │   │   │   │   ├── infrastructure/     # Layer Infrastructure (Database, External Services)
│   │   │   │   │   │   ├── repositories/
│   │   │   │   │   │   │   ├── MySQLUserRepository.java
│   │   │   │   │   │   │   ├── InMemoryUserRepository.java
