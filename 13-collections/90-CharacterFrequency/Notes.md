# Notes — CJ-090 Character Frequency

## Concepts Learned

- HashMap
- Character frequency
- Character
- charAt()
- String traversal
- containsKey()
- get()
- put()
- entrySet()
- Map.Entry
- size()

## Key Learning

HashMap can be used to count how many times each character appears in a String.

The character is stored as the key and its frequency is stored as the value.

Example:

    a → 3
    r → 2
    m → 2

The structure is:

    Character → Integer

Example:

    HashMap<Character, Integer> map = new HashMap<>();

## Character Traversal

Instead of using split(), traverse the String character by character.

Example:

    for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);
    }

`charAt(i)` returns the character at index `i`.

## Ignoring Spaces

If spaces should not be counted:

    if (ch == ' ') {
        continue;
    }

`continue` skips the current iteration and moves to the next character.

## Counting Character Frequency

For every character, first check whether it already exists.

    if (map.containsKey(ch)) {
        int count = map.get(ch);
        count++;
        map.put(ch, count);
    } else {
        map.put(ch, 1);
    }

If the character appears for the first time:

    character → 1

If it already exists:

    old count → old count + 1

## containsKey()

Use `containsKey()` to check whether a character already exists.

Example:

    map.containsKey('a');

Returns `true` if `'a'` exists.

Returns `false` if it does not exist.

## get()

Use `get()` to retrieve the current frequency.

Example:

    int count = map.get('a');

If:

    a → 2

then:

    map.get('a');

returns:

    2

## put()

Use `put()` to add or update the character frequency.

Example:

    map.put('a', 1);

Later:

    map.put('a', 2);

The value associated with `'a'` becomes `2`.

## entrySet()

Use `entrySet()` to iterate through character-frequency pairs.

Example:

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

`entry.getKey()` returns the character.

`entry.getValue()` returns its frequency.

## size()

Use `size()` to find the number of unique characters.

Example:

    map.size();

This counts unique characters, not total characters.

## Character vs String

A character uses single quotes:

    'a'

A String uses double quotes:

    "a"

For `HashMap<Character, Integer>`:

    map.get('a');

is correct.

    map.get("a");

is incorrect because `"a"` is a String.

## Word Frequency vs Character Frequency

CJ-089 used:

    HashMap<String, Integer>

because the key was a complete word.

CJ-090 uses:

    HashMap<Character, Integer>

because the key is an individual character.

Word frequency:

    word → count

Character frequency:

    character → count

## Frequency Process

For:

    java programming

The program processes characters one by one:

    j
    a
    v
    a
    p
    r
    o
    g
    r
    a
    m
    m
    i
    n
    g

Spaces are ignored.

The final map contains each unique character and its frequency.

## Important Point

The frequency belongs to each individual character.

Do not use one global counter for all characters.

Instead:

    int count = map.get(ch);
    count++;
    map.put(ch, count);

This retrieves, increases, and stores the frequency for the specific character.

## Interview Questions & Answers

### 1. How can HashMap be used for character frequency counting?

Store each character as a key and its frequency as the value.

Example:

    a → 3

### 2. Why do we use Character as the key?

Because each individual character needs its own frequency.

### 3. Why do we use Integer as the value?

Because the number of occurrences is represented by an integer.

### 4. What does charAt() do?

`charAt(index)` returns the character located at the specified index of a String.

Example:

    String text = "java";
    text.charAt(0);

returns:

    'j'

### 5. Why don't we use split() for character frequency?

`split()` is commonly used to divide a String into pieces such as words.

For character frequency, we can directly traverse the String using `charAt()`.

### 6. How do you skip spaces?

Use:

    if (ch == ' ') {
        continue;
    }

### 7. What does containsKey(ch) do?

It checks whether the character already exists in the HashMap.

### 8. What does get(ch) do?

It returns the current frequency associated with the character.

### 9. Why do we need put() after count++?

`count++` changes the local variable.

`put()` stores the updated frequency back into the HashMap.

### 10. What is the difference between 'a' and "a"?

`'a'` is a character.

`"a"` is a String.

### 11. How do you get the frequency of a character?

Use:

    map.get('a');

### 12. How do you check whether a character exists?

Use:

    map.containsKey('z');

### 13. What does map.size() represent in this problem?

It represents the number of unique characters stored in the map.

### 14. Does HashMap maintain character insertion order?

No. HashMap does not guarantee insertion order.

### 15. What is the average expected time complexity of containsKey()?

The average expected time complexity is O(1).

### 16. What is the average expected time complexity of get()?

The average expected time complexity is O(1).

### 17. What is the average expected time complexity of put()?

The average expected time complexity is O(1).

### 18. Why is entrySet() useful here?

It allows us to iterate through each character and its frequency together.

### 19. What is the difference between character frequency and unique character count?

Character frequency tells how many times a particular character appears.

Unique character count tells how many different characters exist.

### 20. How is CJ-090 different from CJ-089?

CJ-089 counts words:

    HashMap<String, Integer>

CJ-090 counts characters:

    HashMap<Character, Integer>

## Quick Interview Summary

    HashMap<Character, Integer>

    charAt()
    → Get character from String

    containsKey(ch)
    → Check whether character exists

    get(ch)
    → Get current frequency

    put(ch, count)
    → Add/update frequency

    entrySet()
    → Iterate character + frequency

    size()
    → Count unique characters