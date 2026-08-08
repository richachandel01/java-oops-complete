# 05 - Constructors in Java

A constructor is a special member of a class used to initialize objects.

## Characteristics

- Same name as the class
- No return type
- Automatically called when an object is created
- Can be overloaded
- Cannot be inherited

## Syntax

```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}