# Java

## [0] Characteristics of Java

* (1) Main function should belong to class named java file name

* (2) Access modifier is necessary for class: `Public` or Private

* (3) 

> ```java
> public class Main {
>   public static void main() {
>     ...
>   }
> }
> ```

----

## [1] Data Type 

### [Data Type - Primitive Data Type]
> for storing simple values like numbers, strings and booleans.
> > <img width="190" alt="IMG" src="https://user-images.githubusercontent.com/73331241/169656914-35cd8e20-1c15-4c89-b15c-7239f0e24556.png">

```bash
Java sees the integer number as `int`
Java sees the floating point number as `double`

Thus, when we use long type, we need to add `L` at the end of the number
Thus, when we use float type, we need to add `F` at the end of the number
```

### [Data Type - Reference Date Type]
> In Java we have 8 primitive types. All the other types are reference types.
> 
> These types `don’t store the actual objects in memory`. They `store the reference` (or the address of) an object in memory.
>
> `Therefore`, To use `reference types`, we need to allocate memory using the `new operator`.
> 
> The memory gets automatically released when no longer used. 
>
> However, since we use String type often, we don't need to use `new operator` for String. (`String is immutable`)


* Data Type Example Code
```java
//Primitive Data Type
long viewsCount = 3_123_456_789L;
float price = 10.99F;

//Reference Date Type
Date now = new Date();
String young = "HIHI";

String message = "Hello World"+"!!";
System.out.println(message.length());
// 13
System.out.println(message.indexOf("e"));
// 1
System.out.println(message.replace("!", "*"));
// Hello World**
System.out.println(message.toLowerCase());
// hello world!!
```

## [2] Array
> We use arrays to store a list of objects. We can store any type of object in an array
> (primitive or reference type). All items (also called elements) in an array have the
> same type.

#### [Array - Arrays Class]
> The Array class provides a few useful methods for working with arrays.

> For printing purpose, `Arrays.toString(ARRAY_NAME)`.

```java
// Creating and and initializing an array of 5 elements
int[] numbers = new int[3];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;

// Shortcut
int[] numbers = { 10, 20, 30 };

// Printing
System.out.println(numbers);
//[I@2d98a335

System.out.println(Arrays.toString(numbers));
//[10, 20, 30]

//Sorting
int [] numbers = {2,3,5,1,4};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
//[1, 2, 3, 4, 5]

// Printing multi-dimensional array
int[][] numbers = new int[2][3];
numbers[0][0] = 1;
System.out.println(Arrays.deepToString(numbers));
//[[1,0,0],[0,0,0]] 
       
```

----

## [3] Global Variable
> Use `final` statement in front of the data type

```java
final float PI = 3.14F;
```

----

## [4] Casting and Type conversion
In Java, we have two types of casting: `Implicit Type Casting`, `Explicit Type Casting`

### [Casting and Type conversion - Implicit Type Casting]
> happens automatically when we store a value in a larger or more precise data type.

  * `byte > short > int > long > float > double`

```java
short x = 1;
int y = x + 2;
System.out.println(y);
```

### [Casting and Type conversion - Explicit Type Casting]
> we do it manually. 

* To convert a string to a number, we use one of the following methods: 

• Byte.parseByte(“1”)

• Short.parseShort(“1”)

• Integer.parseInt(“1”)

• Long.parseLong(“1”)

• Float.parseFloat(“1.1”)

• Double.parseDouble(“1.1”) 


## [5] Math

```java
int result = Math.round(1.1F);

int result = (int) Math.ceil(1.1F) // Math.ceil returns double datatype

int y = Math.max(14,15);

double y = Math.random(); // get floating point number between 0 to 1

double y = Math.random() * 100; // get floating point number between 0 to 100
```


## [6] Reading input
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Age: ");
byte age = scanner.nextByte();
// String line = scanner.nextLine();
System.out.println("You are " + age);
```

## [7] Comparison Operators
```java
int x = 1;
int y = 1;
System.out.println(x == y);
// true
```

## [8] Logical Operators
> And operator: &&
> Or operator: ||


## [9] Condition Operators
```java
int temp = 32;
if (temp > 30){
    System.out.println("It's a hot day");
    System.out.println("Drink water");
}
else if (temp > 20)
    System.out.println("Beautiful day");
else
    System.out.println("Cold day");
```

##### [Condition Operator - Switch statement]
```java
String role = "admin";
switch (role) {
    case "admin":
        System.out.println("You're an admin");
        break;

    case "moderator":
        System.out.println("You're a moderator");
        break;

    default:
        System.out.println("You're a guest");
}
```

## [10] Ternary Operators
```java
String className = income > 100_000 ? "First" : "Economy";
```


## [11] Loops

### [Loops - for loop]

```java
for (int i = 0; i < 5; i++)
{
    System.out.println("Hello World" + i);
}
```

```java
String[] fruits = {"Apple", "Mango", "Orange"};

for (int i = fruits.length; i > 0; i--)
    System.out.println(fruits[i]);
   
for (String fruit : fruits)
    System.out.println(fruit);
```

### [Loops - while loop]

```java
i = 0;
while(i<10)
{
    System.out.println("Hello World" + i);
    i++;
}

// Application
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit)) {
    System.out.print("Input: ");
    input = scanner.next().toLowerCase();
    System.out.println(input);
}
```

----

# Object-Oriented Programming

----
Super basic of the class

class: logical entity (Human-being, Lecturer, vehicle and so on)

> Every enitity has its own attributes(height and feet) and behavior (speak, work and eat)


object: instance of the class


setter: the behavior function to set the class's attributes

> naming convention: public String setName(String name)

getter: the behavior function to get the class's attributes
> naming convention: public String getName()


`this` keyword means `current object`.
can direct current class's attributes and behavior functions

----

--------

Access Modifiers

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170847512-7842fe0d-cf71-48ae-a048-cd2cc5b0e4b2.png">



> if we didn't provide the modifier, it automatically set `no modifier`


<img width="150" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170847794-4b40f54b-caf8-44db-a210-41ffd48bd694.png">

> This case, the Main.java and Test.java are in the different package

* Child class
```java
// Parent class: Bicycle
// Child  class: MountainBike

public class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear); // Use super statement as the first statement of initializer
        this.seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        this.seatHeight = newValue;
    }
}
```

* Main class
```java
public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10 , 1);
        System.out.println("Bike speed is: "+ mountainBike.speed);
        
        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
    }
}

/*
Bike speed is: 10
Bike speed after applying brake is: 9
*/
```

put the extra property in child class and mention it in front of the argument initializer

--------

------------

Inheritance
> A class that is derived from another class is called a subclass (also child class or extended class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170847919-78f89a7b-bd42-4587-a4a5-8094713f6650.png">

> From child class, use extends keyword to inheritate

------------

Encapsulation
> To restict the outside world accessing the property of a class


(1) set the Access Modifiers of attributes as private

(2) make set and get function for outside world can access to particular property
> From IntelliJ, we can generate the functions by clicking `generate` in the right mouse button
------------

----------------

Abstraction

> Hide very detail to provide the very simple interface to user
> 
> Abstract classes cannot be instantiated, but they can be subclassed
> 
> An abstract method is a method that is declared without an implementation just for `declaration`


Code
Making abstract class: put the abstract keyword before the class keyword

> By mentioning abstract keyword, it automatically gets properties
> First property: Abstract class must have at least one abstract behavior function (abstract void draw();)
> > put the `abstract` keyword before the behavior functions
> 

So, how to implement those abstracted behavior functions?
> We have extend this abstract class by creating child class
> 
> Child class should cover all the implementation of all the abstract behavior functions in the abstract class
>
> Child class for abstract class can be multiple.

rightside of initializsation should be implementation child class

* [0] Abstarct class - GraphicObject
```java
public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY){
        System.out.println("move to x: "+x+" and y:"+y);
    }
    abstract void draw();
    abstract void resize();
}
```

* [1] Child class - Circle

```java
public class Circle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    @Override
    void resize() {
        System.out.println("Resizing a circle");
    }
}
```

* [2] Child class - Rectangle

```java
public class Rectangle extends GraphicObject{
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a Rectangle");
    }
}
```

* [3] Main Class of Abstract Practice
```java
public class AbstractDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
```

----------------



<!--
https://www.udemy.com/course/oo-se-java/
-->


## [Useful Material]

##### Useful shortcut
> sout: System.out.println();
> 
> Shift+F6: replace selected message
> 
> psvm: public static void main(String[] args)


##### Name convention: CamelCase
> capitalize all the words except first word

```java
int myAge
int herAge
```

how to
split
f""



<!--
### Lec: 1:12:46 - 22/05/22 (https://www.youtube.com/watch?v=eIrMbAQSU34&t=296s)

We called the functions which belong to the class as METHODs

-->
