# Activités Scientifiques Project

This project is a web-based platform with **two separate interfaces**: one for users (Chercheur, Prof, Encadrant, Docteur) and one for administrators. It was built using JSP, Java, HTML, CSS, and MySQL.

---

## Project Overview

- **User Interface**: Allows researchers, professors, supervisors, and doctors to interact with the system, manage their activities, and access relevant data.
- **Admin Interface**: Allows administrators to manage users, monitor activities, and maintain the system.

Each interface runs independently and serves a different set of users.

---

## How to Run

### Prerequisites

- Java (JDK 8+)
- Apache Tomcat (or any JSP-compatible server)
- MySQL database (Workbench recommended)

### User Interface

1. Navigate to the user interface folder (`WebContent` or equivalent).
2. Run `index.jsp` on your JSP server.
3. Update the database connection in `SingletonConnection.java` with your MySQL login credentials.

### Admin Interface

1. Navigate to the admin interface folder.
2. Run `index.jsp` on your JSP server.
3. Update the database connection with your own MySQL login credentials.

> ⚠️ For security reasons, all login credentials have been removed. Replace them with your own database credentials to connect properly.

---

## Database

- The project uses MySQL for data storage.
- Ensure your database contains the required tables before running the project.

---

## Notes

- Both interfaces are **completely independent**.
- Minor adjustments may be needed depending on your local server configuration.

---

## Technologies Used

- Java, JSP
- HTML, CSS, JavaScript
- MySQL / Workbench
- Apache Tomcat (or compatible JSP server)

---

## Author

Hiba Elkaam
