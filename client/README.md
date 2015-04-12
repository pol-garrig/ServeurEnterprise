Projet Cookie
=============

This is the demonstration code for the course "Serveur d'Entreprise" [2014]

Please use the following command to run the client:

mvn clean package exec:java 

Then, open http://localhost:8080/

To connect the client to a distant server:

mvn exec:java -Dexec.args="host"


####The program follows the following structure :  

There are 3 Stubs, that are auto-generated from the web services required by the client.  
The class "demo" simulates the three following use cases :  
- Scenario Create a Shop, that allows the Franchise Manager to create a cookie shop  
- Scenario Choose a Shop, that allows any user to choose a shop from a list to take a "rendezvous" to pick-up the cookie order  
- Scenario Create an Order, that allows any user to choose a cookie from a list, take a "rendezvous" for pick-up and visualize the purchase order (including the order price, the quantity of cookies, the shop and the date of pick-up)   



