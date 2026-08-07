# Interview Questions

## Basic

### What is an Object?

An object is an instance of a class.

---

### Where are objects stored?

Objects are stored in Heap Memory.

---

### Where are reference variables stored?

Reference variables are stored in Stack Memory.

---

### What is the new keyword?

It allocates memory for an object.

---

### What is an anonymous object?

An object without storing its reference.

```java
new Student().display();
```

---

### Can one object have multiple references?

Yes.

```java
Student s1 = new Student();

Student s2 = s1;
```

---

### What happens if all references become null?

The object becomes eligible for Garbage Collection.

---

### Difference between Class and Object?

| Class | Object |
|--------|---------|
| Blueprint | Instance |
| No memory | Memory allocated |
| Logical entity | Physical entity |