# Notes — CJ-093 ConcurrentHashMap

## Concepts Learned

- ConcurrentHashMap
- Concurrent collections
- Thread
- start()
- join()
- put()
- get()
- containsKey()
- containsValue()
- remove()
- size()
- Concurrent access

## Key Learning

ConcurrentHashMap is a Map implementation designed for use when multiple threads access and modify a shared map.

Example:

    ConcurrentHashMap<Integer, String> emp = new ConcurrentHashMap<>();

It stores key-value pairs like a normal Map, but is designed to support concurrent access.

## Creating a ConcurrentHashMap

Example:

    ConcurrentHashMap<Integer, String> emp = new ConcurrentHashMap<>();

Here:

    Integer → Key
    String → Value

## Adding Elements

Use `put()`:

    emp.put(101, "Amit");
    emp.put(102, "Rahul");

## Getting Values

Use `get()`:

    emp.get(103);

This returns the value associated with key `103`.

## Checking Keys

Use:

    emp.containsKey(104);

Returns `true` if key `104` exists.

## Checking Values

Use:

    emp.containsValue("Rahul");

Returns `true` if `"Rahul"` exists as a value.

## Updating Values

Use `put()` with an existing key:

    emp.put(103, "Karan");

This replaces the previous value associated with key `103`.

## Removing Elements

Use:

    emp.remove(102);

This removes the mapping associated with key `102`.

## size()

Use:

    emp.size();

to get the number of mappings in the map.

## Using Threads

A Thread can be created using a lambda expression:

    Thread t1 = new Thread(() -> {
        emp.put(106, "Arjun");
    });

Another thread can modify the same ConcurrentHashMap:

    Thread t2 = new Thread(() -> {
        emp.put(107, "Sneha");
    });

## start()

Use `start()` to begin execution of a thread.

Example:

    t1.start();
    t2.start();

The threads can execute independently.

## join()

Use `join()` to make the main thread wait for another thread to finish.

Example:

    t1.join();
    t2.join();

This ensures that the final map is displayed after both threads have completed their operations.

## Handling InterruptedException

`join()` can throw `InterruptedException`.

Therefore it can be handled using:

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

## ConcurrentHashMap Thread Example

Conceptually:

                ConcurrentHashMap
                       ↑
                Shared employee map
                   ↙         ↘
              Thread 1     Thread 2
              106 → Arjun   107 → Sneha

Both threads operate on the same map.

## HashMap vs ConcurrentHashMap

HashMap:

    General-purpose Map.
    Not designed for safe concurrent modification by multiple threads.

ConcurrentHashMap:

    Designed for concurrent access.
    Suitable for shared maps accessed by multiple threads.

## Important Point

The purpose of this problem is not just to replace:

    HashMap

with:

    ConcurrentHashMap

The important concept is that multiple threads can access the same map.

## Output Order

Do not rely on a specific iteration order when displaying a ConcurrentHashMap.

The important requirement is that both entries exist after both threads finish:

    106 → Arjun
    107 → Sneha

## Interview Questions & Answers

### 1. What is ConcurrentHashMap?

ConcurrentHashMap is a Map implementation designed to support concurrent access by multiple threads.

### 2. Why use ConcurrentHashMap?

It can be used when multiple threads need to access and modify a shared map.

### 3. How is ConcurrentHashMap different from HashMap?

HashMap is not designed for concurrent modification by multiple threads.

ConcurrentHashMap is designed for concurrent access.

### 4. Does ConcurrentHashMap maintain insertion order?

No. You should not rely on insertion order.

### 5. Does ConcurrentHashMap sort its keys?

No. It does not provide sorted-key behavior like TreeMap.

### 6. What does put() do?

It adds a new key-value mapping or updates an existing key.

### 7. What does get() do?

It returns the value associated with a key.

### 8. What does containsKey() do?

It checks whether a specified key exists.

### 9. What does containsValue() do?

It checks whether a specified value exists.

### 10. What does remove() do?

It removes the mapping associated with a specified key.

### 11. What does size() return?

It returns the number of key-value mappings.

### 12. What does Thread.start() do?

It starts a new thread and causes its run logic to execute concurrently.

### 13. What does Thread.join() do?

It makes the current thread wait until the specified thread finishes.

### 14. Why did we use join() in this problem?

We used `join()` so that the main thread waits for both worker threads before displaying the final map.

### 15. Can multiple threads access the same ConcurrentHashMap?

Yes. ConcurrentHashMap is designed for concurrent access.

### 16. Does ConcurrentHashMap allow null keys?

No. ConcurrentHashMap does not allow null keys.

### 17. Does ConcurrentHashMap allow null values?

No. ConcurrentHashMap does not allow null values.

### 18. Is ConcurrentHashMap the same as Collections.synchronizedMap()?

No. They are different approaches to concurrent Map access.

### 19. When would you choose ConcurrentHashMap?

Choose it when multiple threads need to work with a shared Map and concurrent access is required.

### 20. Why shouldn't we simply use HashMap here?

Because the problem involves multiple threads modifying the same shared map, which requires a collection designed for concurrent access.

## Quick Interview Summary

    HashMap
    → General-purpose Map

    LinkedHashMap
    → Insertion order

    TreeMap
    → Sorted key order

    ConcurrentHashMap
    → Concurrent access

    Thread.start()
    → Start thread

    Thread.join()
    → Wait for thread to finish

    ConcurrentHashMap
    → Shared Map for concurrent operations