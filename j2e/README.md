Projet Cookie
=============

This is the demonstration code for the course "Serveur d'Entreprise" [2014]

Please use the following command to run the server:

mvn clean package tomee:run 

To launch the distant server, please use the option -DskipTests 

mvn clean package tomee:run -DskipTests "host"

Then, open http://localhost:8080/


####The program follows the following structure :  


- Package "entities" : contains the persistant objects and the classes "manager" and "finder" that are used to write and search in the database  
	Eg. Choose a shop and take an appointment ("rendezvous") to pick-up Cookie order :   
	Rendezvous			//Entity that contains getters and setters   
	RendezvousFinder		//Interface that allows to search the entities in the database  
	RendezvousFinderBean		//Implementation of the interface RendezvousFinder  
	RendezvousManager		//Interface that allows to add or delete an entity from the database  
	RendezvousManagerBean		//Implementation of the interface ManagerRendezvous  


- Package "domain" : contains the classes that manage the different functionalities   
	Eg. Following same example:  
	PrendreRendezvous		//Interface that contains the method "PrendreRendezvous"  
	PrendreRendezvousBean		//Implementation of the interface PrendreRendezvous that uses the classes RendezvousFinderBean and 						RendezvousManagerBean to create a Rendezvous  
	

- Package "webservice" : contains the classes that provide the web services required by the client  
	Eg. Following same example:  
	ServicePrendreRendezvous	//Interface that allows the user to choose a shop and a date for his/her Rendezvous  
	ServicePrendreRendezvousBean	//Implementation of the interface ServicePrendreRendezvous that uses the class PrendreRendezvousBean to 					create a Rendezvous in a given at shop at a given time  


- Package "presentation" : contains the classes jsf   





