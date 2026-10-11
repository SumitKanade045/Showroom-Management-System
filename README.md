# Showroom Management System

## Project Overview
The Showroom Management System is a console-based Java application designed to manage cars, customers, and car sales. It allows users to register and search customers, manage car inventory, track sold and available cars, and maintain customer purchase records.

## Technologies Used
- Core Java
- Object-Oriented Programming (OOP)
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- Collections Framework
- ArrayList
- Iterator
- Scanner Class

## Project Structure
```text
Showroom-Management-System/
└── src/
    └── app/
        └── com/
            ├── Car.java
            ├── Customer.java
            ├── Fortuner.java
            ├── Thar.java
            ├── Scorpio.java
            ├── Inventory.java
            ├── ShowRoom.java
            └── Test.java
```

## Features

### Customer Management
1. Register new customers.
2. Search customers by customer ID.
3. Display all registered customers.
4. View cars purchased by a customer.

### Car Inventory Management
1. Add Fortuner, Thar, and Scorpio cars.
2. Remove all cars or a specific car by car number.
3. Search for cars by car number.
4. Display all cars.
5. Display available cars.
6. Display sold cars.
7. View total, sold, and available car counts.

### Car Sales Management
1. Sell a car to a registered customer.
2. Prevent a car from being sold again.
3. Assign the customer as the car owner.
4. Maintain the customer's purchased car list.

## Main Classes

- **Car:** Abstract parent class containing common car properties and an abstract `display()` method.
- **Fortuner:** Represents a Fortuner car and its specific properties.
- **Thar:** Represents a Thar car and its specific properties.
- **Scorpio:** Represents a Scorpio car and its specific properties.
- **Customer:** Stores customer details and purchased cars.
- **Inventory:** Manages car records, availability, removal, searching, and sales.
- **ShowRoom:** Manages customer registration, customer searches, and showroom information.
- **Test:** Provides the main menu and user interaction.

## Object-Oriented Concepts Demonstrated
- **Abstraction:** The `Car` class defines common properties and an abstract display method.
- **Inheritance:** `Fortuner`, `Thar`, and `Scorpio` extend `Car`.
- **Polymorphism:** The `display()` method is overridden in the child classes.
- **Encapsulation:** Fields are private and accessed through getters and setters.
- **Association:** Customers own purchased cars, and cars reference their owners.

## How to Run
1. Install the Java Development Kit (JDK).
2. Open the project in Eclipse, IntelliJ IDEA, or VS Code.
3. Ensure all classes are in the `app.com` package.
4. Run `Test.java`.
5. Select options from the console menu to manage customers and cars.

## Data Storage
The application uses Java `ArrayList` collections to store car and customer records in memory. Data is not permanently stored and will be lost when the application terminates.

## Future Enhancements
- Integrate MySQL to store car and customer records permanently.
- Add customer and car ID validation.
- Generate sales reports and invoices.
- Add search by car brand, price, or model.
- Improve input validation and exception handling.

## Author
Java Developer Fresher
