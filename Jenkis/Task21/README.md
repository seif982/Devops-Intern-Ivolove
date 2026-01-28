# 🔑 Lab 21: Jenkins Role-Based Access Control (RBAC)

## 🎯 Configuration Summary:
1. **Roles Defined:**
   - `admin`: Full permissions (Administer + Read + Job actions).
   - `read-only`: Limited to 'Read' permissions for Overall, Job, and View.
2. **Assignments:**
   - User `s` (Current Admin): Assigned to `admin` role.
   - `user1`: Assigned to `admin` role.
   - `user2`: Assigned to `read-only` role.
[Adding](https://github.com/seif982/Devops-Intern-Ivolove/blob/main/Jenkis/Task21/screenshots/addusers.png)
[Assigningroles](https://github.com/seif982/Devops-Intern-Ivolove/blob/main/Jenkis/Task21/screenshots/assignroles.png)
## ✅ Result:
Access control is successfully enforced. Admin users can manage the system, while `user2` is restricted to viewing jobs only.
