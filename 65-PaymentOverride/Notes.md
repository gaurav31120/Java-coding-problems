# Notes — CJ-065 Payment Override

## Concepts Learned

- Method overriding
- Inheritance
- `extends`
- `@Override`
- Parent and child methods

## Key Learning

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

Example:

    class CardPayment extends Payment {
        @Override
        void processPayment() {
            System.out.println("Processing card payment");
        }
    }

The method has the same name and parameters as the parent method, but the child provides its own implementation.

## Interview Questions & Answers

### 1. What is method overriding?

Method overriding occurs when a child class provides its own implementation of a method inherited from the parent class.

### 2. Which keyword is used for inheritance?

The `extends` keyword is used for class inheritance.

### 3. What is the purpose of `@Override`?

`@Override` tells the compiler that the method is intended to override a method from the parent class.

### 4. Can a child class change the implementation of a parent method?

Yes. A child class can provide its own implementation of an inherited method.

### 5. What must be the same for method overriding?

The method name and parameter list must match the parent method. The return type must also be compatible.

### 6. What is the difference between overriding and overloading?

Overriding occurs between parent and child classes with the same method signature. Overloading uses the same method name with different parameter lists.

### 7. Why do CardPayment and UPIPayment override the same method?

Each payment type needs its own implementation of the payment-processing behavior.

### 8. Is `@Override` mandatory?

No, but it is strongly recommended because the compiler can detect incorrect overriding.