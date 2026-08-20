
import java.util.Scanner;

class EligibilityChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter citizen: ");
        boolean citizen = sc.nextBoolean();
        System.out.println("Enter income: ");
        double income = sc.nextDouble();
        System.out.println("Enter credit score: ");
        int creditScore = sc.nextInt();
        System.out.println("Enter loan: ");
        boolean isLoan = sc.nextBoolean();

        boolean ageEligible = age >= 21;
        boolean citizenEligible = citizen;
        boolean financialEligible = income >=50000 || creditScore >= 750;
        boolean loanEligible = !isLoan;
        boolean finalEligibility = ageEligible && citizenEligible && financialEligible && loanEligible;

        System.out.println("===== Eligibility Report =====");
        System.out.println("Age Check: " + (ageEligible ? "PASS" : "FAIL"));
        System.out.println("Citizenship Check: " + (citizenEligible? "PASS" : "FAIL"));
        System.out.println("Financial Check: " + (financialEligible? "PASS" : "FAIL"));
        System.out.println("Existing Loan Check: " + (loanEligible? "PASS" : "FAIL"));
        System.out.println("Final Decision: " + (finalEligibility? "ELIGIBLE" : "NOT-ELIGIBLE"));

    }
}