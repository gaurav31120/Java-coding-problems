# Notes — CJ-086 TreeSet Sorted Set

## Concepts Learned

- TreeSet
- Set
- add()
- first()
- last()
- contains()
- remove()
- size()
- Automatic sorting
- Duplicate removal

## Key Learning

TreeSet is a Set implementation that stores unique elements in sorted order.

Example:

    TreeSet<Integer> salaries = new TreeSet<>();

Unlike HashSet, TreeSet automatically maintains elements in sorted order.

## Adding Elements

Use `add()`:

    salaries.add(50000);
    salaries.add(75000);
    salaries.add(45000);

TreeSet automatically sorts the values.

Result:

    [45000, 50000, 75000]

Duplicate values are ignored.

## Finding the Smallest Element

Use `first()`:

    salaries.first();

It returns the smallest element.

Example:

    [45000, 50000, 60000, 75000, 90000]

    salaries.first();

returns:

    45000

## Finding the Largest Element

Use `last()`:

    salaries.last();

It returns the largest element.

Example:

    salaries.last();

returns:

    90000

## Checking Elements

Use `contains()`:

    salaries.contains(60000);

Returns `true` if the element exists.

Returns `false` if the element does not exist.

## Removing Elements

Use `remove()`:

    salaries.remove(75000);

This removes `75000` from the TreeSet if it exists.

## Counting Elements

Use `size()`:

    salaries.size();

It returns the number of unique elements currently stored in the TreeSet.

## TreeSet Ordering

TreeSet maintains elements in sorted order.

Example:

    salaries.add(90000);
    salaries.add(45000);
    salaries.add(60000);

The TreeSet becomes:

    [45000, 60000, 90000]

No manual sorting is required.

## TreeSet and Duplicates

TreeSet does not allow duplicate elements.

Example:

    salaries.add(75000);
    salaries.add(75000);

Only one `75000` is stored.

## HashSet vs TreeSet

| Feature | HashSet | TreeSet |
|---|---|---|
| Duplicates | Not allowed | Not allowed |
| Ordering | Not guaranteed | Sorted order |
| Main purpose | Unique elements | Unique sorted elements |
| first() / last() | No | Yes |

## HashSet vs LinkedHashSet vs TreeSet

| Collection | Duplicates | Ordering |
|---|---|---|
| HashSet | Not allowed | No guaranteed order |
| LinkedHashSet | Not allowed | Insertion order |
| TreeSet | Not allowed | Sorted order |

## Interview Questions & Answers

### 1. What is TreeSet?

TreeSet is a Set implementation that stores unique elements in sorted order.

### 2. Does TreeSet allow duplicate elements?

No. Duplicate elements are not stored.

### 3. Does TreeSet maintain sorted order?

Yes. TreeSet maintains its elements in sorted order according to their natural ordering or a supplied Comparator.

### 4. What does first() do?

`first()` returns the smallest element in the TreeSet.

### 5. What does last() do?

`last()` returns the largest element in the TreeSet.

### 6. What does contains() do?

`contains()` checks whether a particular element exists in the TreeSet.

### 7. What does remove() do?

`remove()` removes the specified element from the TreeSet if it exists.

### 8. What does size() return?

`size()` returns the number of unique elements currently stored in the TreeSet.

### 9. What is the difference between HashSet and TreeSet?

HashSet does not guarantee ordering, while TreeSet maintains elements in sorted order.

Both do not allow duplicate elements.

### 10. What is the difference between LinkedHashSet and TreeSet?

LinkedHashSet maintains insertion order.

TreeSet maintains sorted order.

### 11. Does TreeSet support null?

TreeSet generally does not allow `null` with natural ordering because comparison is required.

### 12. Can TreeSet store duplicate elements?

No. TreeSet stores only unique elements.

### 13. Does TreeSet use hashing?

No. TreeSet is based on a tree structure, specifically a Red-Black tree in the standard Java implementation.

### 14. What is the typical time complexity of add() in TreeSet?

The typical time complexity is O(log n).

### 15. What is the typical time complexity of contains() in TreeSet?

The typical time complexity is O(log n).

### 16. What is the typical time complexity of remove() in TreeSet?

The typical time complexity is O(log n).

### 17. How does TreeSet determine element ordering?

TreeSet uses the elements' natural ordering through `Comparable` or a `Comparator` supplied to the TreeSet.

### 18. When should TreeSet be used?

Use TreeSet when unique elements are required and the elements need to remain sorted.

### 19. What happens if we add an element that already exists?

The duplicate is not added.

### 20. Can TreeSet sort custom objects?

Yes, if the objects implement `Comparable` or a suitable `Comparator` is provided.

## Quick Interview Summary

    HashSet
    → Unique
    → No guaranteed order

    LinkedHashSet
    → Unique
    → Insertion order

    TreeSet
    → Unique
    → Sorted order

Important TreeSet methods:

    add()      → Add element
    first()    → Smallest element
    last()     → Largest element
    contains() → Check element
    remove()   → Remove element
    size()     → Number of elements