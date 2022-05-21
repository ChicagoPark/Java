# Java

Main function: should belong to class named Main

Class: A container for related functions

Access modifier is necessary for class: `Public` or Private

```java
public class Main {
  public static void main() {
    ...
  }
}
```




Primitive Date Type
> for storing simple values like numbers, strings and booleans.
![20220521_234314](https://user-images.githubusercontent.com/73331241/169656914-35cd8e20-1c15-4c89-b15c-7239f0e24556.png)

Reference Date Type:
> for storing complex objects like email messages. 
we should use new operator.
However, since we use String type often, we don't need to use new operator for String. 
`String is immutable`

Java sees the integer number as `int`
Java sees the floating point number as `double`

Thus, when we use long type, we need to add `L` at the end of the number
Thus, when we use float type, we need to add `F` at the end of the number

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

Useful shortcut
sout: System.out.println();


Name convention: CamelCase
> capitalize all the words except first word

int myAge
int herAge

### Lec: 50:54 - 22/05/22 (https://www.youtube.com/watch?v=eIrMbAQSU34&t=296s)


<!--
We called the functions which belong to the class as METHODs

-->
