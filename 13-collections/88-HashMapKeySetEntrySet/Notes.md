# Notes — CJ-088 keySet / entrySet

## Concepts Learned

- HashMap
- keySet()
- entrySet()
- get()
- getKey()
- getValue()
- size()
- HashMap iteration

## Key Learning

`keySet()` returns all the keys from a HashMap.

`entrySet()` returns all key-value mappings from a HashMap.

Example:

    HashMap<Integer, String> employees = new HashMap<>();

    employees.put(101, "Amit");
    employees.put(102, "Rahul");

The map contains:

    101 → Amit
    102 → Rahul

## keySet()

`keySet()` returns a Set containing all keys.

Example:

    for (Integer id : employees.keySet()) {
        System.out.println(id);
    }

Output:

    101
    102

To get the value using the key:

    for (Integer id : employees.keySet()) {
        System.out.println(employees.get(id));
    }

## get()

`get()` returns the value associated with a key.

Example:

    employees.get(101);

returns:

    Amit

The key is passed to `get()`.

## entrySet()

`entrySet()` returns all key-value mappings.

Example:

    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

## getKey()

`getKey()` returns the key from a Map.Entry.

Example:

    entry.getKey();

If the entry is:

    101 → Amit

then:

    entry.getKey();

returns:

    101

## getValue()

`getValue()` returns the value from a Map.Entry.

Example:

    entry.getValue();

If the entry is:

    101 → Amit

then:

    entry.getValue();

returns:

    Amit

## keySet() vs entrySet()

`keySet()`:

    keySet()
    ↓
    Keys only
    ↓
    Use get(key) to retrieve values

`entrySet()`:

    entrySet()
    ↓
    Key + Value
    ↓
    Use getKey() and getValue()

## Iterating Using keySet()

Example:

    for (Integer id : employees.keySet()) {
        System.out.println(id);
        System.out.println(employees.get(id));
    }

This is useful when we primarily work with keys.

## Iterating Using entrySet()

Example:

    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }

This is useful when we need both the key and value.

## size()

Use `size()` to find the number of key-value mappings.

Example:

    employees.size();

If there are five employees:

    5

## HashMap Ordering

HashMap does not guarantee insertion order.

Therefore, we should not depend on the order in which keys or entries are displayed.

## Interview Questions & Answers

### 1. What does keySet() return?

`keySet()` returns a Set containing all keys present in the HashMap.

### 2. What does entrySet() return?

`entrySet()` returns a Set containing all key-value mappings of the HashMap.

### 3. What is the difference between keySet() and entrySet()?

`keySet()` provides only keys.

`entrySet()` provides both keys and values through Map.Entry objects.

### 4. How do you get a value when iterating using keySet()?

Use `map.get(key)`.

Example:

    for (Integer id : map.keySet()) {
        System.out.println(map.get(id));
    }

### 5. How do you get the key from a Map.Entry?

Use:

    entry.getKey();

### 6. How do you get the value from a Map.Entry?

Use:

    entry.getValue();

### 7. Which is generally preferable when you need both key and value?

`entrySet()` is generally preferable because each entry already contains both the key and value.

### 8. Can keySet() contain duplicate keys?

No. HashMap itself cannot contain duplicate keys, so keySet() contains unique keys.

### 9. Can multiple keys have the same value?

Yes.

For example:

    map.put(101, "Amit");
    map.put(102, "Amit");

Both mappings are valid.

### 10. What is the return type of keySet()?

It returns a `Set<K>` containing the keys.

### 11. What is the return type of entrySet()?

It returns a `Set<Map.Entry<K, V>>` containing the key-value mappings.

### 12. What is Map.Entry?

`Map.Entry` represents a single key-value mapping inside a Map.

### 13. What is the difference between getKey() and getValue()?

`getKey()` returns the key of an entry.

`getValue()` returns the value of an entry.

### 14. Does keySet() return a copy of the keys?

No. It returns a view backed by the map.

### 15. Does entrySet() return a copy of the entries?

No. It returns a view backed by the map.

### 16. What is the difference between get() and getValue()?

`map.get(key)` retrieves a value from the map using a key.

`entry.getValue()` retrieves the value from an existing Map.Entry.

### 17. When should keySet() be used?

Use `keySet()` when you primarily need to work with the keys and can retrieve values using `get()` when needed.

### 18. When should entrySet() be used?

Use `entrySet()` when you need both keys and values while iterating through a HashMap.

## Quick Interview Summary

    keySet()
    → Keys only
    → map.get(key) → value

    entrySet()
    → Key + Value
    → entry.getKey()
    → entry.getValue()

Important methods:

    keySet()    → All keys
    entrySet()  → All entries
    get()       → Value using key
    getKey()    → Key from entry
    getValue()  → Value from entry
    size()      → Number of mappings