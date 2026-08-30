# Notes — CJ-085 Set Duplicate Removal

## Concepts Learned

- Set
- HashSet
- add()
- contains()
- remove()
- size()
- Duplicate removal
- Set interface and implementation

## Key Learning

A `Set` is a collection that does not allow duplicate elements.

`HashSet` is one implementation of the `Set` interface.

Example:

    Set<String> employees = new HashSet<>();

If duplicate values are added, they are automatically ignored.

## Adding Elements

Use `add()`:

    employees.add("Amit");
    employees.add("Rahul");
    employees.add("Amit");

Only one `"Amit"` is stored.

`add()` returns `true` when an element is added and `false` when the element already exists.

## Checking Elements

Use `contains()`:

    employees.contains("Rahul");

Returns `true` if the element exists.

Returns `false` if the element does not exist.

## Removing Elements

Use `remove()`:

    employees.remove("Gaurav");

This removes `"Gaurav"` if it exists.

Remember that String values are case-sensitive:

    "Gaurav" != "gaurav"

## Counting Elements

Use `size()`:

    employees.size();

It returns the number of unique elements currently stored in the Set.

## Set Interface vs HashSet

We can declare:

    Set<String> employees = new HashSet<>();

`Set` is the interface.

`HashSet` is the implementation.

Programming to the interface makes it easier to change the implementation later.

For example:

    Set<String> employees = new LinkedHashSet<>();

can be used when insertion order is required.

## HashSet Ordering

HashSet does not guarantee insertion order.

Therefore, we should not depend on the order in which elements are displayed.

## Set vs List

| Feature | List | Set |
|---|---|---|
| Duplicates | Allowed | Not allowed |
| Index-based access | Yes | No |
| Main purpose | Ordered elements | Unique elements |
| Example | ArrayList | HashSet |

## HashSet vs LinkedHashSet vs TreeSet

| Collection | Duplicates | Ordering |
|---|---|---|
| HashSet | Not allowed | No guaranteed order |
| LinkedHashSet | Not allowed | Insertion order |
| TreeSet | Not allowed | Sorted order |

## Interview Questions & Answers

### 1. What is a Set in Java?

A `Set` is a collection that does not allow duplicate elements.

### 2. What is HashSet?

`HashSet` is an implementation of the `Set` interface that stores unique elements and does not guarantee insertion order.

### 3. Does HashSet allow duplicates?

No. Duplicate elements are automatically ignored.

### 4. What is the difference between Set and HashSet?

`Set` is an interface, while `HashSet` is a concrete implementation of that interface.

Example:

    Set<String> employees = new HashSet<>();

### 5. What does add() return in a Set?

`add()` returns `true` if the element was added and `false` if the element already existed.

### 6. What does contains() do?

`contains()` checks whether a particular element exists in the Set.

### 7. What does remove() do?

`remove()` removes the specified element from the Set if it exists.

### 8. What does size() return?

`size()` returns the number of elements currently stored in the Set.

Because duplicates are not stored, it represents the number of unique elements.

### 9. Does Set support index-based access?

No. A Set does not provide index-based access like a List.

### 10. Why can we not use get() with HashSet?

HashSet does not maintain elements using indexes, so it does not provide `get(index)`.

### 11. What is the difference between List and Set?

List allows duplicates and provides index-based access.

Set does not allow duplicates and does not provide index-based access.

### 12. What is the difference between HashSet and LinkedHashSet?

HashSet does not guarantee insertion order.

LinkedHashSet maintains insertion order.

### 13. What is the difference between HashSet and TreeSet?

HashSet does not guarantee ordering.

TreeSet stores unique elements in sorted order.

### 14. How does HashSet detect duplicates?

HashSet uses `hashCode()` and `equals()` to determine whether elements are duplicates.

### 15. What is the average expected time complexity of add() in HashSet?

The average expected time complexity is O(1).

### 16. What is the average expected time complexity of contains() in HashSet?

The average expected time complexity is O(1).

### 17. Is HashSet ordered?

No. HashSet does not guarantee insertion order.

### 18. When should HashSet be used?

Use HashSet when unique elements are required and ordering is not important.