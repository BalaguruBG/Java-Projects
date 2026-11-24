# Train Ticket Checking System

A Java-based console application that simulates a train ticket inspection system. The application allows a ticket checker to inspect passengers across different railway stations and trains, identify passengers travelling without valid tickets, calculate fines, and generate a fine report in a text file.

## Features

- Manage multiple railway stations and trains
- Store passenger details
- Maintain passenger ticket status
- Check ticket validity
- Identify passengers travelling without valid tickets
- Calculate fines for passengers without valid tickets
- Generate a detailed fined passenger report
- Store inspection details in a text file
- Display the total number of fined passengers

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays
- Abstract Classes
- Inheritance
- Method Overriding
- File Handling
- FileWriter

## OOP Concepts Implemented

- **Abstraction:** Created an abstract `Person` class with an abstract `displayDetails()` method.
- **Inheritance:** `Passengers` and `TicketChecker` classes inherit from the `Person` class.
- **Method Overriding:** Implemented `displayDetails()` separately in the `Passengers` and `TicketChecker` classes.
- **Polymorphism:** Used overridden methods to provide different implementations of passenger and ticket checker details.
- **Encapsulation:** Used the common parent class structure to organize person-related attributes.

## Project Structure

```text
TrainTicketCheckingOPP/
│
├── Main.java
├── Person.java
├── Passengers.java
├── TicketChecker.java
├── Trains.java
└── Station.java
```

## Fine Calculation

The application checks whether a passenger has a valid ticket.

- Valid ticket: No fine.
- Invalid ticket: Ticket price + ₹500 fine.

**Fine Calculation Formula:**

Total Fine = Ticket Price + ₹500

## Sample Railway Details

The application contains three railway stations:

| Station | Location | Train |
|---|---|---|
| MGR | Chennai | South |
| Egmore | Chennai | East |
| Tambaram | Chennai | West |

## Report Generation

The application generates a text report containing:

- Ticket checker details
- Railway station details
- Train details
- Passenger details
- Ticket price
- Fine amount
- Total number of fined passengers

The report is generated using Java File Handling with `File` and `FileWriter`.

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Compile all Java source files.
4. Run the `Main` class.
5. The application checks passengers across the configured stations and trains.
6. View the generated fined passenger report in the configured text file location.

## Purpose

This project was developed to strengthen practical Java programming skills and understand how Object-Oriented Programming concepts can be applied to a real-world railway ticket inspection scenario.
