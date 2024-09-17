# Java 8 Features Practice

This repository contains examples and exercises to practice the new features introduced in Java 8, such as lambda expressions, streams, functional interfaces, method references, and more. Additionally, it includes examples of anonymous inner classes, showcasing Java's traditional way of implementing functional programming before Java 8.

## Topics Covered

### 1. **Lambda Expressions**
Lambda expressions are a new feature in Java 8 that allows you to treat functionality as a method argument or pass blocks of code. They provide a clear and concise syntax to write anonymous methods.

**Example:**
```java
// Before Java 8 (Anonymous Inner Class)
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running...");
    }
};
new Thread(runnable).start();

// Using Lambda Expression in Java 8
Runnable lambdaRunnable = () -> System.out.println("Running...");
new Thread(lambdaRunnable).start();
```
### 2. **Functional Interfaces**
A functional interface is an interface with exactly one abstract method. Java 8 introduced the @FunctionalInterface annotation to ensure that the interface is functional, and that lambda expressions can be used to instantiate them.

**Example:**
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void display();
}

MyFunctionalInterface func = () -> System.out.println("Displaying via functional interface!");
func.display();
```

### 3. **Streams API**
The Streams API enables functional-style operations on collections, allowing data processing in a more declarative manner. It supports operations like filtering, mapping, and reducing.

**Example:**
```java
List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
names.stream()
     .filter(name -> name.startsWith("J"))
     .forEach(System.out::println);  // Outputs: John, Jane, Jack
```

### 4. **Method References**
Method references are a shorthand for lambda expressions that only call a method. They improve readability by directly referring to existing methods.

**Example:**
```java
// Using Lambda Expression
names.forEach(name -> System.out.println(name));

// Using Method Reference
names.forEach(System.out::println);
```

### 5. **Default and Static Methods in Interfaces**
Java 8 allows interfaces to have default and static methods. Default methods can have an implementation, while static methods belong to the interface class.

**Example:**
```java
interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {}

MyClass obj = new MyClass();
obj.defaultMethod(); // Calls the default method

MyInterface.staticMethod(); // Calls the static method
```

### 6. **Optional Class**
The Optional class helps in avoiding NullPointerException by providing a container object that may or may not contain a non-null value. It's a better alternative to traditional null checks.

**Example:**
```java
Optional<String> optionalValue = Optional.ofNullable("Hello");
optionalValue.ifPresent(System.out::println); // Outputs: Hello

Optional<String> emptyValue = Optional.ofNullable(null);
System.out.println(emptyValue.orElse("Default Value")); // Outputs: Default Value
```

### 7. **New Date and Time API**
Java 8 introduces a new date and time API that is more intuitive, thread-safe, and immutable. It replaces the old Date and Calendar classes.

**Example:**
```java
LocalDate currentDate = LocalDate.now();
System.out.println("Current Date: " + currentDate); // Outputs current date

LocalDate specificDate = LocalDate.of(2024, Month.SEPTEMBER, 17);
System.out.println("Specific Date: " + specificDate); // Outputs: 2024-09-17
```

### 8. **Anonymous Inner Classes**
Anonymous inner classes were the way to create inline implementations of interfaces or abstract classes before Java 8. This technique was widely used but often resulted in verbose code.

**Example:**
```java
// Anonymous inner class implementing Runnable
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running...");
    }
};
new Thread(runnable).start();
```































