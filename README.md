
---

### 📘 `README.md`

```markdown
# 🎓 Student Management Console App

A **console-based Student Management System** built using the **Spring Framework** with Java-based configuration (no XML), component scanning, and dependency injection.

---

## 📦 Project Structure

```

student-management/
│
├── pom.xml
└── src/
└── main/
└── java/
└── com/
└── teamsmartworld/
├── Main.java
│
├── config/
│   └── ComponentScanConfig.java
│
├── data\_access/
│   ├── StudentDao.java
│   └── StudentDaoListImpl.java
│
├── models/
│   └── Student.java
│
└── services/
├── UserInputService.java
├── ScannerInputService.java
├── StudentManagement.java
└── StudentManagementConsoleImpl.java

````

---

## 🚀 Features

- Built with **Spring Core (DI/IoC)** using **Annotations**.
- Uses **Java Configuration Classes** – no XML required.
- Demonstrates **Constructor**, **Setter**, and **Field Injection**.
- Fully modular structure: DAO, Services, and Models.
- Testable via `AnnotationConfigApplicationContext`.
- Clean, scalable architecture for Spring-based console applications.

---

## 📚 Technologies Used

- **Java 17**
- **Spring Framework 6 (spring-context)**
- **Maven** for dependency management
- **JUnit 5** for unit testing

---

## 🛠️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/student-management.git
cd student-management
````

### 2. Build the project

Make sure you have **Maven** and **Java 17+** installed.

```bash
mvn clean install
```

### 3. Run the application

Using Maven:

```bash
mvn exec:java -Dexec.mainClass="com.teamsmartworld.Main"
```

Or run the JAR (if using shade plugin):

```bash
java -jar target/student-management-1.0.0.jar
```

---

## 🔍 How It Works

1. `Main.java` initializes the Spring context using `AnnotationConfigApplicationContext`.
2. Beans are scanned and managed by `ComponentScanConfig.java`.
3. `StudentDaoListImpl` handles student data in-memory.
4. `ScannerInputService` reads user input via a `Scanner` bean.
5. `StudentManagementConsoleImpl` combines the DAO and Input services to provide a working UI.

---

## ✅ Example Output

```
Welcome to TeamSmartWorld Student Management System

Please choose an option:
1. Add Student
2. List Students
3. Remove Student
4. Exit
```

---

## 👨‍💻 Author

Developed by **TeamSmartWorld (Dave Mbiydzenyuy)**

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 📬 Feedback

We'd love to hear your feedback or suggestions. Reach out via [GitHub Issues](https://github.com/teamsmartworld/student-management/issues).

```

---

Let me know if you'd like me to add badges, screenshots, or a LICENSE file.
```
