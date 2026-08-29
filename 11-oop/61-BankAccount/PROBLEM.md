# Problem CJ-061 — Bank Account

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Encapsulation

## Objective

Create a BankAccount class that manages account details, deposits, withdrawals, and balance.

## Problem Statement

Create a BankAccount class with:

- accountNumber
- accountHolder
- balance

Create methods to:

1. Deposit money.
2. Withdraw money.
3. Display account details.

Take account details from the user, create a BankAccount object, perform a deposit and withdrawal, and display the final account details.

## Rules

- Create a separate BankAccount class.
- Use instance variables.
- Create a constructor to initialize the account.
- Create a deposit() method.
- Create a withdraw() method.
- Do not allow withdrawal greater than the available balance.
- Use Scanner.
- Do not use inheritance or interfaces.

## Example

Input:

1001
Gaurav
5000
2000
1500

Expected Output:

===== Bank Account =====
Account Number: 1001
Account Holder: Gaurav
Balance: 5500.0

## Test Cases

### Test Case 1

Input:

1001
Gaurav
5000
2000
1500

Expected:

Balance: 5500.0

### Test Case 2

Input:

2001
Rahul
10000
5000
3000

Expected:

Balance: 12000.0

### Test Case 3

Input:

3001
Amit
5000
1000
7000

Expected:

Insufficient balance
Balance: 6000.0

## Constraints

- Initial balance cannot be negative.
- Deposit amount must be positive.
- Withdrawal amount must be positive.
- Withdrawal cannot exceed the current balance.
- Use a constructor.
- Use methods for deposit and withdrawal.
- Use Scanner.

## Learning Outcome

Understand how an object can contain both data and methods that operate on that data.