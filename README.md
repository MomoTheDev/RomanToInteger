# RomanToInteger
A Roman to Integer translator, written in Java

# Usage
1. Create an instance of the `RomanToInteger` using its constructor
2. Use the `getValue(String)` method to calculate/translate a value

---
Code Example:
```java

private RomanToInteger translator;

public void createAndRun() {
    translator = new RomanToInteger();
    System.out.printf("The value of XXXIV is %d", translator.getValue("XXXIV"));
}

```
Output:
```log
The value of XXXIV is 34
```
