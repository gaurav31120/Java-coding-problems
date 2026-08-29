# Notes — CJ-067 Compile-Time Polymorphism

## Concepts Learned

- Compile-time polymorphism
- Method overloading
- Same method name
- Different parameter lists
- Method resolution

## Key Learning

Compile-time polymorphism in Java is commonly achieved using **method overloading**.

Method overloading means having multiple methods with the same name but different parameter lists.

Example:

    calculate(int a, int b)

    calculate(double a, double b)

    calculate(int a, int b, int c)

Java determines which overloaded method should be called based on the arguments passed.

Example:

    calculate(10, 20);

calls:

    calculate(int, int)

While:

    calculate(15.5, 20.0);

calls:

    calculate(double, double)

## Important Rule

Overloaded methods must have different parameter lists.

The difference can be:

- Number of parameters
- Parameter types
- Order of parameter types

Changing only the return type is NOT enough to overload a method.

## Interview Questions & Answers

### 1. What is compile-time polymorphism?

Compile-time polymorphism is polymorphism where the method to execute is determined during compilation. In Java, method overloading is a common example.

### 2. What is method overloading?

Method overloading means defining multiple methods with the same name but different parameter lists.

### 3. How does Java distinguish overloaded methods?

Java uses the method name and parameter list to determine which overloaded method should be called.

### 4. Can methods be overloaded by changing only the return type?

No. Changing only the return type does not create a valid method overload.

### 5. Can overloaded methods have different access modifiers?

Yes. Access modifiers can be different, although the parameter lists must still be different.

### 6. Can static methods be overloaded?

Yes. Static methods can be overloaded.

### 7. What is the difference between overloading and overriding?

Overloading uses the same method name with different parameter lists, usually within the same class.

Overriding occurs when a child class provides a new implementation of an inherited parent method.

### 8. Why is method overloading called compile-time polymorphism?

Because the compiler determines which overloaded method matches the supplied arguments during compilation.