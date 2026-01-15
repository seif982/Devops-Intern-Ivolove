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

docker network create --subnet=10.0.0.0/24 my_custom_net
![Build](https://github.com/seif982/Devops-Intern-Ivolove/blob/master/Task8/screenshots/Buildnetwork.png)

. Build and Run Backend
Bash
![Build](https://github.com/seif982/Devops-Intern-Ivolove/blob/master/Task8/screenshots/Buildbackendimage.png)

cd Docker5/backend
docker build -t task8-backend .
docker run -d --name backend-service --net my_custom_net --ip 10.0.0.10 task8-backend
![IP](https://github.com/seif982/Devops-Intern-Ivolove/blob/master/Task8/screenshots/Ipforbackandfront.png)
Test
![Test](https://github.com/seif982/Devops-Intern-Ivolove/blob/master/Task8/screenshots/pingandinstallpingtooloncontainer.png)
