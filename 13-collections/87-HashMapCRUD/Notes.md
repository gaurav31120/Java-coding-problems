# Notes — CJ-087 HashMap CRUD

## Concepts Learned

- HashMap
- Key-value pairs
- put()
- get()
- containsKey()
- containsValue()
- remove()
- size()
- entrySet()
- Map.Entry
- Updating values

## Key Learning

HashMap stores data in the form of key-value pairs.

Example:

    HashMap<Integer, String> employees = new HashMap<>();

Here:

    Integer → Key
    String → Value

Example:

    employees.put(101, "Amit");

Means:

    101 → Amit

Each key should be unique.

## Adding Elements

Use `put()`:

    employees.put(101, "Amit");
    employees.put(102, "Rahul");

`put()` adds a new key-value pair when the key does not already exist.

## Updating Elements

`put()` can also update an existing key.

Example:

    employees.put(103, "Gaurav");

Then:

    employees.put(103, "Karan");

The key `103` is not duplicated.

Its value changes from:

    Gaurav

to:

    Karan

`put()` returns the previous value when the key already exists.

## Getting Elements

Use `get()`:

    employees.get(103);

This returns the value associated with key `103`.

Example:

    employees.get(103);

returns:

    Gaurav

## Checking Keys

Use `containsKey()`:

    employees.containsKey(104);

Returns `true` if key `104` exists.

Returns `false` if the key does not exist.

## Checking Values

Use `containsValue()`:

    employees.containsValue("Rahul");

Returns `true` if `"Rahul"` exists as a value.

Returns `false` if the value does not exist.

## Removing Elements

Use `remove()`:

    employees.remove(102);

This removes the key-value mapping associated with key `102`.

Example:

    102 → Rahul

is removed.

## Counting Elements

Use `size()`:

    employees.size();

It returns the number of key-value mappings currently stored in the HashMap.

## Iterating HashMap

Use `entrySet()` to iterate through key-value pairs:

    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

`entry.getKey()` returns the key.

`entry.getValue()` returns the value.

## HashMap Ordering

HashMap does not guarantee insertion order.

Therefore, we should not depend on the order in which entries are displayed.

If insertion order is required, use `LinkedHashMap`.

## HashMap Keys

HashMap does not allow duplicate keys.

If the same key is inserted again, its value is replaced.

Example:

    map.put(101, "Amit");
    map.put(101, "Rahul");

Final mapping:

    101 → Rahul

There is still only one key `101`.

## HashMap Values

Different keys can have the same value.

Example:

    map.put(101, "Amit");
    map.put(102, "Amit");

Both mappings are valid.

## Interview Questions & Answers

### 1. What is HashMap?

HashMap is a Java collection that stores data in key-value pairs.

### 2. Does HashMap allow duplicate keys?

No. A HashMap cannot contain duplicate keys.

If the same key is inserted again, the old value is replaced.

### 3. Can HashMap have duplicate values?

Yes. Multiple keys can have the same value.

### 4. What does put() do?

`put()` adds a new key-value mapping or updates the value of an existing key.

### 5. What does put() return?

`put()` returns the previous value associated with the key.

If the key did not previously exist, it returns `null`.

### 6. What does get() do?

`get(key)` returns the value associated with the specified key.

### 7. What does containsKey() do?

It checks whether a particular key exists in the HashMap.

### 8. What does containsValue() do?

It checks whether a particular value exists in the HashMap.

### 9. What does remove() do?

It removes the key-value mapping associated with the specified key.

### 10. What does size() return?

`size()` returns the number of key-value mappings in the HashMap.

### 11. How do you iterate through both keys and values?

Use `entrySet()`:

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }

### 12. What is the difference between keySet() and entrySet()?

`keySet()` returns all keys.

`entrySet()` returns all key-value mappings.

### 13. Does HashMap maintain insertion order?

No. HashMap does not guarantee insertion order.

### 14. Which Map maintains insertion order?

`LinkedHashMap` maintains insertion order.

### 15. Which Map stores keys in sorted order?

`TreeMap` stores keys according to their natural ordering or a supplied Comparator.

### 16. Can HashMap contain null?

Yes. HashMap permits one `null` key and can contain multiple `null` values.

### 17. What is the average expected time complexity of get() in HashMap?

The average expected time complexity is O(1).

### 18. What is the average expected time complexity of put() in HashMap?

The average expected time complexity is O(1).

### 19. What is the average expected time complexity of remove() in HashMap?

The average expected time complexity is O(1).

### 20. What happens when the same key is inserted twice?

The second `put()` replaces the value associated with that key.

Example:

    map.put(101, "Amit");
    map.put(101, "Rahul");

Final:

    101 → Rahul

### 21. When should HashMap be used?

Use HashMap when data needs to be stored and accessed using unique keys and fast key-based lookup is required.