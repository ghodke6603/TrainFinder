# 🚆 Train Finder – Full Stack Train Search System

Train Finder is a **full-stack web application** that allows users to search for trains, get train details, and view routes using a clean frontend and a powerful Spring Boot backend API.

This project uses:

* **Spring Boot** for backend REST APIs
* **HTML, CSS, JavaScript** for frontend UI
* **MySQL** for database
* API tested using **Postman**

---

## 🌟 Features

### 🔧 Backend (Spring Boot)

* REST APIs to fetch:

  * Train details
  * Train list
  * Train route
* Built using Spring Boot, JPA, MySQL
* JSON responses verified using Postman
* Organized service + repository + controller architecture

### 🎨 Frontend

* Simple and responsive UI (HTML/CSS/JS)
* Train search form
* Displays train information fetched from backend API
* Clean UI for displaying data

---

## 🛠️ Tech Stack

### Backend

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **MySQL Database**

### Frontend

* **HTML5**
* **CSS3**
* **JavaScript**

Tools:

* **Postman** (API testing)
* **IntelliJ IDEA** (Backend development)
* **VS Code** (Frontend development)

---

## 📂 Project Structure

```
TrainFinder/
│
├── backend/
│   ├── src/main/java/com/trainFinder/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── entity/
│   │   └── TrainFinderApplication.java
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   └── data.sql (optional)
│   └── pom.xml
│
├── frontend/
│   ├── Index.html
│   ├── style.css
│   ├── script.js
│
└── trainFinder.sql
```

> 📌 **Train/** folder contains your backend code created in IntelliJ.

---

## 🚀 How to Run the Project

### ▶ Backend (Spring Boot)

1. Import project in IntelliJ IDEA
2. Configure database in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/trainfinder
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. Run the Spring Boot application:

```
TrainFinderApplication.java
```

4. Test API in **Postman**:

### 📡 Example API Endpoints

#### 🔹 Get All Trains

```
[GET http://localhost:8080/search/by-code?sourceCode=${sourceCode}&destinationCode=${destinationCode})]
```

## ▶ Frontend

1. Open `Index.html` in your browser
2. The frontend uses JavaScript to call the backend API
3. Search train → data fetched from Spring Boot → displayed in UI

---

## 🖼️ Screenshots

> 📌 *Upload your images into an `/images` folder inside the repo.*

### 🌐 Home Page

![Home Page](./images/homepage.png)

### 🔍 API Response (Postman)

![Postman API](./images/ApiImage.png)

### 📄 Train Details UI

![Train Result](./images/TrainDetaiks.png)

---

## 📘 How It Works

1. Frontend sends a request to backend API (Spring Boot)
2. Backend fetches data from the MySQL database
3. Response returned in JSON
4. JavaScript displays the result on the webpage

---

## 🧩 Future Enhancements

* Live train tracking API
* PNR Status Checker
* JWT Authentication for secure access
* React/Angular frontend upgrade
* Docker deployment

---

## 👨‍💻 Author

**Laxman Ghodke**
📌 GitHub: [https://github.com/ghodke6603](https://github.com/ghodke6603)

---

## ⭐ Support

If this project helped you, please give it a **⭐ star** on GitHub!

---

