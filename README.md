# Vaadin Newspaper
📖 A web-based newspaper platform built with Vaadin to manage and display news articles efficiently.

## Overview
Vaadin Newspaper is a web application designed to provide a seamless digital newspaper experience. It allows users to browse, read, and manage articles with an intuitive interface powered by Vaadin framework.

## Features
- User authentication and role-based access
- Article management (create, edit, delete, publish)
- Dynamic and responsive UI with Vaadin
- Search and filter functionalities for articles
- Backend API for data management

## Technologies Used
- **Frontend & Backend:** Vaadin (Java-based framework)
- **Database:** MySQL
- **Backend:** Spring Boot
- **Authentication:** JWT-based authentication

## Installation and Setup
To set up the project locally, follow these steps:

### Prerequisites
Ensure you have the following installed:
- [Java JDK 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/)

### Steps to Run the Project
1. **Clone the repository:**
   ```bash
   git clone https://github.com/aom387ISO/vaadinNewspaper.git
   cd vaadinNewspaper
   ```

2. **Configure the database:**
   - Create a new MySQL database.
   - Update the database connection settings in `application.properties`.

3. **Build and run the project:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the application:**
   Open your browser and go to `http://localhost:8080`.

## Usage
- Admin users can manage articles and users.
- Regular users can browse and read published articles.
- The search bar allows filtering by title, author, or category.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m "Added a new feature"`).
4. Push to your branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is licensed under the MIT License.

