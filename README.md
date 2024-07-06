# Personal Expense Tracker
This is a RESTful API for a Personal Expense Tracker application built with Java and Spring Boot. It supports CRUD operations on expenses and user authentication with JWT. There are two types of users: admin with full rights and secondary users with view-only rights.

# Features
* Authentication and Authorization
  * Bearer Token Authentication using JWT
  * Role-based access control (Admin and Secondary User)
* Expense Management
  * CRUD operations on expenses
  * User Management
* Role-based access control with specific permissions for different roles

# Endpoints Authentication:

This API provides endpoints to manage users, roles, and accounts in an expense tracking application. 
It uses token-based authentication and follows role-based access control.
PUT / PATCH / DELETE operations are reserved only for ADMIN roles.

# Project Management
with [Trello](https://trello.com/b/7UEVtP7K/ironhack-final-project)

# UML class

Initial UML class diagram before building application:
with [UML class diagram with Lucid app](https://lucid.app/lucidchart/4997b6d4-f125-4aeb-8e9e-b4684ca19e0c/edit?invitationId=inv_968bdb5c-7366-4d34-9504-787e16fb16e0)
Updated UML classes and trees are in the project folder at the same level as the ReadMe.md.

# DEMO url

[prezi DEMO presentation](https://prezi.com/view/bXWuU442LVVUtxOQecD6/)

## Project Concept

* Personal Expense Tracker Application
* helps users keep track of their expenses
* included checking and savings accounts
* access is password protected
* roles can be wither ADMIN (full CRUD) or USER (only GET, PUT)

## RUN REACT FRONTEND

Run `npm install`.

Start the React development server by running `npm start`

The REACT frontend is just proof of concept.
It should allow user login, but only has first page for now...
// TODO add pages...


