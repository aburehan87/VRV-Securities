BACK - END  Task for VRV Securities.

-Please go throught the NOTE at the end and also at the "Documentation" folder of the Project.
You can also check out the working of the back end via accessing this Loom Link: https://www.loom.com/share/f28689f998e741088019c031573412c0?sid=63f41dc0-2416-4d26-9d06-bdf46449f836
The above video shows all the implemented steps and Functionalities of the Project

Project Description:
The backend for VRV Securities is a secure and scalable system built using Java, Spring Boot, and PostgreSQL. It provides user authentication, authorization, and CRUD functionalities for managing entities like users, leads, opportunities, learners, and courses. Key features include:

    User Authentication: Implements secure login, registration, and logout with encrypted passwords using bcrypt.
    JWT-Based Security: Generates and validates JWT tokens for session management.
    RESTful APIs: CRUD operations for all entities using Spring Data JPA.
    Database Integration: Automatic table and schema generation via Hibernate.
    Secure Configuration: Centralized configuration management and protection for sensitive endpoints.

This project is thoroughly tested using Postman and follows modern best practices for clean architecture, modularity, and security.

Testing and Running:
- Copy Paste or clone the repository to your local system.
- Open the Project while using IntelliJIdea or Eclipse.
- After opening the folder go to : VRV Securities Task\skillcapital\skillcapital\src\main\java\com\skillcapital and here you can see the "SkillcapitalApplication".
- You will have to make changes in the "application.properties" where you have to assign the database name and password as the back end is connected with PostgreSQL drivers.
- Run the Application fro "SkillcapitalApplication".
- Open Postman and see the port the application is running on, basically port 8080 - http://localhost:8080/api
- You can find all the API Call methods in the "documentation" folder , which represents all the API Calls you can make using postman and also gives you the Code Review.
-You can also refer to the above mentioned VIDEO LINK for better understanding and simplified implementation.

NOTE: This project does not implement Role Based Authorization as I tried a lot but due to insufficient knowledge on JWT RBAC I was unable to do so but will sure learn in the near future. But it covers 80% of the task where it hashes, encrypts, bcrypts the password, generates and validates the token which lasts for 22/23 hours approx and other mentioned steps of the Task.

SCREENS:

![Screenshot 2024-11-28 164901](https://github.com/user-attachments/assets/46d2fd31-8f87-414a-8785-48b3e39924cf)

Token Generation:

![Screenshot 2024-11-28 164917](https://github.com/user-attachments/assets/94b0880c-552b-48ff-8eca-63571a250157)


![Screenshot 2024-11-28 164937](https://github.com/user-attachments/assets/2d3e909a-aed3-40ad-9ac4-40b5537028f2)


