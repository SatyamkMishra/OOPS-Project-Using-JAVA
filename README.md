# OOPS-Project-Using-JAVA


## ATM Machine

This Java project simulates an ATM machine with basic functionalities like checking account balance, withdrawing money, and depositing money. It's designed to run in a console environment and operates with a predefined PIN for access control.

### Features:
- **PIN Authentication:** Users must enter a correct PIN (preset as 9958) to access the ATM functionalities.
- **Main Menu:** Once authenticated, users are presented with a menu to choose from the following options:
  1. Check Account Balance
  2. Withdraw Money
  3. Deposit Money
  4. Exit
- **Balance Check:** Allows users to view their current account balance.
- **Withdraw Money:** Users can withdraw a specified amount, provided they have sufficient balance.
- **Deposit Money:** Users can deposit money into their account.
- **Exit Option:** Provides a way to exit the ATM session.

### How to Use:
1. Run the program.
2. Enter the PIN (9958) when prompted.
3. Choose an option from the menu by entering the corresponding number.
4. Follow the prompts for each selected option to complete transactions or view balances.

### Technologies Used:
- Java programming language
- Utilizes basic console input and output
- Scanner class for user input handling


### Notes:
- Ensure Java is installed on your system to compile and run the project.
- This project serves as a basic simulation and can be expanded with additional features such as transaction history, multiple account support, or improved error handling.

---


**Employee Payroll System**
This Java project implements a simple Employee Payroll System using object-oriented principles and inheritance. It includes:

**Employee Class Hierarchy:** Abstract base class Employee with concrete subclasses FulltimeEmployee and PartTimeEmployee.
**Salary Calculation:** Each subclass implements calculateSalary() method based on different pay structures.
**PayRollSystem Class:** Manages a list of employees, allowing addition, removal, and display of employee details.
**Main Application:** Demonstrates functionality by adding employees, performing operations, and displaying results.

**Key Classes**
**Employee:** Abstract class defining basic attributes and abstract salary calculation method.
**FulltimeEmployee:** Inherits from Employee, calculates salary based on monthly salary.
**PartTimeEmployee:** Inherits from Employee, calculates salary based on hours worked and hourly rate.
**PayRollSystem:** Manages a collection of employees and provides methods to manipulate and display employee data.

**Usage**
The Employee_Payroll_System class in main method initializes a PayRollSystem instance, adds sample employees (one full-time and one part-time), performs employee removal by ID, and displays current employee details.

**How to Run**
Compile and run Employee_Payroll_System.java using a Java compiler (javac) and interpreter (java). Ensure all classes are in the same directory or properly configured in the classpath.

Feel free to expand on this description based on any additional features or customization you've implemented in your project.
