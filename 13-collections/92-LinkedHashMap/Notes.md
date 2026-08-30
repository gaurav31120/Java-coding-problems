# Notes — CJ-092 LinkedHashMap

## Concepts Learned

- LinkedHashMap
- Insertion order
- put()
- get()
- containsKey()
- containsValue()
- remove()
- entrySet()
- size()
- Updating values

## Key Learning

LinkedHashMap is a Map implementation that maintains the insertion order of its entries.

Example:

    LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();

If we insert:

    101 → Amit
    105 → Neha
    103 → Gaurav
    102 → Rahul
    104 → Priya

LinkedHashMap maintains:

    101 → Amit
    105 → Neha
    103 → Gaurav
    102 → Rahul
    104 → Priya

The keys are not sorted.

The insertion order is preserved.

## Creating a LinkedHashMap

Example:

    LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();

Here:

    Integer → Key
    String → Value

## Adding Elements

Use `put()`:

    employees.put(101, "Amit");
    employees.put(105, "Neha");

The entries are stored in insertion order.

## Getting Values

Use `get()`:

    employees.get(103);

This returns the value associated with key `103`.

Example:

    103 → Gaurav

Therefore:

    employees.get(103);

returns:

    Gaurav

## Checking Keys

Use `containsKey()`:

    employees.containsKey(104);

Returns `true` if key `104` exists.

## Checking Values

Use `containsValue()`:

    employees.containsValue("Rahul");

Returns `true` if `"Rahul"` exists as a value.

## Updating Elements

`put()` can update an existing key.

Example:

    employees.put(103, "Gaurav");

Then:

    employees.put(103, "Karan");

The mapping becomes:

    103 → Karan

The key is not duplicated.

## Removing Elements

Use:

    employees.remove(102);

This removes the mapping associated with key `102`.

## Iterating Through LinkedHashMap

Use `entrySet()`:

    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
        System.out.println(entry.getKey() + " → " + entry.getValue());
    }

The entries are encountered in insertion order.

## LinkedHashMap Ordering

LinkedHashMap maintains insertion order.

Example:

    Insert:
    101
    105
    103
    102
    104

Display:

    101
    105
    103
    102
    104

It does not automatically sort the keys.

## HashMap vs LinkedHashMap vs TreeMap

HashMap:

    No guaranteed iteration order.

LinkedHashMap:

    Maintains insertion order.

TreeMap:

    Maintains sorted key order.

Example:

    Insert:
    105
    101
    103

HashMap:

    No guaranteed order

LinkedHashMap:

    105
    101
    103

TreeMap:

    101
    103
    105

## Duplicate Keys

LinkedHashMap does not allow duplicate keys.

If the same key is inserted again, its value is replaced.

Example:

    employees.put(103, "Gaurav");
    employees.put(103, "Karan");

Final mapping:

    103 → Karan

## Important Point About Updating

Updating an existing key does not create a second entry.

Example:

    101 → Amit
    103 → Gaurav
    105 → Neha

After:

    put(103, "Karan")

the map becomes:

    101 → Amit
    103 → Karan
    105 → Neha

The position of the existing key remains in the insertion-order sequence.

## size()

Use:

    employees.size();

to find the number of key-value mappings.

## Interview Questions & Answers

### 1. What is LinkedHashMap?

LinkedHashMap is a Map implementation that maintains insertion order while storing key-value pairs.

### 2. What is the main difference between HashMap and LinkedHashMap?

HashMap does not guarantee iteration order.

LinkedHashMap maintains insertion order.

### 3. What is the difference between LinkedHashMap and TreeMap?

LinkedHashMap maintains insertion order.

TreeMap maintains sorted key order.

### 4. Does LinkedHashMap allow duplicate keys?

No. A key can appear only once.

If the same key is inserted again, its value is replaced.

### 5. Can LinkedHashMap contain duplicate values?

Yes. Different keys can have the same value.

### 6. Does updating a key change its position?

With the default insertion-order behavior, updating an existing key changes its value but does not create a new insertion position.

### 7. What does put() do?

`put()` adds a new mapping or updates the value of an existing key.

### 8. What does get() do?

`get(key)` returns the value associated with the specified key.

### 9. What does containsKey() do?

It checks whether a particular key exists.

### 10. What does containsValue() do?

It checks whether a particular value exists.

### 11. What does remove() do?

It removes the mapping associated with the specified key.

### 12. What does size() return?

It returns the number of key-value mappings.

### 13. How do you iterate through a LinkedHashMap?

Use `entrySet()`:

    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

### 14. Does LinkedHashMap sort its keys?

No. It maintains insertion order rather than sorting keys.

### 15. When should LinkedHashMap be used?

Use LinkedHashMap when you need Map functionality and predictable insertion-order iteration.

### 16. What is the average expected time complexity of get()?

The average expected time complexity is O(1).

### 17. What is the average expected time complexity of put()?

The average expected time complexity is O(1).

### 18. What is the average expected time complexity of remove()?

The average expected time complexity is O(1).

### 19. Can LinkedHashMap be used when sorted keys are required?

Not by itself. Use TreeMap when sorted key order is required.

### 20. Why would you choose LinkedHashMap over HashMap?

Choose LinkedHashMap when maintaining insertion order during iteration is important.

## Quick Interview Summary

    HashMap
    → No guaranteed iteration order

    LinkedHashMap
    → Insertion order

    TreeMap
    → Sorted key order

    put()
    → Add/update

    get()
    → Get value

    containsKey()
    → Check key

    containsValue()
    → Check value

    remove()
    → Remove mapping

    size()
    → Number of mappings