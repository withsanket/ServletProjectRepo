# **Paginated Table with Servlet and JSON Backend**

This project demonstrates a dynamic paginated table with search functionality using a Java Servlet backend. Data is sourced from a JSON file, and the frontend leverages HTML, CSS, JavaScript, and the DataTables library for managing the table display.

---

## **Features**
- **Pagination**: Dynamic navigation for large datasets with customizable rows per page.
- **Search**: In-table search functionality for filtering data.
- **Backend Integration**: Serves paginated data from a static JSON file via a Java Servlet.
- **Responsive Design**: User-friendly table and pagination controls that adapt to the dataset size.

---

## **Project Structure**

PaginatedTableApp/ ├── src/ │ └── main/ │ ├── java/ │ │ └── in.sanket/ │ │ └── DataServlet.java # Backend servlet │ └── webapp/ │ ├── index.html # Frontend │ ├── css/ # Optional: Custom CSS │ ├── js/ # Optional: Custom JavaScript │ └── data.json # Sample data file ├── pom.xml # Maven dependencies (if applicable) └── README.md 

# Project documentation

---

## **Setup Instructions**

### **1. Prerequisites**
- **Software**:
  - Java Development Kit (JDK) 8 or later
  - Eclipse IDE for Java EE
  - Apache Tomcat server (or any other servlet container)
  - Optional: Maven for managing dependencies
- **Libraries**:
  - Gson library for JSON handling
  - jQuery and DataTables library for frontend table features

---

### **2. Configuration**

#### **Create the Project**
1. Open Eclipse and create a new *Dynamic Web Project* named `PaginatedTableApp`.

#### **Add Backend Servlet**
1. Add a package `in.sanket` under `src/main/java`.
2. Place the provided `DataServlet.java` file in this package.

#### **Add JSON File**
1. Save your dataset as `data.json` in the `src/main/webapp` directory.
2. Ensure the file path in the `DataServlet.java` is correctly pointing to this JSON file.

#### **Add Frontend**
1. Place the provided `index.html` in the `src/main/webapp` directory.
2. Include any custom CSS or JavaScript as required.

#### **Add Dependencies**
1. Download the [Gson library](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.9/gson-2.8.9.jar).
2. Add it to the project:
   - Right-click the project > *Build Path* > *Configure Build Path* > *Add External JARs*.

---

### **3. Run the Application**
1. Deploy the project on Tomcat:
   - Right-click on the project > *Run As* > *Run on Server* > Select Tomcat > *Finish*.
2. Access the application at: http://localhost:8080/PaginatedTableApp/index.html
