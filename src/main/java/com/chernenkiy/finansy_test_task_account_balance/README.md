# API для управления балансами и транзакциями

Spring Boot приложение для работы с финансовыми балансами и операциями.

## Возможности

- Создание и обновление счетов
- Внесение и снятие средств
- История транзакций
- Поддержка мультивалютности (USD, EUR, BYN, RUB)


- Maven 2.6+
- PostgreSQL 14+ (или Docker)

## Установка

### 1. Клонирование репозитория
```bash

git clone https://github.com/ваш-репозиторий/Finansy-Test-task-Bank-Account.git
cd balance-api

Создайте файл application.properties в src/main/resources:
### 2. Настройка базы данных
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/BankAccount
spring.datasource.username=Nikita
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.open-in-view=true
spring.liquibase.change-log=classpath:liquibase/changelog-master.yml

### 3. Запуск приложения
```bash
mvn spring-boot:run
```
## API Endpoints

### Управление счетами


| Метод | Эндпоинт                       | Описание                      |
|-------|--------------------------------|-------------------------------|
| POST  | `/api/v1/accounts`             | Создать новый счет            |
| GET   | `/api/v1/accounts/{accountId}` | Получить информацию о счете   |

### Операции

| Метод | Эндпоинт                                    | Описание                     |
|-------|---------------------------------------------|------------------------------|
| POST  | `/api/v1/accounts/{accountId}/deposits`     | Внесение средств             |
| POST  | `/api/v1/accounts/{accountId}/wthdraws`     | Снятие средств               |
| GET   | `/api/v1/accounts/{accountId}/transactions` | Получить историю операций    |

Технологии

Spring Boot — основной фреймворк для разработки приложения

Spring Data JPA — для работы с базой данных через JPA

PostgreSQL — база данных для хранения информации о счетах и транзакциях

MapStruct — для маппинга между сущностями и DTO

Lombok — для упрощения кода (генерация геттеров, сеттеров и других методов)

SpringDoc OpenAPI — для генерации документации API