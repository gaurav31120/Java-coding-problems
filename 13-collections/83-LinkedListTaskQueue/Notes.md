# Notes — CJ-083 LinkedList Task Queue

## Concepts Learned

- LinkedList
- add()
- addFirst()
- addLast()
- getFirst()
- getLast()
- removeFirst()
- removeLast()
- size()

## Key Learning

LinkedList is a List implementation that allows efficient insertion and removal at both ends.

Example:

    LinkedList<String> tasks = new LinkedList<>();

## Adding Elements

Normal add():

    tasks.add("Task-1");

Adds an element to the end.

addFirst():

    tasks.addFirst("Urgent-Task");

Adds an element at the beginning.

addLast():

    tasks.addLast("Final-Task");

Adds an element at the end.

## Reading Elements

getFirst():

    tasks.getFirst();

Returns the first element.

getLast():

    tasks.getLast();

Returns the last element.

## Removing Elements

removeFirst():

    tasks.removeFirst();

Removes the first element.

removeLast():

    tasks.removeLast();

Removes the last element.

## Interview Questions & Answers

### 1. What is LinkedList?

LinkedList is a List implementation based on a doubly linked list.

### 2. Does LinkedList maintain insertion order?

Yes. LinkedList maintains the order in which elements are inserted.

### 3. Does LinkedList allow duplicates?

Yes. LinkedList allows duplicate elements.

### 4. What is the difference between ArrayList and LinkedList?

ArrayList is backed by a dynamically resizable array, while LinkedList is based on linked nodes.

ArrayList is generally better for frequent random access, while LinkedList can be useful for frequent insertions and removals at the ends.

### 5. What does addFirst() do?

It adds an element at the beginning of the LinkedList.

### 6. What does addLast() do?

It adds an element at the end of the LinkedList.

### 7. What does getFirst() do?

It returns the first element without removing it.

### 8. What does removeFirst() do?

It removes and returns the first element.

### 9. What does removeLast() do?

It removes and returns the last element.

### 10. Can LinkedList be used as a Queue?

Yes. LinkedList implements the Queue and Deque interfaces and can be used for queue-like operations.

### 11. What is the typical complexity of adding/removing at the ends?

Adding or removing at the ends can be O(1) when using the appropriate LinkedList operations.

### 12. Does LinkedList provide random access?

Yes, through methods such as get(index), but indexed access is generally O(n), unlike ArrayList's typical O(1) indexed access.