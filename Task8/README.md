# Task 8: Docker Networking & Microservices Communication

This task demonstrates a microservices architecture using **Docker Custom Networks**, where a Frontend and a Backend service communicate using **Static IP addresses**.

## 🏗️ Architecture Overview
* **Backend Service**: A Flask API that returns a simple string.
* **Frontend Service**: A Flask application that calls the Backend using its Static IP.
* **Network**: A custom Docker bridge network (`my_custom_net`) with a specific subnet.

## 🛠️ Network Configuration
- **Network Name**: `my_custom_net`
- **Subnet**: `10.0.0.0/24`
- **Backend Static IP**: `10.0.0.10`
- **Frontend Static IP**: `10.0.0.20`

## 🚀 How to Run

### 1. Create the Custom Network
```bash
docker network create --subnet=10.0.0.0/24 my_custom_net


. Build and Run Backend
Bash

cd Docker5/backend
docker build -t task8-backend .
docker run -d --name backend-service --net my_custom_net --ip 10.0.0.10 task8-backend

3. Build and Run Frontend
Bash

cd ../frontend
docker build -t task8-frontend .
docker run -d --name frontend-service -p 8080:5000 --net my_custom_net --ip 10.0.0.20 task8-frontend
