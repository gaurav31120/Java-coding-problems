class SalaryCalculator {
    public static void main(String[] args) {
        int basicSalary = 30000;
        int bonus = 5000;
        int tax = 3000;

        int netSalary = basicSalary + bonus - tax;

        System.out.println("Basic salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax: " + tax);
        System.out.println("Net salary: " + netSalary);
    }
}

// output 
// Basic salary: 30000
// Bonus: 5000
// Tax: 3000
// Net salary: 32000