# Java

## [0] Characteristics of Java


Good software practice: (1) Contain variables in scopes, (2) Declare variables close to where they are needed



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
> 
> `Additionally, once the size of the array is allocated, an array cannot change size.`

#### [Array - Useful methods]

* (1) Get the length of the Array
    * arrayVariable.length
   
* (2) Print the Single Array
    * For printing purpose, System.out.println(`Arrays.toString(ARRAY_NAME)`).

* (3) Print the Double Array
    * For printing purpose, System.out.println(`Arrays.deepToString(ARRAY_NAME)`).

```java
// Creating and and initializing an array of 5 elements
int[] numbers = new int[3];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;

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
* To convert a `string` to a number, we use one of the following methods: 

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


## [] Function
Main idea: Abstraction(Generalize an idea to make it more widely applicable)


Heat 200 cc water to 100 degrees
Stir in 5 grams of yeast
Melt butter and stir in the vanilla with the butter
After 5 minutes, combine yeast with butter, sugar, and flour
Place the mixture in a 110 degree oven to rise for 45 minutes
Divide the mixture into 10 equally sized portions and cook for 45 minutes at 350 degrees

Abstraction
1. Mix with spoon thing1 /  thing2 / speed
2. Apply heat - element / time / degree

Implementation:
(1) Types of inputs
(2) Types of output

`public static`: idiomatic expression

```java
public static int mpy(int c, int d){
   int sum = 0;
   for(int i = 0; i < d; i++){
      sum += c;
   }
   return sum;
}
```






## [] Recursion

<!--
(Best material for understanding: 6.80~6.85)
-->

> Formula-provided `Explicit Recursion(Easy)`, such as factorial, is `so easy` to solve.
> 
> However, since there are lots of occasion which is not the Explicit Recursion. Thus, we `need to convert` difficult one `to Explicit Recursion format`.

#### [Recursion - Composition of Recursion]
<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/171802900-9eac4217-5d16-4820-b0ca-013bfe7cd92e.png">


#### [Recursion - Algorithm Perspective]
> (1) Find the tiny piece
> 
> (2) deeply consider how to express non-tiny pieces in `mpy(x, y-1)` format


#### [Recursion - Understanding Basic Principle of Recursion]

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172029783-04d1afb9-ea61-4a0b-a162-593730f7aeb3.png">

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172029601-d0756c3e-b1bb-45c9-8ba0-6cd216e1f0f3.png">

#### [Recursion - Understanding the Principle Inside of the Code]

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172029785-279cc962-05ec-48f4-87b2-ff6ba68e2f59.jpeg">


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
### [Loops Array- for loop]
```java
for (int i:array){
   System.out.println("I have a number: " + i);
}
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
## [0] Basic of the class

> ##### (1) class: `logical entity` (Human-being, Lecturer, vehicle and so on)

> ##### (2) Inside of the class: Every enitity has its `own attributes(properties)`(height and feet) and `behavior functions` (speak, work and eat)

> ##### (3) object: instance of the class

> ##### (4) constructor: A constructor is a special function that creates and initializes an object instance of a class
      > The constructor has the same name as the object type.
      > 
      > The constructor can have parameters, but it has `no return type`
      > 
      > It is responsible for giving birth to the object. (Initializing instance variables)
      > 
      > There can be more than on constructor.

> ##### (5) Instance variables(attributes): usually declared `private` for encapsulizing
      > Methods can read and write these variables

> ##### (6) methods(behavior functions)
      > (6-1) getter method: returns the value of the instance variable balance

> `this` keyword: `current object`. It can direct current class's attributes and behavior functions

```java
public class Account {
   private int balance;
   
   public Account(int initialBal) {
      this.balance = initialBal;
   }
}
```

----

--------

## [1] Access Modifiers

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170847512-7842fe0d-cf71-48ae-a048-cd2cc5b0e4b2.png">

> if we didn't provide the modifier, it automatically set `no modifier`


<img width="150" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170847794-4b40f54b-caf8-44db-a210-41ffd48bd694.png">

> This case, the Main.java and Test.java are in the different package

--------

------------

## [2] Inheritance
> A class that is derived from another class is called a `subclass` (also child class or extended class).
> 
> The class from which the subclass is derived is called a `superclass` (also a base class or a parent class).

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170847919-78f89a7b-bd42-4587-a4a5-8094713f6650.png">

> From child class, use `extends` keyword to inheritate

> put the `extra properties` of child class in front of the initializer function



* Parent class
```java
public class Bicycle {
    protected int gear;
    protected int speed;

    // Initializer
    public Bicycle(int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void setSpeed(int newValue){
        speed = newValue;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
}
```

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

------------

## [3] Encapsulation

> Hide details and contain variables and code to avoid unwanted interactions
> 
> To restict the outside world accessing the property of a class


(1) set the Access Modifiers of `attributes` as `private`

(2) make `set and get function` for outside world can access to `particular properties`

* Useful information for set function and get function
> From IntelliJ, we can generate the functions by clicking `generate` in the right mouse button


```bash
setter: the behavior function to set the class's attributes
> naming convention: public String setName(String name)

getter: the behavior function to get the class's attributes
> naming convention: public String getName()
```

------------

Car and Boat are different.

But both have initial price and cost per year. Those `common behaviors` can be expressed through interface


Lists `Syntax: List<T>`

> An ordered collection of elements

> A `List<T>` contains elements `only of type T`

> Fortunately, T can be a general type such as `List<Number>` which are able to contain Double, Integer, Long, etc. (`Object` is the most general type of all)
   

```java
List<Color> colors;
List<String> names;
List<Double> values;
List<Account> customers;
```

By list, we can do:
> Add things to the list
> Indexing
> Where is the element on the list
> Remove the value from the list
> Find out the length of the list


------------

## [4] Abstraction
> Abstraction is a process of `hiding the implementation details` from the user,
> 
> `only the functionality` will be provided to the user.
> 
> In other words, the user will have the information on `what the object does` instead of `how it does it`.


> Abstract classes `cannot be instantiated`, but they can be subclassed
> 
> An abstract method is a method that is declared without an implementation just for `declaration`


* Code
> (1) making abstract class: put the abstract keyword before the class keyword
> 
> (2) put the `abstract` keyword before the behavior functions
> 
> (3) By mentioning abstract keyword, it automatically gets properties
> 
> (4) First property: Abstract class must have `at least one abstract behavior function` (abstract void draw();)
> 
> (5) allow abstract class its own method
> 
> (6) rightside of initializsation should be implementation child class
> 
> > ```java
> > GraphicObject circle = new Circle();
> > GraphicObject rectangle = new Rectangle();
> > ```
 

* So, `how to implement` those abstracted behavior functions?
> (1) We have extend this abstract class by `creating child class`
> 
> (2) Child class `should cover all the implementation` of all the `abstract behavior functions` in the abstract class
>
> (3) Child class for abstract class `can be multiple`.


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

* (1) Child class - Circle

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

* (2) Child class - Rectangle

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

* (3) Main Class of Abstract Practice
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

--------------------

## [5] Interface
> Interface is going to define the specifications of how a class works at.
> 
> Interface is going to contract the specifications of how a application behaves.


Interface in Java
> In the Java programming language, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
> 
> Method bodies exist only for default methods and static methods.
> 
> Interfaces cannot be instantiated - they can only be implemented by classes or extended by other interfaces. Extension is discussed later in this lesson.

Use `interface` keyword instead of `class` keyword.

We can only declare methods, we cannot implements.

not allow interface its own method(concrete implementation) and any variable

interface allow only public static variable

Interface does not require `super method`, because we have nothing to initialize


`Child class` of the interface should provide the implementation




Abstract Classes vs Interfaces:

> The biggest difference between them is purpose. 

> Abstract classes: Generalize Behavior
> 
> Interfaces: Standardize Behavior




<!--
----

# Data Structure
> is a way of organizing data so that it can be used effectively.


* Why Data Structures are important?

       * They are essential ingredients in creating fast and powerful algorithms.
       * They help to manage and organize data.
       * They make code cleaner and easier to understand.


* Abstract Data Types vs Data Structures

       * An abstract data type (ADT) is an abstraction of a data structure which provides only the interface to which a data structure must adhere to.

       * The interface does not give any specific details about how something should be implemented or in what programming language. 

       > Specific details would be data structure itself.


> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170902061-822bfc79-ead3-42b3-b661-c635acb0dd0f.png">



* Complexity Analysis

> As rogrammers, we often find ourselves asking the same two questions over and over again:
> 
>      > How much time does this algorithm need to finish?
>      > 
>      > How much space does this algorithm need for its computation?



> Big-O Notation
> > Big-O Notation gives an upperbound of the complexity in the worst case, helping to quantify performance as the input size becomes arbitrarily large.

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170902442-231f6219-d054-414d-bc03-5842e8889b46.png">



(1) The following run in constant time: O(1)

> If loop doest not depend on n, it takes constant time to run

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170902890-369da846-58ad-431e-bf6e-9124705847de.png">


(2) The following run in linear time: O(n)

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170903033-cc06a29a-82a8-4074-94b4-7d93a9395bb4.png">


(3) The following run in quadratic time: O(n(^2))
> From the second example below, since it is factorial, the summation is n(n+1)/2. Thus, it is also quadratic time.
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170903197-aad17212-f20e-469f-89e1-d884c6f2ed1b.png">

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170903244-fdafb1ad-ee24-4f5c-a68e-a68a468104ff.png">

(4) The following run in logarithm time: O(log(n))
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170903536-0a6dafaf-fadd-4bfd-9807-f44a4eeb21a4.png">

(5) Other time complexitie
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170905011-0d479ab1-3de9-454d-b6b8-3b0777018c94.png">



## [] Array
*Array - Static Array
> a fixed length container containing n elements indexable from the range [0, n-1]

> When and where is a Static Array used?
> > Used from everywhere.
> 
> > 1) Storing and accessing sequential data
> >
> > 2) Temporarily storing objects
> >
> > 3) Used by IO routines as buffers
> > 
> > 4) Lookup tables and inverse lookup tables
> > 
> > 5) Can be used to `return multiple values` from a function
> > 
> > 6) Used in dynamic programming to cache answers to subproblems.

* Complexity

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170980400-01c8f03a-1b6c-4608-b866-4d870b2ffcc2.png">


*Array - Dynamic Array
> The dynamic array can grow and shrink in size.

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170981316-a2e65902-b3e5-4626-904d-b63d274b87d3.png">

> Q: How can we implement a dynamic array?
> A: One way is to use a static array
> 
> 1) Create a static array with an initial capacity.
>
> 2) Add elements to the underlying static array, keeping track of the number of elements.
> 
> 3) If adding another element will exceed the capacity, then create a new static array with twice the capacity and copy the original elements into it.

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/170982399-92401079-6c08-4d6e-8705-326aa3580a6d.png">


-->

--------------------


<!--
https://www.udemy.com/course/oo-se-java/
-->


## [Useful Material]

##### Useful shortcut
> "sysout", then Ctrl + Space: System.out.println();
> 
> Alt + Shift + R: Rename variable, method, or class
> 
> Alt + Shift + Z: put dragged field into conditional statement or exception handler
> 
> Ctrl + Shift + F: Auto-format
> 
> Ctrl + Shift + O: Optimize imports
> 
> Ctrl + /: Comment or uncomment lines of code
> 
> Ctrl + Shift + /: Multi-line block comment
> 
> "main", then Ctrl + Space: public static void main(String[] args)
> 
> Alt + Shift + M: Extract method from dragged area
> 
> Ctrl + Alt + H: View call hierarchy
> 
> F3: Jump to variable declaration
> 
> /** + Enter: describe the information about the upcoming function


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
