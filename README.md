# Online Vehicle Recognition System

A web-based system that utilizes machine learning for automatic vehicle recognition. The system captures vehicle images, processes them through a pre-trained model, and identifies vehicles based on their make, model, and license plate. The application includes both front-end and back-end components, as well as machine learning for image processing and vehicle recognition.

## Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Database Schema](#architecture-overview)
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

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Node.js (Express)
- **Machine Learning**: Python, TensorFlow, OpenCV
- **Database**: MySQL (or PostgreSQL)
- **Authentication**: JWT (JSON Web Tokens)

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
  <img src="https://github.com/user-attachments/assets/b07cb106-4f97-4ee7-9e04-ec3474efa9ad">

## Project Structure

```plaintext
ParkIN/
├── src/
│   ├── main/
│   │   ├── java/                     # Backend source code (Spring Boot application)
│   │   │   └── com/
│   │   │       └── parkin/
│   │   │           ├── controllers/  # REST API controllers
│   │   │           ├── models/       # Entity models representing database tables
│   │   │           ├── repositories/ # Repository interfaces for database operations
│   │   │           └── services/     # Business logic services
│   │   ├── resources/
│   │   │   ├── static/               # Frontend resources
│   │   │   │   ├── css/              # CSS files for styling
│   │   │   │   ├── js/               # JavaScript files for frontend logic
│   │   │   │   └── images/           # Static image assets
│   │   │   ├── templates/            # Thymeleaf HTML templates
│   │   │   │   ├── index.html        # Homepage
│   │   │   │   ├── stats.html        # Parking statistics page
│   │   │   │   └── tariff.html       # Tariff details page
│   │   │   ├── application.properties # Spring Boot configuration
│   │   │   └── data.sql              # Initial database data
│   └── test/
│       └── java/                     # Test cases for the application
├── pom.xml                           # Maven project configuration
└── README.md                         # Project documentation

