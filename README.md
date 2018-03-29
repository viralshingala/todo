# README #

Read below guideline for run the project.

# What is this repository for?

This repository for Todo Application. Where you can performs some basic operations related to Task. Which all are mentioned below.

  - Add new task
  - Mark as completed
  - Update task description
  - Delete particular task

# How do I get set up?
Backend Service setup:
  - Install maven and goto todo-backend directory
  - Execute below commands
```sh
$ mvn package
$ java -jar todoapp-0.0.1-SNAPSHOT.jar
```
Here you get your todo services are up and running. you can check on localhost:8080/api/{operations}

WebApp setup:

- Install NPM
- Download OR clone this repository and after that go to webapp directory
- Execute below commands
```sh
$ npm install
$ ng serve --open
```
Here you get yourwebapp is up and running. you can check on localhost:4200

###  H2 Database Console

In this application in memory H2 database used. Once your application is up and running you can access H2 DB console using [localhost:8080/h2-console]
