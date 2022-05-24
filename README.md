# Java

## [0] Characteristics of Java
> Main function should belong to class named java file name

> Access modifier is necessary for class: `Public` or Private

```java
public class Main {
  public static void main() {
    ...
  }
}
```

## [1] Data Type 

### [Data Type - Primitive Data Type]
> for storing simple values like numbers, strings and booleans.
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/169656914-35cd8e20-1c15-4c89-b15c-7239f0e24556.png">

```bash
Java sees the integer number as `int`
Java sees the floating point number as `double`

Thus, when we use long type, we need to add `L` at the end of the number
Thus, when we use float type, we need to add `F` at the end of the number
```

### [Data Type - Reference Date Type]
> for storing complex objects like email messages. 

> However, since we use String type often, we don't need to use new operator for String. (`String is immutable`)


* Data Type Example Code
```java
long viewsCount = 3_123_456_789L;
float price = 10.99F;

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

```java
int [] numbers = new int[5];
numbers[0] = 1;
numbers[1] = 2;

// Printing
System.out.println(numbers);
//[I@2d98a335

System.out.println(Arrays.toString(numbers));
//[1, 2, 0, 0, 0]

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

### [3] Global Variable
> Use `final` statement in front of the data type

```java
final float PI = 3.14F;
```

## [4] Casting and Type conversion
In Java, we have two types of casting:

### [Casting and Type conversion - Implicit Type Casting]
> happens automatically when we store a value in a larger or more precise data type.

  * byte > short > int > long > float > double

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


### [4] Math

```java
int result = Math.round(1.1F);

int result = (int) Math.ceil(1.1F) // Math.ceil returns double datatype

int y = Math.max(14,15);

double y = Math.random(); // get floating point number between 0 to 1

double y = Math.random() * 100; // get floating point number between 0 to 100
```


### [5] Reading input
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Age: ");
byte age = scanner.nextByte();
// String line = scanner.nextLine();
System.out.println("You are " + age);
```

### [6] Comparison Operators
```java
int x = 1;
int y = 1;
System.out.println(x == y);
// true
```

### [7] Logical Operators
&&
||


### [8] Condition Operators
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

### [9] Ternary Operators
```java
String className = income > 100_000 ? "First" : "Economy";
```

Switch statement
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



### [9] Loops

##### Loops - for loop

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


##### Loops - while loop

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





## [Useful Material]

Useful shortcut
sout: System.out.println();
Shift+F6: replace selected message


Name convention: CamelCase
> capitalize all the words except first word

int myAge
int herAge




<!--
### Lec: 1:12:46 - 22/05/22 (https://www.youtube.com/watch?v=eIrMbAQSU34&t=296s)

We called the functions which belong to the class as METHODs

-->
