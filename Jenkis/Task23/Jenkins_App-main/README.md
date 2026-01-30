# Task 23: CI/CD Pipeline for Spring Boot App on Kubernetes

## 📝 Project Overview
This project demonstrates a full CI/CD workflow using Jenkins, Docker, and Minikube. The goal is to automate the process from code commit to deployment on a local Kubernetes cluster.

## 🚀 Features
- **Automation**: Fully automated pipeline from GitHub to K8s.
- **Shared Libraries**: Uses Jenkins Shared Libraries for Docker operations.
- **Security Bypass**: Implements `kubectl proxy` to handle local Minikube authentication issues.

## 🛠️ Prerequisites
- **Jenkins** with Docker and Maven tools configured.
- **Minikube** running locally.
- **Docker Hub** account for storing images.

## ⚙️ How to Run
1. **Start Minikube**: `minikube start`
2. **Start Proxy**: On your host machine, run:
   ```bash
   kubectl proxy --address='0.0.0.0' --accept-hosts='.*' --port=8001
[verify](https://github.com/seif982/Devops-Intern-Ivolove/blob/main/Jenkis/Task23/Jenkins_App-main/screenshots/verifyjenkis.png)
