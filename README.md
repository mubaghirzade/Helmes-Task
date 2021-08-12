# Helmes-Task
- - - 
###Running the project
* Checkout the source codes
* Run 'mvn clean install' command
* Run 'mvn spring-boot:run' command

Project will be running on localhost:8080

- - -
###Database
 Runtime H2 database is used. Schema and initial data will be created automatically.
 Accessing to the runtime database:
 - localhost:8080/h2-console
    * JDBC url: jdbc:h2:mem:app 
    * username: sa
    * no password
