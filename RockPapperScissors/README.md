# Rock Paper Scissors Game

A Java-based console game where a human player competes against an AI opponent in the classic Rock Paper Scissors game.

The computer randomly selects its move, and the winner of each round is determined based on the game rules. Scores are maintained throughout the game until the player chooses to exit.

## Features

- Human vs AI gameplay
- Random computer move generation
- Interactive console-based input
- Automatic winner determination
- Score tracking for both players
- Displays the final winner when the game ends
- Option to exit the game at any time

## Game Rules

| Choice | Number |
|---|---|
| Rock | 1 |
| Paper | 2 |
| Scissor | 3 |
| Exit | 4 |

Winning conditions:

- Rock defeats Scissor
- Paper defeats Rock
- Scissor defeats Paper
- Same choices result in a draw

## Technologies Used

- Java
- OOP (Object-Oriented Programming)
- Scanner Class
- Random Class

## OOP Concepts Implemented

- **Abstraction:** Created an abstract Player class with an abstract move() method.
- **Inheritance:** Human and AI classes inherit from the Player class.
- **Method Overriding:** Both Human and AI provide their own implementation of the move() method.
- **Polymorphism:** Different player types implement their own move behavior.

## Project Structure

- `Player.java` - Abstract parent class for players.
- `Human.java` - Handles human player details and moves.
- `AI.java` - Generates random moves for the computer.
- `Game.java` - Controls the game flow, player interaction, and score tracking.
- `RockPapperScissor.java` - Contains game rules, winner determination, and choice name conversion.

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Compile the Java source files.
4. Run the `Game` class.
5. Enter your choice to play against the computer.

## Purpose

This project was developed to practice Java Object-Oriented Programming concepts and understand how abstraction, inheritance, method overriding, and random number generation can be applied in a simple interactive game.
