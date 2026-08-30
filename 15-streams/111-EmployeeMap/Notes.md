# Notes — CJ-111 Employee Map

## Concepts Learned

- Stream
- stream()
- map()
- collect()
- Collectors.toList()
- List
- Lambda expression
- Object transformation
- Employee → String transformation

## Key Learning

`map()` is used to transform each element of a Stream into another value.

In this problem:

    Employee → String

We transform each Employee object into the employee's name.

Example:

    emp.stream()
       .map(employee -> employee.name)

## Employee Map

The Employee object contains:

    name
    department
    salary

We only want the employee names.

Example:

    Employee("Amit", "IT", 70000)
        ↓
    employee.name
        ↓
    "Amit"

Therefore:

    .map(employee -> employee.name)

## map()

`map()` transforms every element in the Stream.

Example:

    emp.stream()
       .map(employee -> employee.name)

Before map():

    Stream<Employee>

After map():

    Stream<String>

The transformation is:

    Employee
        ↓
    employee.name
        ↓
    String

## collect()

After using `map()`, we have a Stream of Strings.

To convert the Stream into a List:

    .collect(Collectors.toList())

Complete example:

    List<String> names = emp.stream()
            .map(employee -> employee.name)
            .collect(Collectors.toList());

## Collectors.toList()

`Collectors.toList()` collects Stream elements into a List.

Example:

    List<String> names = emp.stream()
            .map(employee -> employee.name)
            .collect(Collectors.toList());

Result:

    [Amit, Rahul, Gaurav, Priya, Neha, Karan]

## Stream Pipeline

The complete pipeline is:

    ArrayList<Employee>
            ↓
        stream()
            ↓
          map()
            ↓
      Stream<String>
            ↓
         collect()
            ↓
      List<String>

## Lambda Expression

This:

    employee -> employee.name

is a lambda expression.

It means:

    Take an Employee
        ↓
    access employee.name
        ↓
    return the name

## map() vs filter()

`map()` transforms elements.

Example:

    .map(employee -> employee.name)

Result:

    Employee → String

`filter()` selects elements.

Example:

    .filter(employee -> employee.salary > 60000)

Result:

    Employee → Employee

Remember:

    map()
    → Transform

    filter()
    → Select

## map() vs distinct()

`map()` transforms elements.

Example:

    Employee → employee.name

`distinct()` removes duplicate elements.

Example:

    .distinct()

They can also be combined.

Example:

    emp.stream()
       .map(employee -> employee.department)
       .distinct()
       .collect(Collectors.toList());

This would produce unique department names.

## map() vs groupingBy()

`map()` transforms each element.

Example:

    .map(employee -> employee.name)

`groupingBy()` groups elements.

Example:

    Collectors.groupingBy(
        employee -> employee.department
    )

Remember:

    map()
    → Transform each element

    groupingBy()
    → Create groups

## Why use List<String>?

The result contains employee names, so the element type is `String`.

Therefore:

    List<String>

is appropriate.

The original collection is:

    ArrayList<Employee>

After mapping:

    List<String>

## Important Point

`map()` does not modify the original Employee objects.

It creates a Stream containing the transformed values.

Original:

    Employee objects

Mapped Stream:

    Employee names

## Collectors

`Collectors` is a utility class that provides commonly used Collector implementations.

Examples:

    Collectors.toList()

    Collectors.toSet()

    Collectors.groupingBy()

    Collectors.partitioningBy()

## Interview Questions & Answers

### 1. What does map() do in Java Streams?

`map()` transforms each Stream element into another value.

### 2. What is the transformation in this problem?

The transformation is:

    Employee → String

Specifically:

    employee → employee.name

### 3. What does employee -> employee.name mean?

It takes an Employee object and returns its `name` property.

### 4. What is the type before map()?

The Stream contains:

    Employee

So the type is:

    Stream<Employee>

### 5. What is the type after map()?

The mapped Stream contains employee names:

    Stream<String>

### 6. What does Collectors.toList() do?

It collects Stream elements into a List.

### 7. Why do we use collect() after map()?

`map()` creates the transformed Stream.

`collect()` gathers those transformed elements into a collection.

### 8. Is map() an intermediate operation?

Yes.

### 9. Is collect() a terminal operation?

Yes.

### 10. Does map() modify the original ArrayList?

No.

### 11. What is the difference between map() and filter()?

`map()` transforms elements.

`filter()` selects elements based on a condition.

### 12. Can map() change the data type?

Yes.

For example:

    Stream<Employee>
        ↓ map()
    Stream<String>

### 13. Can map() be used with objects?

Yes.

Example:

    .map(employee -> employee.name)

### 14. Can multiple map() operations be chained?

Yes.

Example:

    stream()
        .map(...)
        .map(...)

### 15. Can map() be combined with filter()?

Yes.

Example:

    emp.stream()
       .filter(employee -> employee.salary > 60000)
       .map(employee -> employee.name)
       .collect(Collectors.toList());

### 16. Can map() be combined with distinct()?

Yes.

Example:

    emp.stream()
       .map(employee -> employee.department)
       .distinct()
       .collect(Collectors.toList());

### 17. What is Collectors?

`Collectors` is a utility class that provides Collector implementations used with `collect()`.

### 18. What is the difference between Collector and Collectors?

`Collector` is an interface representing a mutable reduction operation.

`Collectors` is a utility class that provides commonly used Collector implementations such as `toList()`, `toSet()`, `groupingBy()`, and `partitioningBy()`.

### 19. What does `List<String>` represent here?

It represents a List containing employee names.

### 20. What is the basic object-to-property Stream pattern?

    List<Employee>
        ↓
    stream()
        ↓
    map(employee -> employee.name)
        ↓
    collect(Collectors.toList())
        ↓
    List<String>

## Quick Interview Summary

    map()
    → Transform elements

    Employee → String
    → Object-to-property transformation

    collect()
    → Gather Stream result

    Collectors.toList()
    → Create List from Stream

    Stream<Employee>
    → Before map()

    Stream<String>
    → After map()

    map()
    → Intermediate operation

    collect()
    → Terminal operation