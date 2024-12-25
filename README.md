# Online Vehicle Recognition System aka Online-Parking-System

A simple CRUD app which helps parking space owners manage the parking space.

## Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Architecture Overview](#architecture-overview)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Outcome](#outcome)
- [Project Structure](#project-structure)

## Features

- **Vehicle Recognition**: Identifies vehicles from images using machine learning models.
- **User Authentication**: User registration and login system.
- **Real-time Recognition**: Processes and returns recognition results in real-time.
- **Admin Dashboard**: Admin users can view vehicle records and recognition events.
- **Image Upload**: Allows users to upload images for vehicle recognition.

## Architecture Overview

![Parking Diagram](https://github.com/AmitwithAPJ/WebD_HS/blob/main/first.png)

### Backend Architecture
The backend is designed to provide robust and scalable services, implemented using the **Spring Framework**. Below are the key architectural details:

- **Java Server Application**: Built using the Spring Framework, ensuring modularity and flexibility.
- **Template Engine**: Serves HTML content dynamically using the **Thymeleaf** template engine.
- **Static Content**: Accessed directly via predefined URLs.
- **REST API**: Handles dynamic data exchange, with JSON used as the data format for communication.
- **Relational Database**: Application data is stored in a relational database, with **PostgreSQL** as the primary option. For demonstration purposes, **H2** is used due to its lightweight nature and in-memory capabilities.

### Frontend Architecture
The frontend is designed to provide a seamless user experience, with the following core components:

- **Backend Integration**: Communicates with the backend through asynchronous JSON messages.
- **Static HTML**: Serves foundational data as static HTML pages.
- **Event Handling**: Uses **jQuery** for efficient event handling and asynchronous communication with the backend.
- **User Interface**: Built using the **Bootstrap framework**, offering a responsive and visually appealing design.
- **Data Visualization**: Leverages **Chart.js** to create dynamic and interactive parking usage diagrams.


## Technologies Used

### Backend Technologies
- **Java**  
- **Spring Boot**  
- **Spring MVC**  
- **Thymeleaf**  
- **Relational Database**: PostgreSQL  

### Frontend Technologies
- **HTML/CSS/JavaScript**  
- **Bootstrap**  
- **jQuery**  
- **Chart.js**  

### Development Cycle Tools
- **Jenkins**  
- **GitHub**  
- **Google Cloud**  
- **YouTrack**  
- **IntelliJ IDEA**


# Online-Parking-System

## Installation

To set up the project locally:

### Clone the Repository
```bash
# Start: Clone repository
git clone https://github.com/AmitwithAPJ/Online-Parking-System
cd Online-Parking-System
# End: Clone repository
```
### Install Dependencies
```bash
npm install
```
### Setup Instructions

### Step 1: Setup Environment Variables
1. Copy `.env.example` to `.env`.
2. Configure the following in the `.env` file:
   - **Database settings**
   - **JWT secret**

### Step 2: Setup the Database
1. Create a new database named `my_db`.
2. Run the SQL commands from `src/database/schema.sql` to set up the tables.
3. Ensure your `.env` configuration matches your database setup.

You're all set! 🚀

### Run the Project
```bash
npm start
```
The server should start on http://localhost:3306 by default.



## Outcome
 ![Parking Diagram](https://github.com/AmitwithAPJ/WebD_HS/blob/main/Home.png)
  ![Parking Diagram](https://github.com/AmitwithAPJ/Online-Parking-System/blob/main/images/login_image.png)
   ![Parking Diagram](https://github.com/AmitwithAPJ/Online-Parking-System/blob/main/images/registration_image.png)
    ![Parking Diagram](https://github.com/AmitwithAPJ/Online-Parking-System/blob/main/images/database_image.png)

## Project Structure

```plaintext
ParkIN/
├── gradle/                        # Gradle wrapper files
│   ├── wrapper/
│   ├── gradle-wrapper.jar
│   └── gradle-wrapper.properties
├── images/                         # Project images
│   ├── Main_image.png
│   ├── Parking_Manager.JPG
│   ├── User_Panel.JPG
│   ├── database_image.png
│   ├── login_image.png
│   ├── login_image2.png
│   └── registration_image.png
├── src/                            # Application source code
│   ├── main/
│   │   ├── java/                   # Backend Java code (Spring Boot application)
│   │   │   └── com/
│   │   │       └── parking/
│   │   │           ├── registrations/ # Registration related files
│   │   │           │   ├── Registration.java
│   │   │           │   ├── RegistrationController.java
│   │   │           │   └── RegistrationRepository.java
│   │   │           ├── tariffs/        # Tariff related files
│   │   │           │   ├── Tariff.java
│   │   │           │   ├── TariffController.java
│   │   │           │   └── TariffCrudRepository.java
│   │   │           ├── servlet/        # Servlet-based files (if needed)
│   │   │           │   ├── DriverServlet.java
│   │   │           │   ├── HomeServlet.java
│   │   │           │   ├── OwnerServlet.java
│   │   │           │   └── RegistrationServlet.java
│   │   │           ├── utils/          # Utility classes for the application
│   │   │           │   ├── DatabaseConnUtils.java
│   │   │           │   ├── DriversDAO.java
│   │   │           │   ├── ParkingDAO.java
│   │   │           │   └── UsersDAO.java
│   │   │           ├── model/          # Core entity models
│   │   │           │   ├── Driver.java
│   │   │           │   ├── User.java
│   │   │           │   └── VisitDetails.java
│   │   │           └── HTMLProviderController.java # Controls dynamic HTML generation
│   │   ├── resources/
│   │   │   ├── static/               # Frontend resources (static assets)
│   │   │   │   ├── css/              # CSS files
│   │   │   │   │   ├── menu_style.css
│   │   │   │   │   ├── reg_style.css
│   │   │   │   │   └── style.css
│   │   │   │   ├── images/           # Image assets
│   │   │   │   │   ├── logo.png
│   │   │   │   │   └── logo_navbar.png
│   │   │   │   └── js/               # JavaScript files for frontend logic
│   │   │   │       ├── index.js
│   │   │   │       ├── reg_script.js
│   │   │   │       ├── reset.js
│   │   │   │       ├── stats.js
│   │   │   │       ├── tariff.js
│   │   │   │       └── utils.js
│   │   │   ├── jsp/                 # JSP files for view rendering
│   │   │   │   ├── Admin_View.jsp
│   │   │   │   ├── Book_Parking.jsp
│   │   │   │   ├── Login_Form.jsp
│   │   │   │   ├── Menu.jsp
│   │   │   │   ├── Registration_Form.jsp
│   │   │   │   ├── User_Details.jsp
│   │   │   │   └── User_View.jsp
│   │   │   ├── templates/           # Thymeleaf templates for dynamic views
│   │   │   │   ├── fragments/
│   │   │   │   │   └── layout.html
│   │   │   │   ├── layouts/
│   │   │   │   │   └── layout.html
│   │   │   │   ├── index.html
│   │   │   │   ├── reset.html
│   │   │   │   ├── stats.html
│   │   │   │   └── tariff.html
│   │   │   ├── application.properties # Spring Boot application configuration
│   │   │   ├── data.sql              # Initial data for database
│   │   │   └── V1__people.sql        # SQL script for creating or migrating database
│   └── test/                        # Unit and integration tests
│       └── java/                    # Test files
│           ├── ConfigurationTest.java
│           ├── HTMLProviderTests.java
│           ├── ParkingTollUtilsTest.java
│           ├── RegistrationTest.java
│           ├── TariffTest.java
├── gradlew                          # Gradle wrapper script for Unix-based systems
├── gradlew.bat                      # Gradle wrapper script for Windows
├── build.gradle                     # Gradle build file
├── pom.xml                          # Maven project configuration
├── settings.gradle                  # Gradle settings
├── ParkIN.iml                       # IntelliJ IDEA project file
├── README.md                        # Project documentation
├── Final Review of the Project.docx  # Document for project review or final details
├── database_image.png               # Visual representation of the database
├── table_ss.png                     # Screenshot of the table schema
├── table.txt                        # Text representation of the table schema
├── Schema.sql                       # SQL schema file for database creation
├── data.json                        # JSON file with project-related data
├── jsLibraryMappings.xml            # XML file for JS libraries
├── misc.xml                         # Miscellaneous configuration
├── modules.xml                      # XML configuration for modules
├── .classpath                       # Eclipse classpath file
├── .project                         # Eclipse project configuration file
└── web.xml                          # Web application deployment descriptor


