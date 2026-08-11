# 19 - StringBuilder in Java

StringBuilder is a mutable sequence of characters.

Unlike String, StringBuilder can modify its contents without creating a new object for every change.

## Common Methods

- append()
- insert()
- delete()
- deleteCharAt()
- replace()
- reverse()
- capacity()
- length()

## String vs StringBuilder

| String | StringBuilder |
|---|---|
| Immutable | Mutable |
| Slower for repeated modifications | Faster |
| Thread-safe through immutability | Not synchronized |
| Creates new objects on modification | Modifies existing buffer |

## Navigation

Previous: [18 - String](../18-String/)

Next: [20 - Immutable](../20-Immutable/)