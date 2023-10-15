# GatherGrid
*An Events Management Website*

## Documentation

This document provides details on the initial setup and configuration for the first part of the GatherGrid project. GatherGrid is a website that utilizes technologies such as Jakarta EE, JSP, Hibernate, Servlet, and other related technologies.

### UML Diagram
You can access the UML diagram for this project [here](https://drive.google.com/file/d/1ukgltu4HXmmiBe9fbt0DVx3ulb6cAhrv/view?usp=sharing).

### Tools and Technologies

- **Build Tool:** Maven
- **Relational Database Management System (RDBMS):** MySQL

## Dependencies

To run the GatherGrid project, you will need the following dependencies:

- `jakarta.jakartaee-api: 10.0.0`
- `Hibernate-core: 6.2.4.Final`
- `mysql-connector-java: 8.0.33`
- `jakarta.servlet-api: 6.0.0`

## Jakarta EE Application Server

GatherGrid is designed to run on GlassFish 7.0.9. Make sure to set up your environment with the following configuration:

- **Database Name:** gathergriddb

## Getting Started

To get the project up and running, follow these steps:

1. Install Maven dependencies.
2. Download GlassFish 7.0.9 and unzip it.
3. Add the GlassFish path to your server configuration in your Integrated Development Environment (IDE).
4. Create a database and specify the database name, username, and password in the `persistence.xml` file.
5. Run the project from your IDE.
