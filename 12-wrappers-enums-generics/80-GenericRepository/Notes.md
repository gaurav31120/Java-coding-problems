# Notes — Problem 80: Generic Repository

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Repository

## What is a Repository?

A repository is a class responsible for storing and retrieving data.

In this problem, we created a simple in-memory repository using an ArrayList.

## Generic Repository

Instead of creating:

    StringRepository

and:

    IntegerRepository

we create one reusable class:

    Repository<T>

The actual type is specified when creating the object.

## Generic Repository Structure

    class Repository<T> {

        private final List<T> data = new ArrayList<>();

        public void add(T element) {
            data.add(element);
        }

        public T get(int index) {
            return data.get(index);
        }

        public int size() {
            return data.size();
        }
    }

## Repository<String>

    Repository<String> names = new Repository<>();

Now T represents:

    String

Therefore:

    add(T)

becomes conceptually:

    add(String)

and:

    get()

returns:

    String

Example:

    names.add("Java");
    names.add("Spring");
    names.add("AWS");

    String value = names.get(1);

Result:

    Spring

## Repository<Integer>

    Repository<Integer> numbers = new Repository<>();

Now T represents:

    Integer

Therefore the repository stores Integer values.

Example:

    numbers.add(100);
    numbers.add(200);
    numbers.add(300);

    Integer value = numbers.get(2);

Result:

    300

## Internal List

The repository uses:

    List<T>

Example:

    private final List<T> data = new ArrayList<>();

This means the internal list stores the same type as the repository.

For:

    Repository<String>

the internal list is effectively:

    List<String>

For:

    Repository<Integer>

the internal list is effectively:

    List<Integer>

## add()

Method:

    public void add(T element) {
        data.add(element);
    }

The method accepts the repository's generic type.

Example:

    Repository<String> repo = new Repository<>();

    repo.add("Java");

## get()

Method:

    public T get(int index) {
        return data.get(index);
    }

It returns the generic type.

Example:

    Repository<String> repo = new Repository<>();

    String value = repo.get(0);

## size()

Method:

    public int size() {
        return data.size();
    }

It returns the number of elements stored in the repository.

## Type Safety

Generics prevent incompatible values from being added.

Example:

    Repository<Integer> numbers = new Repository<>();

    numbers.add(100);

Valid.

But:

    numbers.add("Java");

is a compile-time error.

The repository expects Integer values.

## Why Not Object?

Without generics:

    class Repository {

        private List<Object> data;
    }

We would lose strong type information and would often need casting.

Generics allow:

    Repository<String>

or:

    Repository<Integer>

while maintaining type safety.

## Reusability

One class:

    Repository<T>

can be reused for:

    Repository<String>
    Repository<Integer>
    Repository<Double>
    Repository<Employee>

No separate repository implementation is required.

## Generic Repository Mental Model

Think of:

    Repository<T>

as a template.

When we write:

    Repository<String>

then:

    T = String

When we write:

    Repository<Integer>

then:

    T = Integer

Therefore:

    Repository<T>
          ↓
    ┌─────────────┐
    │ add(T)      │
    │ get() → T   │
    │ size()      │
    └─────────────┘

## Why List<T> Instead of ArrayList<T>?

Using:

    List<T> data = new ArrayList<>();

is generally preferred because the variable depends on the interface rather than the concrete implementation.

The repository only needs List behavior.

## final on the List Reference

Example:

    private final List<T> data = new ArrayList<>();

`final` means the `data` reference cannot be reassigned to another List.

We can still modify the contents:

    data.add(...);

But we cannot do:

    data = new ArrayList<>();

## Interview Questions & Answers

### 1. What is a generic repository?

A reusable repository class that uses a type parameter to store and retrieve different types safely.

### 2. Why use Repository<T>?

It allows the same repository implementation to work with different data types.

### 3. What does T represent?

T represents the type specified when creating the repository.

### 4. What does Repository<String> mean?

It means T is String.

The repository stores String values.

### 5. What does Repository<Integer> mean?

It means T is Integer.

The repository stores Integer values.

### 6. Why use List<T> internally?

It allows the repository to store values of the same generic type while maintaining type safety.

### 7. What happens if we add the wrong type?

The compiler reports a type error.

Example:

    Repository<Integer> repo = new Repository<>();

    repo.add("Java");

This is invalid.

### 8. What does get() return?

It returns the generic type T.

Example:

    Repository<String>

returns String from get().

### 9. Why use generics instead of Object?

Generics provide compile-time type safety and reduce the need for explicit casting.

### 10. Can