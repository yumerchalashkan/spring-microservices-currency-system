# Spring Microservices Currency System
This project utilizes the Spring Cloud framework to create a currency conversion system. The system consists of four microservices that work together to achieve the goal of converting between different currencies.



![Alt text of the image](https://yumer.dev/images/portfolio/microservice/p2.png)
<br />
<br />
<br />
Instances of microservices on Eureka server
![Alt text of the image](https://yumer.dev/images/portfolio/microservice/p1.png)

# Microservices
1. Currency-Service - This microservice is responsible for maintaining a database of currency names and their conversion values against one another. It serves as the foundation for the rest of the system, providing the necessary data for the currency conversion to occur.

2. Currency-Conversion - This microservice utilizes the data from the 'currency-service' microservice to calculate the appropriate currency conversion. It communicates with the 'currency-service' microservice using a Feign client for easy and efficient communication.

3. Naming Server (Eureka) - This service allows for the management of instances of microservices, making it easier for them to communicate with one another. Additionally, the Eureka server is also able to perform load balancing, distributing the workload evenly among the instances of the microservices.

4. Gateway - To improve the user experience and make the URLs more user-friendly, a gateway is added to the project. This gateway allows for direct use of the instance names in Eureka, rather than requiring the use of specific URLs for each microservice.


