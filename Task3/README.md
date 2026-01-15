 Building & Running Java App

This project demonstrates how to containerize a Java application using Maven and Docker.

---

## 1. Project Structure
In this task, I organized the repository to include:
- `Dockerfile`: Instructions to build the image.
- `src/`: The application source code.
- `screenshots/`: Proof of successful execution.

---

## 2. Dockerfile Configuration
I used a Maven base image with Java 17 to build and run the app:
- **Base Image:** `maven:3.8.4-openjdk-17`
- **Workdir:** `/app`
- **Exposed Port:** `8080`

---

## 3. Execution Steps & Proof

### Step 1: Building the Image
Command used: `docker build -t app1 .`

![Build Success](https://github.com/seif982/Devops-Intern-Ivolove/blob/main/Task3/screenshots/build2.png?raw=true)

### Step 2: Running the Container
Command used: `docker run -d -p 8080:8080 --name container1 app1`

![Running Container](https://raw.githubusercontent.com/seif982/Devops-Intern-Ivolove/refs/heads/main/Task3/screenshots/Run1.png)

### Step 3: Testing in Browser
Accessing the app via `http://localhost:8080`

![App Test](https://github.com/seif982/Devops-Intern-Ivolove/blob/main/Task3/screenshots/Run2.png?raw=true)
