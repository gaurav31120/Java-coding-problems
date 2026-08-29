# Notes — CJ-061 Bank Account

## Concepts Learned

- Encapsulation
- Class & Object
- Constructor
- Instance variables
- Instance methods
- Object state
- Methods modifying object data

## Key Learning

An object can contain both **data** and **methods that operate on that data**.

The `BankAccount` object stores the account information and its methods modify the account balance.

Example:

    bank.depositMoney(deposit);
    bank.withdrawalMoney(withdraw);

The object's `balance` changes when these methods are called.

## Interview Questions & Answers

### 1. What is encapsulation?

Encapsulation is the concept of combining data and the methods that operate on that data inside a class.

### 2. Why are deposit and withdrawal methods placed inside `BankAccount`?

Because these operations directly modify the account's balance, so they belong to the `BankAccount` object's behavior.

### 3. What is object state?

Object state is the current value of an object's instance variables.

For example, the current `balance` represents part of a bank account's state.

### 4. What happens when `depositMoney()` is called?

The deposit amount is added to the object's current balance.

### 5. What happens when `withdrawalMoney()` is called?

The withdrawal amount is subtracted from the object's current balance.

### 6. Why should withdrawal be checked before subtracting the amount?

To prevent the account balance from becoming invalid due to an insufficient balance.

### 7. Can methods modify instance variables?

Yes. Instance methods can read and modify the instance variables of the object.

### 8. Why is using methods better than directly modifying the balance everywhere?

Methods keep the operations related to the account inside the `BankAccount` class and make the code easier to organize and maintain.