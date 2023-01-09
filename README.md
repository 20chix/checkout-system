# Checkout System
This is a checkout system that calculates the total price of a number of items based on their unit prices and special pricing rules. The items are identified by their SKUs, which are single letters of the alphabet (e.g. A, B, C, etc.).

## Features
- Calculates the total price of a list of items
- Supports the following special pricing rules:
  - MultiPriced: buy n of them and which will cost you y. For example, item A might cost 50 pence individually but this week we have a special offer where you can buy 3 As for £1.30.
  - Buy n get 1 free
  - Meal deal: buy different items together and get a special price. For instance, items D and E might cost 150 and 200 pence each individually but this week we have a special offer where you can buy one of each for just £3.


### Running the Code
To run the code, you will need to have the following installed:
- A Java Development Kit (JDK)
- Maven
With these prerequisites installed, you can build and run the code as follows:
1. Clone the repository to your local machine:

```
git clone https://github.com/<your-username>/checkout-system.git
```

2. Navigate to the project directory:

```
cd checkout-system
```

3. Build the project using Maven:

```
mvn package
```
4. Run the tests to verify that everything is working correctly:
```
mvn test
```

### Development
This project was developed using Test-Driven Development (TDD). The code is written in Java and follows SOLID 
design principles. JUnit is used for testing.
