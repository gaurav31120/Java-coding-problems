# Notes — CJ-089 Word Frequency

## Concepts Learned

- HashMap
- Word frequency counting
- split()
- containsKey()
- get()
- put()
- entrySet()
- Map.Entry
- size()
- Updating HashMap values

## Key Learning

HashMap can be used to count how many times each word appears.

The word is stored as the key and its frequency is stored as the value.

Example:

    java → 2
    is → 2
    easy → 1

## Splitting a String

Use `split()` to divide a sentence into individual words.

Example:

    String sentence = "java is easy and java is powerful";

    String[] words = sentence.split(" ");

This produces individual words that can be processed using a loop.

## Counting Word Frequency

For every word, first check whether it already exists.

Example:

    if (map.containsKey(word)) {
        int count = map.get(word);
        count++;
        map.put(word, count);
    } else {
        map.put(word, 1);
    }

If the word appears for the first time:

    word → 1

If it already exists:

    old count → old count + 1

## containsKey()

Use `containsKey()` to check whether a word already exists in the HashMap.

Example:

    map.containsKey("java");

Returns `true` if `"java"` exists.

Returns `false` if it does not exist.

## get()

Use `get()` to retrieve the current frequency.

Example:

    int count = map.get("java");

If:

    java → 1

then:

    map.get("java");

returns:

    1

## put()

Use `put()` to add a new word or update an existing frequency.

Example:

    map.put("java", 1);

Later:

    map.put("java", 2);

The value associated with `"java"` is updated to `2`.

## entrySet()

Use `entrySet()` to iterate through every word and its frequency.

Example:

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

`entry.getKey()` returns the word.

`entry.getValue()` returns its frequency.

## size()

Use `size()` to find the number of unique words.

For:

    java
    is
    easy
    and
    powerful

The size is:

    5

## Word Frequency Process

The sentence:

    java is easy and java is powerful

is processed like this:

    java → 1
    is → 1
    easy → 1
    and → 1
    java → 2
    is → 2
    powerful → 1

Final result:

    java → 2
    is → 2
    easy → 1
    and → 1
    powerful → 1

## Important Point

The frequency belongs to each individual word.

Do not use one global counter for all words.

Instead, retrieve the current frequency for the specific word:

    map.get(word)

Then increase it and store it again:

    map.put(word, count);

## Interview Questions & Answers

### 1. How can HashMap be used for word frequency counting?

Store each word as a key and its frequency as the value.

Example:

    java → 2

### 2. Why do we use containsKey()?

We use `containsKey()` to determine whether the word has already been encountered.

### 3. What happens when a word appears for the first time?

It is added to the HashMap with frequency `1`.

Example:

    map.put(word, 1);

### 4. What happens when a word appears again?

Its existing frequency is retrieved, increased by one, and stored again.

Example:

    int count = map.get(word);
    count++;
    map.put(word, count);

### 5. Why can't we just use map.get(word)?

`get()` only retrieves the value. It does not modify the HashMap.

We must use `put()` to store the updated frequency.

### 6. What does split(" ") do?

It splits a String wherever a space occurs and returns an array of individual words.

### 7. Why is the word the key?

Each unique word needs its own frequency, so the word naturally acts as the unique key.

### 8. Why is the frequency the value?

The number of occurrences can change, so it is stored as the value associated with the word.

### 9. How do you get the frequency of a particular word?

Use `get()`.

Example:

    map.get("java");

### 10. How do you check whether a particular word exists?

Use:

    map.containsKey("java");

### 11. How do you find the number of unique words?

Use:

    map.size();

### 12. How do you iterate through word-frequency pairs?

Use `entrySet()`:

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

### 13. What is the difference between containsKey() and containsValue()?

`containsKey()` checks whether a key exists.

`containsValue()` checks whether a value exists.

### 14. What is the average expected time complexity of containsKey() in HashMap?

The average expected time complexity is O(1).

### 15. What is the average expected time complexity of get() in HashMap?

The average expected time complexity is O(1).

### 16. What is the average expected time complexity of put() in HashMap?

The average expected time complexity is O(1).

### 17. Why is HashMap useful for frequency counting?

HashMap provides key-based storage, allowing each word to be associated with and updated through its frequency.

### 18. Can two different words have the same frequency?

Yes.

For example:

    java → 2
    is → 2

Different keys can have the same value.

## Quick Interview Summary

    Word → Frequency

    containsKey()
    → Check whether word exists

    get()
    → Get current frequency

    put()
    → Add/update frequency

    entrySet()
    → Iterate word + frequency

    size()
    → Count unique words