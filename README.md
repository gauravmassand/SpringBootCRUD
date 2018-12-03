# SpringBootCRUD
Spring Boot Application for performing CRUD operations
It is Spring Boot application for perfroming basic CRUD operations.
APIs available :

1. Post Request : /customers 
Request Body Customer Object 
This will insert a new Customer 

2. Get Request :/customers
This will retreive the list of all customers

3. Get Request : /customers/{customerId}
This will fetch the customer details for particular id

4. Put Request : /customers/{customerId}
Request Body :Customer Object
This will update the customer of the particular customer Id.

5. Delete Request :/customers/{customerId}
This will delete the customer for customer Id

Customised Error Handler :
When a particular customer is not found instead of giving 500 server error it gives Customised Exception defined in Error handler

Customer Object :
Customer Object consists of id,firstName,lastName,email

Filters:
It also contains filters which are used when serving every request.
