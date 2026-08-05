# Object in Java

Object = Instance of a class.

Example

```java
Student s = new Student();
```

Here

Student → Class

new → Creates object

s → Reference Variable

Student() → Constructor

---

Memory

Stack Memory

↓

Reference Variable

↓

Heap Memory

↓

Actual Object

Example

Student s = new Student();

Stack

s

↓

Heap

Student Object

---

Multiple Objects

```java
Student s1 = new Student();

Student s2 = new Student();

Student s3 = new Student();
```

Each object has separate memory.

---

Anonymous Object

```java
new Student().display();
```

Reference is not stored.

---

Array of Objects

```java
Student students[] = new Student[5];
```

Creates an array capable of holding five object references.

---

Advantages

- Dynamic memory
- Reusability
- Encapsulation
- Better organization