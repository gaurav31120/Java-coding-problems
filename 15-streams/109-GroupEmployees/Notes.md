# Notes — CJ-109 Group Employees

## Concepts Learned

- Stream
- stream()
- collect()
- Collectors
- groupingBy()
- Map
- List
- Lambda expression
- Nested forEach()
- size()
- Grouping objects by a property

## Key Learning

`Collectors.groupingBy()` is used to group Stream elements according to a particular property.

Example:

    Map<String, List<Employee>> grouped =
            emp.stream()
               .collect(Collectors.groupingBy(employee -> employee.department));

This groups employees according to their department.

## Employee Class

The Employee class contains:

    String name;
    String department;
    double salary;

Example:

    static class Employee {

        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

## groupingBy()

`groupingBy()` groups elements according to a classification function.

Example:

    Collectors.groupingBy(employee -> employee.department)

For every employee:

    Employee
        ↓
    employee.department
        ↓
    Department group

Example:

    Amit   → IT
    Rahul  → HR
    Gaurav → IT
    Priya  → Finance
    Neha   → HR
    Karan  → Finance

The result is conceptually:

    IT       → [Amit, Gaurav]
    HR       → [Rahul, Neha]
    Finance  → [Priya, Karan]

## Map<String, List<Employee>>

The result of `groupingBy()` in this problem is:

    Map<String, List<Employee>>

This means:

    String
    → Department name

    List<Employee>
    → Employees belonging to that department

Example:

    "IT" → [Amit, Gaurav]

    "HR" → [Rahul, Neha]

    "Finance" → [Priya, Karan]

## collect()

`collect()` is used to gather Stream results into another form such as a List, Set, Map, or grouped structure.

Example:

    emp.stream()
       .collect(Collectors.groupingBy(employee -> employee.department));

The Stream elements are collected into groups.

## Stream Pipeline

The grouping pipeline is:

    Collection
        ↓
    stream()
        ↓
    collect()
        ↓
    groupingBy()
        ↓
    Map<String, List<Employee>>

## Lambda Expression

This:

    employee -> employee.department

is a lambda expression.

It means:

    Take an employee
        ↓
    Get the employee's department
        ↓
    Use that department as the group key

## Nested forEach()

After grouping, we have:

    Map<String, List<Employee>>

We can iterate through the Map:

    grouped.forEach((department, employees) -> {

        System.out.println(department);

    });

Here:

    department
    → The group name

    employees
    → List of employees in that group

## Stream Inside Each Group

We can create another Stream from the employee list:

    employees.stream()
            .forEach(employee -> System.out.println(employee.name));

This prints every employee's name in the current department.

Flow:

    grouped
        ↓
    department + employee list
        ↓
    employees.stream()
        ↓
    each Employee
        ↓
    employee.name

## Counting Employees in Each Department

Because each department contains a `List<Employee>`, we can use:

    employees.size()

Example:

    System.out.println(
        "Employee count: " + employees.size()
    );

For the given data:

    IT       → 2
    HR       → 2
    Finance  → 2

## filter() vs map() vs sorted() vs distinct() vs groupingBy()

`filter()`:

    Selects elements.

Example:

    .filter(salary -> salary > 60000)

`map()`:

    Transforms elements.

Example:

    .map(salary -> salary * 1.1)

`sorted()`:

    Sorts elements.

Example:

    .sorted()

`distinct()`:

    Removes duplicates.

Example:

    .distinct()

`groupingBy()`:

    Groups elements according to a property.

Example:

    Collectors.groupingBy(
        employee -> employee.department
    )

Remember:

    filter()
    → Select

    map()
    → Transform

    sorted()
    → Sort

    distinct()
    → Remove duplicates

    groupingBy()
    → Group

## Intermediate vs Terminal Operations

`groupingBy()` is a Collector used with the terminal operation `collect()`.

The Stream pipeline:

    stream()
        ↓
    collect(groupingBy(...))
        ↓
    Map

`collect()` is a terminal operation.

## Important Point

`groupingBy()` normally creates groups based on the classification function.

In this problem:

    employee -> employee.department

is the classification function.

## Department Grouping Example

Input:

    Amit   → IT
    Rahul  → HR
    Gaurav → IT
    Priya  → Finance
    Neha   → HR
    Karan  → Finance

After grouping:

    IT
    ├── Amit
    └── Gaurav

    HR
    ├── Rahul
    └── Neha

    Finance
    ├── Priya
    └── Karan

## Interview Questions & Answers

### 1. What is groupingBy() in Java Streams?

`groupingBy()` is a Collector used to group Stream elements according to a classification function.

### 2. What is the purpose of Collectors.groupingBy()?

It groups elements based on a selected property.

Example:

    Collectors.groupingBy(employee -> employee.department)

### 3. What does employee -> employee.department mean?

It takes an Employee and returns the employee's department.

That department is used as the grouping key.

### 4. What is the result type of groupingBy() in this problem?

The result is:

    Map<String, List<Employee>>

### 5. Why is the key a String?

Because the department is represented as a String.

Example:

    "IT"
    "HR"
    "Finance"

### 6. Why is the value a List<Employee>?

Because each department can contain multiple employees.

### 7. What does collect() do?

`collect()` is a terminal Stream operation used to gather Stream elements into a result.

### 8. Is collect() a terminal operation?

Yes.

### 9. Is groupingBy() itself a Stream operation?

`groupingBy()` is a Collector used by the `collect()` terminal operation.

### 10. Can groupingBy() group objects by different properties?

Yes.

For example:

    employee -> employee.department

groups by department.

A different classification function could group by another property.

### 11. Can groupingBy() group employees by salary?

Yes.

For example:

    Collectors.groupingBy(employee -> employee.salary)

This would create groups based on salary values.

### 12. Can groupingBy() be used with filter()?

Yes.

Example:

    emp.stream()
       .filter(employee -> employee.salary > 60000)
       .collect(Collectors.groupingBy(
           employee -> employee.department
       ));

### 13. Can groupingBy() be used with sorted()?

Yes.

Stream operations can be combined depending on the required result.

### 14. What is the difference between groupingBy() and partitioningBy()?

`groupingBy()` can create multiple groups based on a classification value.

`partitioningBy()` divides elements into two groups based on a boolean condition.

### 15. Does groupingBy() modify the original ArrayList?

No. It creates a grouped result from the Stream.

### 16. Why do we use Map<String, List<Employee>>?

Because each department name maps to a list of employees belonging to that department.

### 17. What does employees.size() do in this problem?

It returns the number of employees in the current department.

### 18. What does grouped.forEach() do?

It iterates through each department and its corresponding employee list.

### 19. What does this mean?

    grouped.forEach((department, employees) -> {
        ...
    });

It means:

    For each Map entry:
        department → key
        employees → value

### 20. What is the basic grouping pattern?

    list.stream()
        .collect(
            Collectors.groupingBy(
                element -> classification
            )
        );

## Quick Interview Summary

    stream()
    → Create Stream

    collect()
    → Gather Stream result

    groupingBy()
    → Group elements

    employee -> employee.department
    → Classification function

    Map<String, List<Employee>>
    → Department → Employee list

    employees.size()
    → Number of employees in group

    grouped.forEach()
    → Iterate through groups