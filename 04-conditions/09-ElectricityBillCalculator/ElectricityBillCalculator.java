
import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter units: ");
        int units = sc.nextInt();
        int amtPerUnit;
        double baseBill = 0.0;

        if (units < 0) {
            System.out.println("Invalid units");
        }

        else {
            if (units <= 100) {
                amtPerUnit = 2;
                baseBill += (double) units * amtPerUnit;
            }
            else if (units <= 200) {
                amtPerUnit = 3;
                baseBill += (double) ((units - 100) * amtPerUnit + 100 * 2);
            }
            else if (units <= 400) {
                amtPerUnit = 5;
                baseBill += (double) ((units - 200) * amtPerUnit + 100 * 3 + 100 * 2 );
            }
            else if (units > 400) {
                amtPerUnit = 7;
                baseBill += (double) ((units - 400) * amtPerUnit + 200 * 5 + 100 * 3 + 100 * 2);
            }

            double finalBill = baseBill;
            double superCharge = 0.0;

            if (baseBill > 2000) {
                superCharge = (baseBill * 5) / 100;
                finalBill = baseBill + superCharge;
            }

            System.out.println(" ===== Electricity Bill =====");
            System.out.println("Units Consumed: " + units);
            System.out.println("Base Bill: ₹" + baseBill);
            System.out.println("Surcharge: ₹" + superCharge);
            System.out.println("Final Bill: ₹" + finalBill);

        }

    }

}
