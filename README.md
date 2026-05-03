Smart Device Ecosystem (Mini Project #2)
# Project Description
This project is a Java-based application that demonstrates the concept of Inheritance in Object-Oriented Programming (OOP). It models different types of devices such as phones, laptops, gaming laptops, and smartwatches using a hierarchical class structure.
The program allows users to interact with different devices through a menu-driven interface and observe how each device behaves differently.
# Objectives
To understand and apply inheritance in Java
To demonstrate relationships between superclass and subclasses
To implement method overriding and constructor chaining
To explore different types of inheritance structures
  # Class Structure
Device (Base Class)
│ 
├── Phone
├── Laptop
| └── GamingLaptop
└── SmartWatch 
# Key Concepts Implemented
- Inheritance (extends keyword)
Subclasses inherit properties and methods from the base class Device.
- Superclass vs Subclass
Device → Superclass
Phone, Laptop, SmartWatch → Subclasses
- Single Inheritance
Phone extends Device
- Multilevel Inheritance
GamingLaptop extends Laptop, which extends Device
- Hierarchical Inheritance
Multiple classes (Phone, Laptop, SmartWatch) inherit from Device
- Multiple Inheritance Restriction
Java does not support multiple inheritance with classes. This project follows single inheritance structure.
- Protected Access Modifier
The brand and battery variables are declared as protected so subclasses can access them.
- Method Overriding
Each subclass overrides the useDevice() method to provide specific behavior.
- this Keyword
Used to refer to the current object’s instance variables.
- super Keyword
Used to call superclass constructors
Used to access superclass methods
- super() Constructor Calls
Used in subclasses to initialize inherited attributes.
- final Class
SmartWatch is declared as a final class and cannot be extended.
- final Method
The turnOff() method in the Device class cannot be overridden.
- Method Hiding (Static Methods)
Static methods like info() are redefined in subclasses.
- Implicit super()
If not explicitly written, Java automatically calls the superclass constructor.
  # How the Program Works
The program starts from the Main class.
Objects of different device types are created.
A menu is displayed to the user.
The user selects a device to interact with.
The corresponding method is executed based on the selected option.
The program continues until the user chooses to exit.
# How to Run the Program
Open the project in your Java IDE (e.g., IntelliJ IDEA)
Compile all classes
Run the Main.java file
Follow the menu instructions in the console
# Files Included
Device.java (Base class)
Phone.java
Laptop.java
GamingLaptop.java
SmartWatch.java
Main.java
 Conclusion
This project demonstrates how inheritance helps in creating a clean and reusable code structure. It shows how different objects can share common features while having their own specific behaviors.
👤 Author
Rediet
