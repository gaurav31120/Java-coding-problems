# Notes — CJ-084 Unique Values

## Concepts Learned

- HashSet
- add()
- contains()
- size()
- remove()
- isEmpty()
- clear()
- Duplicate removal
- hashCode() and equals()

## Key Learning

HashSet is a collection that stores unique elements and does not allow duplicate values.

Example:

    HashSet<Integer> empId = new HashSet<>();

If we add the same element multiple times, the duplicate is ignored.

Example:

    empId.add(101);
    empId.add(101);

Only one `101` is stored.

## Adding Elements

Use `add()`:

    empId.add(101);
    empId.add(102);
    empId.add(103);

If the element already exists, it is not added again.

`add()` returns:

- `true` if the element was added.
- `false` if the element already existed.

## Checking Elements

Use `contains()`:

    empId.contains(103);

Returns `true` if the element exists.

Returns `false` if the element does not exist.

## Counting Elements

Use `size()`:

    empId.size();

It returns the number of unique elements stored in the HashSet.

Example:

    101
    102
    103
    101
    104
    102
    105

The HashSet contains:

    101
    102
    103
    104
    105

Therefore:

    empId.size();

returns:

    5

## Removing Elements

Use `remove()`:

    empId.remove(103);

This removes the element if it exists.

## Iterating HashSet

Use a for-each loop:

    for (int id : empId) {
        System.out.println(id);
    }

## HashSet Ordering

HashSet does not guarantee insertion order.

Therefore, we should not depend on the order in which elements are displayed.

If insertion order is required, use `LinkedHashSet`.

## HashSet and Duplicates

HashSet automatically prevents duplicate elements.

Example:

    empId.add(101);
    empId.add(102);
    empId.add(101);

The result contains:

    101
    102

The second `101` is ignored.

## HashSet and Index

HashSet does not support index-based access.

This is invalid:

    set.get(0);

Unlike ArrayList, HashSet does not provide `get(index)`.

## HashSet and null

HashSet can contain one `null` element.

Example:

    HashSet<String> names = new HashSet<>();

    names.add(null);
    names.add(null);

Only one `null` is stored.

## ArrayList vs HashSet

| Feature | ArrayList | HashSet |
|---|---|---|
| Duplicates | Allowed | Not allowed |
| Insertion order | Maintained | Not guaranteed |
| Index-based access | Yes | No |
| get(index) | Yes | No |
| Main purpose | Ordered collection | Unique elements |

## HashSet vs LinkedHashSet vs TreeSet

| Collection | Duplicates | Order |
|---|---|---|
| HashSet | Not allowed | Not guaranteed |
| LinkedHashSet | Not allowed | Insertion order |
| TreeSet | Not allowed | Sorted order |

## Interview Questions & Answers

### 1. What is HashSet?

HashSet is a collection in Java that stores unique elements and does not allow duplicate values.

### 2. Does HashSet allow duplicates?

No. If the same element is added multiple times, only one copy is stored.

### 3. Does HashSet maintain insertion order?

No. HashSet does not guarantee insertion order.

### 4. How does HashSet identify duplicates?

HashSet uses `hashCode()` and `equals()` to determine whether elements are duplicates.

### 5. What does add() return in HashSet?

`add()` returns `true` if the element was successfully added and `false` if the element already existed.

### 6. What does contains() do?

`contains()` checks whether a particular element exists in the HashSet.

### 7. What does size() return?

`size()` returns the number of elements currently stored in the HashSet.

Because duplicates are not stored, it represents the number of unique elements.

### 8. Can HashSet contain null?

Yes. A HashSet can contain one `null` element.

### 9. Can we access HashSet elements using an index?

No. HashSet does not support index-based access.

### 10. What is the difference between ArrayList and HashSet?

ArrayList allows duplicates, maintains insertion order, and supports index-based access.

HashSet does not allow duplicates, does not guarantee insertion order, and does not support index-based access.

### 11. What is the average expected time complexity of add() in HashSet?

The average expected time complexity is O(1).

### 12. What is the average expected time complexity of contains() in HashSet?

The average expected time complexity is O(1).

### 13. What happens when we add an existing element?

The duplicate is not added.

### 14. Which Set should be used when insertion order is required?

Use `LinkedHashSet`.

### 15. Which Set should be used when elements need to remain sorted?

Use `TreeSet`.

### 16. Is HashSet synchronized?

No. HashSet is not synchronized by default.

### 17. When should HashSet be used?

Use HashSet when duplicate values should not be stored, fast membership checking is required, and ordering is not important.