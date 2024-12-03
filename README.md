# Online Vehicle Recognition System

A web-based system that utilizes machine learning for automatic vehicle recognition. The system captures vehicle images, processes them through a pre-trained model, and identifies vehicles based on their make, model, and license plate. The application includes both front-end and back-end components, as well as machine learning for image processing and vehicle recognition.

## Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Database Schema](#database-schema)
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

## Database Schema
<img src = "https://github.com/AmitwithAPJ/Online-Parking-System/blob/main/server/models/Database_Schema.png">
Refer to the <a href="https://github.com/AmitwithAPJ/Online-Parking-System/tree/main/server/models">Database Schema Documentation </a> for detailed field descriptions and relationships.

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

