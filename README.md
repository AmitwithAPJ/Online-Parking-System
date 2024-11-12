# Online Vehicle Recognition System

A web-based system that utilizes machine learning for automatic vehicle recognition. The system captures vehicle images, processes them through a pre-trained model, and identifies vehicles based on their make, model, and license plate. The application includes both front-end and back-end components, as well as machine learning for image processing and vehicle recognition.

## Features

- **Vehicle Recognition**: Identifies vehicles from images using machine learning models.
- **User Authentication**: User registration and login system.
- **Real-time Recognition**: Processes and returns recognition results in real-time.
- **Admin Dashboard**: Admin users can view vehicle records and recognition events.
- **Image Upload**: Allows users to upload images for vehicle recognition.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Node.js (Express)
- **Machine Learning**: Python, TensorFlow, OpenCV
- **Database**: MySQL (or PostgreSQL)
- **Authentication**: JWT (JSON Web Tokens)

## Result
  <img src="https://github.com/user-attachments/assets/b07cb106-4f97-4ee7-9e04-ec3474efa9ad">

## Project Structure

```plaintext
vehicle-recognition-system/
├── server/                           # Backend server files
│   ├── app.js                        # Main server file (Node.js entry point)
│   ├── routes/                       # API endpoints
│   ├── models/                       # Database schemas (e.g., User, Vehicle, Event)
│   └── config/                       # Configuration files (e.g., database, environment)
├── client/                           # Frontend static files
│   ├── index.html                    # Main frontend HTML
│   ├── css/                          # CSS files for styling
│   └── js/                           # Frontend JavaScript
├── ml_model/                         # Machine learning files
│   ├── model/                        # Trained model files
│   └── inference.py                  # Script to handle model inference
├── README.md                         # Project documentation
└── requirements.txt                  # Python dependencies for machine learning libraries
