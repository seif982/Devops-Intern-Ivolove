Ansible Lab 28: Structured Configuration Management with Roles
📋 Project Overview

This lab demonstrates the transition from monolithic Ansible playbooks to a modular Roles-based architecture. The goal is to automate the installation and configuration of a DevOps toolstack (Docker, Kubernetes CLI, and Jenkins) on a managed node (localhost).
📂 Directory Structure

The project is organized into dedicated roles for scalability and reusability:
Plaintext

Task28/
├── hosts                   # Inventory file
├── site.yml                # Main playbook calling the roles
└── roles/
    ├── docker/             # Role for Docker Engine
    ├── kubectl/            # Role for Kubernetes CLI
    └── jenkins/            # Role for Jenkins Automation Server

🛠️ Roles Functionality

    Docker Role: Installs docker.io, ensures the service is started and enabled on boot.

    Kubectl Role: Downloads the stable binary from Google's servers and sets executable permissions in /usr/local/bin.

    Jenkins Role:

        Installs Java (OpenJDK 17) as a dependency.

        Implements a GPG-bypass method ([trusted=yes]) to ensure seamless installation across different Linux distributions.

        Configures the Jenkins repository and handles automated installation.

🚀 How to Run

To execute the automation, use the following command:
Bash

ansible-playbook -i hosts site.yml -K

✅ Verification & Testing

After execution, verify the installation of each tool:

    Docker: docker --version

    Kubectl: kubectl version --client

    Jenkins: systemctl status jenkins

💡 Troubleshooting Notes

During this lab, we encountered GPG signature verification issues with the Jenkins repository. The solution was to use the [trusted=yes] flag in the APT source list to bypass the GPG check for the lab environment, ensuring a smooth automated deployment.
