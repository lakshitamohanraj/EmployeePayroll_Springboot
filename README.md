## Employee Payroll System using springboot

### Objective
To Develop a web application for managing Employee and Payroll details via RESTful APIs. Utilize Spring JPA to establish a one-to-one mapping between Employee and Payroll entities. Demonstrate the usage of Swagger for API documentation and interaction.

### API ENDPOINTS
1. EmployeeController
- **Endpoint: /api/employees**
- POST /: Add new employee.
- GET /{id}: Get employee details by ID.
- PUT /: Update employee details.
- DELETE /{id}: Delete employee.
2. PayrollController
- **Endpoint: /api/payrolls**
- POST /: Add new payroll.
- GET /employee/{employeeId}: Get payroll details by employee ID.
- PUT /: Update payroll details.
- DELETE /{id}: Delete payroll entry.

### Steps to run the project in terminal
1. Use `git clone https://github.com/lakshitamohanraj/EmployeePayroll_Springboot.git` to clone the project folders to your local system
2. Open the terminal ,go to the root directory of the project and run `mvn spring-boot:run` for more details [click here](https://stackoverflow.com/questions/47835901/how-to-start-up-spring-boot-application-via-command-line)
3. Go to browser and hit `https://localhost:8080/swagger-ui/index.html` to perform API endpoints

### Happy to hear feedbacks and improve the project!~
