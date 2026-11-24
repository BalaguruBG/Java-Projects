# Train Ticket Booking System

A Java-based console application that allows passengers to view available trains, check seat availability, book train tickets, and generate ticket details using file handling.

The application provides a simple menu-driven interface with predefined train details and seat arrangements.

## Features

- View available trains using Train Number
- Display train seat availability
- Book train tickets
- Enter passenger details
- Select train, coach, and seat number
- Prevent booking of already occupied seats
- Generate ticket details after successful booking
- Store ticket information in a text file
- Exit the application through the menu

## Available Trains

| Train No | Train Name | Source | Destination | Ticket Price |
|---|---|---|---|---|
| 101 | TVR-CHENNAI EXP | Thiruvarur | Chennai | ₹120 |
| 102 | CHEENAI-TVR EXP | Chennai | Thiruvarur | ₹120 |

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays and Multidimensional Arrays
- Scanner Class
- File Handling
- FileWriter
- BufferedWriter
- Exception Handling
- Multithreading (Thread.sleep)

## OOP Concepts Implemented

- **Encapsulation:** Used private data members in Train and Passenger classes with getter methods.
- **Classes and Objects:** Created separate classes to represent trains, passengers, and application functionality.

## Project Structure

```text
TrainTicketBooking/
│
├── Main.java
├── Train.java
└── Passenger.java
```

## Seat Availability

The application uses a two-dimensional integer array to represent seat availability.

- `0` - Available Seat
- `1` - Occupied Seat

When a passenger successfully books a seat, its value changes from 0 to 1.

## Ticket Generation

After successful booking, passenger and train details are written into a text file using FileWriter and BufferedWriter.

Ticket details include:

- Train Number
- Train Name
- Source Station
- Destination Station
- Passenger Name
- Passenger Age
- Passenger Contact Number

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Compile the Java source files.
4. Run the `Main` class.
5. Select an option from the application menu.
6. View available trains or book a ticket.

## Purpose

This project was developed to practice Java fundamentals, Object-Oriented Programming, multidimensional arrays, file handling, and basic application development through a real-world train ticket booking scenario.
