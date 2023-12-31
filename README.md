# A Smart Parking System using the SQL Server and Java Programming Language
This highly efficient solution has the capacity to effortlessly capture and retain data about parking availability, thanks to its advanced license plate recognition technology. The system is designed to seamlessly display this information to users, ensuring that they can easily locate available parking spots without any hassle.
## Overview
In the development of this project, there are three stages, namely:
**1. Database Design:** The database design process encompasses two key phases: conceptual database design and physical database design.

   a. Conceptual Database Design:
      - In this stage, the identification of entity types and relationships to be used in the automatic parking system's database takes place. Entities include objects such as staff, vehicles, parking areas, and transactions. Relationships between entities depict how these entities interact within the system.
      - Additionally, this phase requires defining the attributes that will be stored for each entity. Attributes are specific pieces of information associated with each entity. For instance, attributes for the "vehicle" entity include license plate numbers, notes, and deleted. The "Deleted" attribute is related to the deletion process. By default, this attribute is set to 0, indicating that the vehicle record is active and should be displayed in the interface. However, when a record is deleted, the "deleted" attribute is set to 1. This mechanism is in place to prevent the permanent removal of data.
      - The domain of an attribute refers to the range of allowable values for each attribute. For example, a vehicle's license plate number should consist of letters and numbers and have a specific length.
![image](https://github.com/lianadara/smart_parking/assets/106791473/28d9621f-45ef-4c66-abeb-d30260951f44)

   b. Physical Database Design:
      - After completing the conceptual database design, the next step is to implement the logical data model into the chosen Database Management System (DBMS), such as SQL Server.
      - This process involves creating table structures (relational tables) to store data. Each table will encompass the entities identified in the conceptual phase, and each attribute will be represented by columns within the tables.
      - Moreover, the physical database design includes establishing primary keys that will be used to uniquely identify each record in the tables.
![image](https://github.com/lianadara/smart_parking/assets/106791473/38cbe11d-a380-439f-9d7c-4f7437a51920)
In the context of building an automatic parking system, this stage is critical because a well-designed and structured database allows the system to efficiently store, manage, and access information, including user details, parked vehicles, transactions, and more. With proper database design, the system can operate effectively and provide a superior parking experience for users.

**2. Interface Design:** The interface is created using a Java-based GUI (Graphical User Interface). This interface is designed and structured with the functionalities and capabilities that have been predefined in the Project Design Model (PDM). Below is an example of the login page interface:
![image](https://github.com/lianadara/smart_parking/assets/106791473/3abbb9ee-54d4-4199-8e6d-db623cf5615f)

**3. Connecting Interface and Database:** Once the database in SQL Server is prepared and complete, the next step is to establish a connection between the database and the interface that has been designed. This connection serves as the link that allows the interface to interact with the database to perform various operations, such as CRUD (Create, Read, Update, Delete).
By successfully connecting the interface and the database, we enable our Java-based application to interact with the underlying data, allowing users to perform tasks, view information, and manage data seamlessly through the graphical interface. This integration is a critical component of building a functional and user-friendly software system.

Here are some displays from the interface that have been created:
![image](https://github.com/lianadara/smart_parking/assets/106791473/0a1da44d-ce3d-4fcf-9938-5875b570c2c9)
![Screenshot (33)](https://github.com/lianadara/smart_parking/assets/106791473/0a9589c0-b1bc-4c27-8645-a3053a3676e7)
![Screenshot (41)](https://github.com/lianadara/smart_parking/assets/106791473/6aba1947-1735-4b7d-90ab-c6c91c70bb9a)
![Screenshot (35)](https://github.com/lianadara/smart_parking/assets/106791473/7236b13a-54d0-4b21-9626-070dc3b57d3b)
![Screenshot (37)](https://github.com/lianadara/smart_parking/assets/106791473/22ceca07-eb26-4986-b827-dc9d02aff9e9)
![Screenshot (39)](https://github.com/lianadara/smart_parking/assets/106791473/e04c36cc-7848-4f25-9b99-a150aea1da1b)

This is the [demo link](https://intip.in/ProjectTBDKelompok3/) for this Smart Parking System.
