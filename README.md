# Hotel Management System

## Project Overview

The **Hotel Management System** is a console-based Java application designed to simulate the basic operations of a hotel. It allows the user to book rooms, manage customer details, order food, generate bills, and process payments. This project demonstrates object-oriented programming (OOP) concepts such as classes, objects, inheritance, encapsulation, and modularity in Java.

## Features

- Book Single and Double Rooms
- Manage Customer Details (Name, Contact, Gender)
- Order Food Items
- Generate Bills Based on Room and Food Charges
- Process Payments
- Display Room and Customer Information

## Project Structure

The project contains the following Java classes:

| File Name        | Purpose                                                 |
|------------------|----------------------------------------------------------|
| `Hotel.java`     | Main class to control hotel operations and user menu     |
| `Holder.java`    | Holds information about room availability                |
| `Singleroom.java`| Represents Single Room booking                           |
| `Doubleroom.java`| Represents Double Room booking                           |
| `Customer.java`  | Manages customer details                                 |
| `Food.java`      | Manages food ordering and food charges                   |
| `Bill.java`      | Generates billing details                                |
| `Payment.java`   | Handles payment after billing                            |

## Technologies Used

- Java (JDK 8 or later)
- VS Code (or any Java IDE)
- Java Console for input/output

## How to Run

1. **Install JDK**  
   Ensure that Java JDK is installed and configured on your system.

2. **Set Up the Project**
   - Clone the project or copy all `.java` files into a single folder.
   - Open the project folder in **Visual Studio Code** (or any IDE).

3. **Compile All Java Files**
   ```bash
   javac *.java
   ```

4. **Run the Application**
   ```bash
   java Hotel
   ```

5. **Use the Menu**
   - Follow the console instructions to perform operations like booking, food ordering, bill generation, etc.

## Sample Flow

- Book a Room → Enter Customer Details → Order Food → View Bill → Process Payment.

## Screenshots

*(Optional: You can add sample screenshots later.)*

## Key Concepts Demonstrated

- Object-Oriented Programming (OOP)
- Exception Handling
- User Input Validation
- Modularity and Reusability

## Future Enhancements

- Add a graphical user interface (GUI) using JavaFX or Swing
- Add database support for persistent data storage
- Enhance payment options (card, UPI, etc.)
- Add more room types and services
