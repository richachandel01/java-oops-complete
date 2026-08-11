
---

## `Interview-Questions.md`

```md
# Immutable - Interview Questions

## 1. What is an immutable object?

An object whose state cannot change after creation.

## 2. Why is String immutable?

Immutability provides benefits including security, string-pool sharing, caching and thread-safety characteristics.

## 3. How do you create an immutable class?

- final class
- private final fields
- constructor initialization
- no setters
- defensive copies for mutable fields

## 4. Is final enough to make a class immutable?

No.

`final` prevents reassignment or inheritance depending on where it is used, but does not by itself guarantee object immutability.

## 5. Is StringBuilder immutable?

No.

StringBuilder is mutable.

## 6. Is Integer immutable?

Yes.

Wrapper classes such as Integer are immutable.

## 7. Why are immutable objects useful?

They are predictable, safe to share and useful for caching and concurrent programs.

## 8. Difference between final and immutable?

`final` is a language modifier.

Immutable describes an object's state behavior.