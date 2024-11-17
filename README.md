# Personal Expense Tracker
This is a RESTful API for a Personal Expense Tracker application built with Java and Spring Boot. It provides HTTP endpoints that support expense management, user authentication with JWT, and role-based access control.

# Features
* Authentication and Authorization
  * Bearer Token Authentication using JWT
  * Role-based access control (Admin and Secondary User)
* Expense Management
* HTTP endpoints for managing expenses (GET, POST, PUT, DELETE)
  * User Management
* Role-based access control with specific permissions for different roles

# API Endpoints

This API provides HTTP endpoints to manage users, roles, and accounts in an expense tracking application. It uses token-based authentication and follows role-based access control.

- GET operations are available for all authenticated users
- POST, PUT, and DELETE operations are reserved only for ADMIN roles

# Project Management
with [Trello](https://trello.com/b/7UEVtP7K/ironhack-final-project)

# UML class

•Initial UML class diagram created before building application (using Lucid app) [UML class diagram with Lucid app](https://lucid.app/lucidchart/4997b6d4-f125-4aeb-8e9e-b4684ca19e0c/edit?invitationId=inv_968bdb5c-7366-4d34-9504-787e16fb16e0)
* Updated UML classes and trees are in the project folder at the same level as the ReadMe.md.

# DEMO url

[prezi DEMO presentation](https://prezi.com/view/bXWuU442LVVUtxOQecD6/)

## Project Concept

Personal Expense Tracker Application:
 - Helps users keep track of their expenses
 - Includes checking and savings accounts
 - Access is password protected
- Roles can be either ADMIN (full access) or USER (read-only access)

# Data Operations
- CREATE: Add new expenses or accounts
- READ: View existing expenses and account information
- UPDATE: Modify expense details or account information (ADMIN only)
- DELETE: Remove expenses or accounts (ADMIN only)

## RUN REACT FRONTEND

The first page of the REACH frontend for this project is here:
https://github.com/laloosun/ReactFrontEndLogin_IRONHACK_bootcamp.git

Run `npm install`.

Start the React development server by running `npm start`

The REACT frontend is just proof of concept.
It should allow user login, but only has first page for now...
// TODO add pages...


