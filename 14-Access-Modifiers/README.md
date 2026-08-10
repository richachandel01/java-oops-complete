# 14 - Access Modifiers in Java

Access modifiers control the visibility of classes, variables, methods and constructors.

Java provides four levels:

1. public
2. protected
3. default
4. private

## Visibility

| Modifier | Same Class | Same Package | Subclass | Different Package |
|---|---:|---:|---:|---:|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅* | ❌* |
| public | ✅ | ✅ | ✅ | ✅ |

`*` Protected has special rules for subclasses in different packages.

## Navigation

Previous: [13 - Interface](../13-Interface/)

Next: [15 - Packages](../15-Packages/)