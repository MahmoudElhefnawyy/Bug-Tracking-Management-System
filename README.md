# 🔧 Bug Tracking Management System

## 🔄 Overview

The **Bug Tracking Management System** is a robust desktop application built with **Java** and **Swing** to help software development teams efficiently track and manage bugs throughout the software development lifecycle. This system ensures seamless collaboration between **testers**, **developers**, and **administrators**, promoting transparency, accountability, and better project management.

### Key Objectives
- Centralized bug tracking to avoid loss of issue reports.
- Role-based access to enforce security and responsibilities.
- Historical tracking of bug status changes and comments.
- Real-time overview of bugs across projects.
- Streamlined workflows for bug reporting, assignment, resolution, and closure.

### User Roles
- 👨‍💼 **Administrator:** Manages users, assigns bugs, and oversees progress.
- 💻 **Developer:** Views assigned bugs, adds comments, and updates status.
- 👷 **Tester:** Reports bugs, tracks their status, and adds follow-up comments.

## ✨ Features

- 🔑 **User Authentication:** Secure login with hashed passwords.
- 🛠️ **Role-Based Access Control:** Admin, Developer, Tester.
- 🔧 **Bug Reporting:** Capture title, description, severity, priority, and bug type.
- 🔮 **Bug Assignment:** Admin can assign bugs to developers.
- ⚙️ **Status Tracking:** (Open, In Progress, Resolved, Closed)
- 💬 **Commenting System:** Facilitate communication between users.
- 📊 **Dashboard Analytics:** Summarizes bug counts, trends, and status distributions.
- 🗒️ **Audit Trail:** Tracks key user actions and updates.

## 🛠️ Technologies Used

| Layer              | Technology         |
|--------------------|--------------------|
| Language           | Java                |
| GUI Framework      | Swing (Java GUI)    |
| Database           | MySQL               |
| Authentication     | Role-based Login    |
| Version Control    | Git & GitHub        |

---

## 🛠️ Installation

### Prerequisites

- Java Development Kit (JDK 11 or higher) installed
- MySQL Server installed and running
- Git installed

---

### Steps

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/MahmoudElhefnawyy/Bug-Tracking-Management-System.git
    cd Bug-Tracking-Management-System
    ```

2. **Database Setup:**
    - Create a MySQL database called `bugtrackingdb`.
    - Import the provided SQL script: `bugtrackingdb.sql`
    - Set MySQL credentials in `DBConnection.java`:
    ```java
    private static final String URL = "jdbc:mysql://localhost:3306/bugtrackingdb";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";
    ```

3. **Compile and Run:**
    - Use your IDE (like IntelliJ, Eclipse, or NetBeans) to open the project.
    - Compile and run `Main.java`.

4. **Login:**
    Use the following test credentials:
    - **Admin:** 
        - Username: `admin`
        - Password: `admin`
    - **Developer:**
        - Username: `dev1`
        - Password: `password`
    - **Tester:**
        - Username: `tester1`
        - Password: `password`

---

## 📚 Project Structure

```
src/
|-- controller/            # Contains core logic for handling user actions
|-- dao/                    # Data Access Layer - Handles database operations
|-- model/                  # Entity classes for Bug, User, etc.
|-- view/                   # GUI panels and forms
|-- Main.java                # Entry point of the application
```

---

## 🛠️ Contribution

Contributions are welcome! Follow these steps:

1. Fork the repository.
2. Create a new branch:
    ```bash
    git checkout -b feature/new-feature
    ```
3. Commit your changes:
    ```bash
    git commit -m "Add new feature"
    ```
4. Push to your branch:
    ```bash
    git push origin feature/new-feature
    ```
5. Open a Pull Request.

---

## ⚖️ License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👤 Contact

Developed by: **Mahmoud Elhefnawy**  
GitHub: [MahmoudElhefnawyy](https://github.com/MahmoudElhefnawyy)  
Email: [your-email@example.com](mailto:your-email@example.com)
