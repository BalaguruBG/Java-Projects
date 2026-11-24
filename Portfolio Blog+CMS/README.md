##Portfolio and Blog CMS

A web-based Portfolio and Blog Content Management System developed using Java, Spring Boot, and MySQL.

This project combines a personal portfolio website with a blog management system, allowing visitors to explore portfolio information and read blog posts while providing an admin interface to manage blog content.

Project Overview

The Portfolio and Blog CMS is designed to provide a centralized platform for showcasing personal and professional information and managing blog posts.

The application follows a layered architecture using Spring Boot, separating request handling, business logic, database operations, and data representation.

Features

Portfolio Website

Display personal and professional information.

Showcase portfolio content.

Display published blog posts.

Provide a user-friendly website interface.

Admin Panel

Admin login interface.

Admin dashboard.

Manage blog content through the admin section.

Create and publish blog posts.

Backend

Handle HTTP requests using Spring MVC.

Process application logic through the service layer.

Manage database operations through the repository layer.

Store application data in MySQL.

Technologies Used

Technology

Purpose

Java

Backend programming

Spring Boot

Backend application framework

Spring MVC

Request handling and routing

Spring Data JPA

Database interaction

MySQL

Relational database

HTML

Web page structure

CSS

Website styling

JavaScript

Frontend interactions

Maven

Dependency management and build tool

Project Architecture

The application follows a layered architecture.

PortfolioBlogCMS/
│
├── Portfolio/
│   └── Portfolio frontend files
│
├── Controller/
│   └── Handles HTTP requests
│
├── Service/
│   └── Contains business logic
│
├── Repository/
│   └── Handles database operations
│
├── Blog/
│   └── Blog-related model/entity classes
│
└── README.md

Layer Responsibilities

1. Controller Layer

Receives HTTP requests.

Maps URLs to application methods.

Returns appropriate views or responses.

2. Service Layer

Handles business logic.

Processes blog-related operations.

Communicates with the repository layer.

3. Repository Layer

Communicates with the MySQL database.

Performs database operations using Spring Data JPA.

4. Blog Layer

Contains blog-related data models/entities.

Represents blog information stored in the database.
