# Notes — CJ-001 Hello Backend

## Concepts Learned

- Java class
- main() method
- public keyword
- static keyword
- void return type
- String[] args
- System.out.println()

## Key Learning

The `main()` method is the entry point of a standard Java application.
The JVM starts program execution by calling the main method.

## Naming Convention

Java class names follow PascalCase.

Examples:

- HelloBackend
- EmployeeService
- UserController

## Interview Questions & Answers

### 1. Why is main() static?

`main()` is static so the JVM can invoke it without creating an object of the class.

### 2. Why is main() public?

The JVM needs to access the `main()` method from outside the class.

### 3. Why does main() return void?

The `main()` method does not return any value to the JVM.

### 4. What is String[] args?

`String[] args` is an array of strings used to receive command-line arguments.

### 5. Is main() the only method possible in a Java class?

No. A Java class can contain constructors, instance methods, static methods, variables, and other members.