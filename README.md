Design Patterns Homework:

Pizza = Factory class, uses PizzaType interface to get the type of the pizza: 
Capriciosa, Capricio, Quatro Stagioni, Pollo, Margherita

Every type of Pizza has its own ingredients and its own possibilities of extras, 
only 3 can be added


Lunch = Singleton and Builder; Lunch builds the meal by adding items to it

Item = interface

Pizza and Drink implement the Item interface

Question: In the Lunch class, I have the method getCost, which calculates the 
total cost of the order, by adding each item's cost to the total.
To get the price of each kind of Pizza, the classes that represent kinds of pizza, should 
extend the Pizza class that implements the Item, but that would mean that the Pizza class should 
be abstract, in order to override the price method, and that would mean that I can't instantiate the
Pizza class in the main method, and I need to instantiate it. In the end, I decided to get the cost from
the Pizza, a general cost that doesn't depend on the Pizza type, but I wanted to ask you how can I have a 
particular cost for every type in this approach?

OrderStrategy : 1. uses the Strategy interface to choose from the kind of order
the client wants, normal or fast order
		
		2. uses the abstract class Observer that notifies the observers: Client and Curier 
when an order is ready