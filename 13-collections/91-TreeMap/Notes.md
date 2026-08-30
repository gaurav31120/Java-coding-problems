# Notes — CJ-091 TreeMap

## Concepts Learned

- TreeMap
- Sorted Map
- put()
- get()
- containsKey()
- containsValue()
- remove()
- firstKey()
- lastKey()
- entrySet()
- size()
- Key ordering

## Key Learning

TreeMap is a Map implementation that stores key-value pairs while maintaining the keys in sorted order.

Example:

    TreeMap<Integer, String> map = new TreeMap<>();

If we insert:

    105 → Neha
    101 → Amit
    103 → Gaurav
    102 → Rahul
    104 → Priya

TreeMap stores the entries according to sorted keys:

    101 → Amit
    102 → Rahul
    103 → Gaurav
    104 → Priya
    105 → Neha

## Creating a TreeMap

Example:

    TreeMap<Integer, String> map = new TreeMap<>();

Here:

    Integer → Key
    String → Value

## Adding Elements

Use `put()`:

    map.put(101, "Amit");
    map.put(105, "Neha");

TreeMap automatically maintains the keys in sorted order.

## Getting Values

Use `get()`:

    map.get(103);

This returns the value associated with key `103`.

Example:

    103 → Gaurav

Therefore:

    map.get(103);

returns:

    Gaurav

## Checking Keys

Use `containsKey()`:

    map.containsKey(104);

Returns `true` if key `104` exists.

## Checking Values

Use `containsValue()`:

    map.containsValue("Rahul");

Returns `true` if `"Rahul"` exists as a value.

## Removing Elements

Use `remove()`:

    map.remove(102);

This removes the mapping associated with key `102`.

## firstKey()

Use `firstKey()` to get the smallest key.

Example:

    map.firstKey();

If the keys are:

    101
    103
    104
    105

then:

    map.firstKey();

returns:

    101

## lastKey()

Use `lastKey()` to get the greatest key.

Example:

    map.lastKey();

returns:

    105

## Iterating Through TreeMap

Use `entrySet()`:

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " → " + entry.getValue());
    }

The entries are encountered according to the TreeMap's key ordering.

## TreeMap vs HashMap

HashMap:

    Does not guarantee ordering.

TreeMap:

    Keeps keys sorted.

Example:

    HashMap
    → No guaranteed order

    TreeMap
    → Sorted by key

## TreeMap vs LinkedHashMap

HashMap:

    No guaranteed iteration order.

LinkedHashMap:

    Maintains insertion order.

TreeMap:

    Maintains sorted order of keys.

## Important Point

TreeMap sorts by the keys, not by the values.

Example:

    105 → Amit
    101 → Rahul
    103 → Neha

TreeMap sorts according to:

    101
    103
    105

It does not sort according to:

    Amit
    Neha
    Rahul

## Duplicate Keys

TreeMap does not allow duplicate keys.

If the same key is inserted again, the value is replaced.

Example:

    map.put(101, "Amit");
    map.put(101, "Karan");

Final mapping:

    101 → Karan

## size()

Use:

    map.size();

to find the number of key-value mappings.

## Interview Questions & Answers

### 1. What is TreeMap?

TreeMap is a Map implementation that maintains its keys in sorted order.

### 2. How does TreeMap differ from HashMap?

HashMap does not guarantee ordering, while TreeMap maintains sorted key order.

### 3. How does TreeMap differ from LinkedHashMap?

LinkedHashMap maintains insertion order, while TreeMap maintains sorted key order.

### 4. Does TreeMap sort keys or values?

TreeMap sorts keys.

### 5. What does firstKey() do?

`firstKey()` returns the smallest key currently present in the TreeMap.

### 6. What does lastKey() do?

`lastKey()` returns the greatest key currently present in the TreeMap.

### 7. Does TreeMap allow duplicate keys?

No. If the same key is inserted again, its existing value is replaced.

### 8. Can TreeMap contain duplicate values?

Yes. Different keys can have the same value.

### 9. What does get() do?

`get(key)` returns the value associated with the specified key.

### 10. What does containsKey() do?

It checks whether a specified key exists.

### 11. What does containsValue() do?

It checks whether a specified value exists.

### 12. What does remove() do?

It removes the mapping associated with the specified key.

### 13. What does size() return?

It returns the number of key-value mappings currently stored.

### 14. How can you iterate through a TreeMap?

Use `entrySet()`:

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

### 15. What is the default ordering of TreeMap?

TreeMap uses the natural ordering of its keys unless a Comparator is supplied.

### 16. What is the typical time complexity of get() in TreeMap?

TreeMap operations such as `get()` are typically O(log n).

### 17. What is the typical time complexity of put() in TreeMap?

`put()` is typically O(log n).

### 18. What is the typical time complexity of remove() in TreeMap?

`remove()` is typically O(log n).

### 19. When should TreeMap be used?

Use TreeMap when you need Map functionality together with sorted keys.

### 20. Can TreeMap be used with custom sorting?

Yes. A Comparator can be supplied to define custom key ordering.

## Quick Interview Summary

    TreeMap
    → Map with sorted keys

    put()
    → Add/update mapping

    get()
    → Get value

    containsKey()
    → Check key

    containsValue()
    → Check value

    remove()
    → Remove mapping

    firstKey()
    → Smallest key

    lastKey()
    → Greatest key

    size()
    → Number of mappings

    HashMap
    → No guaranteed order

    LinkedHashMap
    → Insertion order

    TreeMap
    → Sorted key order