# Notes — Problem 79: extends / super

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Wildcards

---

## 1. What is a Wildcard?

A wildcard is represented by:

    ?

It means an unknown type.

Example:

    List<?>

means a List of some unknown type.

---

## 2. ? extends

Example:

    List<? extends Number>

This means:

    List of some unknown type that is Number
    or a subclass of Number.

Possible lists:

    List<Integer>  ✅
    List<Double>   ✅
    List<Long>     ✅

---

## 3. Why use ? extends?

Use `extends` when the collection is primarily a PRODUCER of values.

We want to READ values from it.

Example:

    public static void printNumbers(
            List<? extends Number> numbers) {

        for (Number number : numbers) {
            System.out.println(number);
        }
    }

The method doesn't care whether the actual list is:

    List<Integer>
    List<Double>
    List<Long>

It only needs to know that the elements are Numbers.

---

## 4. What can we READ from ? extends?

Given:

    List<? extends Number> numbers

we can safely do:

    Number number = numbers.get(0);

because whatever type the list contains is guaranteed to extend Number.

---

## 5. Why can't we ADD to ? extends?

Suppose:

    List<? extends Number> numbers

The actual list could be:

    List<Integer>

or:

    List<Double>

Java does not know the exact type.

Therefore:

    numbers.add(10);

is not allowed.

The Integer might not belong to the actual list type.

So:

    ? extends → READ

---

## 6. ? super

Example:

    List<? super Integer>

This means:

    List of some unknown type that is Integer
    or a superclass of Integer.

Possible lists:

    List<Integer>  ✅
    List<Number>   ✅
    List<Object>   ✅

Because:

    Integer → Number → Object

---

## 7. Why use ? super?

Use `super` when the collection is primarily a CONSUMER of values.

We want to ADD values to it.

Example:

    public static void addIntegers(
            List<? super Integer> numbers) {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

All of these are safe.

---

## 8. What can we ADD to ? super?

Given:

    List<? super Integer> numbers

we can safely add:

    Integer

Example:

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

Because the actual list is guaranteed to be able to hold an Integer.

---

## 9. What can we READ from ? super?

We cannot safely assume that a retrieved value is an Integer.

For example:

    Integer number = numbers.get(0);

is not allowed.

The actual list could be:

    List<Object>

Therefore the safe type for reading is:

    Object

Example:

    Object value = numbers.get(0);

---

# 10. PECS

The most important rule:

    PECS

means:

    Producer Extends
    Consumer Super

### Producer

If the collection PRODUCES values for you:

    ? extends

Example:

    List<? extends Number>

You mainly READ.

### Consumer

If the collection CONSUMES values from you:

    ? super

Example:

    List<? super Integer>

You mainly ADD.

---

# 11. extends Example

    List<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);

This can be passed to:

    printNumbers(numbers);

because:

    Integer extends Number

Therefore:

    List<Integer>

can be viewed through:

    List<? extends Number>

---

# 12. super Example

    List<Number> numbers = new ArrayList<>();

This can be passed to:

    addIntegers(numbers);

because:

    Integer is a subtype of Number.

Therefore a Number list can safely store Integers.

---

# 13. extends vs super

| Feature | ? extends Number | ? super Integer |
|---|---|---|
| Meaning | Number or subclass | Integer or superclass |
| Main purpose | Read | Add |
| Producer | Yes | No |
| Consumer | No | Yes |
| Add Integer | ❌ | ✅ |
| Read as Number | ✅ | ❌ |
| Read as Object | ✅ | ✅ |

---

# 14. Inheritance Picture

    Object
       ↑
     Number
      ↑   ↑
  Integer Double

### ? extends Number

Possible:

    List<Integer>
    List<Double>
    List<Number>

### ? super Integer

Possible:

    List<Integer>
    List<Number>
    List<Object>

---

# 15. Generic Bound vs Wildcard

Do not confuse:

    <T extends Number>

with:

    ? extends Number

### Bounded Type Parameter

    <T extends Number>

Here we give the type parameter a name:

    T

Example:

    public static <T extends Number>
    double calculate(T number)

### Wildcard

    ? extends Number

Here we don't care about the exact type.

Example:

    List<? extends Number>

---

# 16. Important Rule

Remember:

    ? extends
    → mainly READ

    ? super
    → mainly ADD

And:

    PECS

    Producer Extends
    Consumer Super

---

# Interview Questions

## 1. What is a wildcard?

`?` represents an unknown generic type.

---

## 2. What does ? extends Number mean?

It means an unknown type that is Number or a subclass of Number.

---

## 3. What does ? super Integer mean?

It means an unknown type that is Integer or a superclass of Integer.

---

## 4. What is PECS?

PECS means:

    Producer Extends
    Consumer Super

---

## 5. Why can we read from ? extends?

Because the type is guaranteed to be Number or a subtype of Number.

Therefore reading it as Number is safe.

---

## 6. Why can't we add to ? extends?

Because the exact subtype is unknown.

The actual list might be List<Double>, while we might try to add an Integer.

---

## 7. Why can we add Integer to ? super Integer?

Because the actual type must be Integer or a superclass of Integer.

All of those can safely store an Integer.

---

## 8. What is safe to read from ? super Integer?

Object.

The exact generic type is unknown, so Object is the safest common type.

---

## 9. Can List<Integer> be passed to List<? extends Number>?

Yes.

Because Integer extends Number.

---

## 10. Can List<Number> be passed to List<? super Integer>?

Yes.

Because Number is a superclass of Integer.

---

## 11. What is the main difference?

    ? extends
    → producer
    → read

    ? super
    → consumer
    → add

---

# Quick Interview Answer

If asked:

"What is the difference between extends and super in generics?"

Answer:

"`? extends` represents an unknown subtype and is generally used when a collection is a producer that we want to read from. `? super` represents an unknown supertype and is generally used when a collection is a consumer that we want to add values to. The rule is PECS — Producer Extends, Consumer Super."