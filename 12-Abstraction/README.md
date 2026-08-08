# 12 - Abstraction in Java

## What is Abstraction?

Abstraction means hiding implementation details and exposing only the essential functionality.

Example:

When we drive a car, we use:

- Steering
- Brake
- Accelerator

We do not need to know the complete internal engine implementation.

## How is abstraction achieved?

Java provides:

1. Abstract classes
2. Interfaces

This chapter focuses on abstract classes.

## Abstract Class

```java
abstract class Animal {

    abstract void sound();
}