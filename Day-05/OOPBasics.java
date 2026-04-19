// Day-05: Object-Oriented Programming (OOP) Basics

// 1. DEFINING A CLASS
class Car {
    // Instance variables (attributes)
    String color;
    String model;
    int year;
    double speed;
    
    // Constructor - initializes objects
    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.speed = 0.0;  // Default speed
    }
    
    // Methods (behaviors/actions)
    void accelerate(double increase) {
        speed += increase;
        System.out.println(model + " accelerated to " + speed + " km/h");
    }
    
    void brake(double decrease) {
        speed -= decrease;
        if (speed < 0) speed = 0;  // Can't go negative
        System.out.println(model + " braked to " + speed + " km/h");
    }
    
    void displayInfo() {
        System.out.println("Car: " + color + " " + model + " (" + year + ")");
        System.out.println("Current Speed: " + speed + " km/h");
    }
}

// 2. ENCAPSULATION EXAMPLE - Using private variables with getters/setters
class Student {
    private String name;  // Private - can't be accessed directly
    private int age;
    private double gpa;
    
    // Constructor
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        setGPA(gpa);  // Using setter for validation
    }
    
    // Getter for name
    String getName() {
        return name;
    }
    
    // Getter for age
    int getAge() {
        return age;
    }
    
    // Getter for GPA
    double getGPA() {
        return gpa;
    }
    
    // Setter for GPA with validation
    void setGPA(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0");
        }
    }
    
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}

// 3. MAIN CLASS - Using objects
public class OOPBasics {
    public static void main(String[] args) {
        System.out.println("===== OOP BASICS =====\n");
        
        // Creating objects (instances) of Car class
        Car car1 = new Car("Red", "BMW", 2023);
        Car car2 = new Car("Blue", "Tesla", 2024);
        
        System.out.println("--- Car Objects ---");
        car1.displayInfo();
        car1.accelerate(50);
        car1.accelerate(30);
        car1.brake(20);
        System.out.println();
        
        car2.displayInfo();
        car2.accelerate(100);
        car2.brake(50);
        System.out.println();
        
        // Creating Student objects with encapsulation
        System.out.println("--- Student Objects (with Encapsulation) ---");
        Student student1 = new Student("Raj", 20, 3.8);
        Student student2 = new Student("Priya", 21, 3.5);
        
        student1.displayDetails();
        student2.displayDetails();
        System.out.println();
        
        // Modifying through setters
        student1.setGPA(3.9);
        student1.displayDetails();
        
        // Invalid GPA attempt
        student2.setGPA(5.0);  // This will show error message
        
        // Using getters
        System.out.println("\nAccessing via getters:");
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 2 GPA: " + student2.getGPA());
    }
}

/*
KEY OOP CONCEPTS COVERED:
1. CLASS - Blueprint for objects
2. OBJECT - Instance of a class
3. CONSTRUCTOR - Initializes objects
4. INSTANCE VARIABLES - Data members (attributes)
5. METHODS - Functions within class (behaviors)
6. THIS KEYWORD - Refers to current object
7. ENCAPSULATION - Private variables with public getters/setters
8. VALIDATION - Checking data before setting values

NEXT STEPS:
- Practice creating different classes
- Understand access modifiers: private, public, protected
- Learn about Inheritance (extending classes)
*/
