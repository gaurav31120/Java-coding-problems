import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Java marks:");

        int java = sc.nextInt();
        System.out.println("Enter SQL marks:");
        int sql = sc.nextInt();
        System.out.println("Enter Spring boot marks:");
        int springBoot = sc.nextInt();

        if((java < 0 || java > 100) || (sql < 0 || sql > 100) || (springBoot < 0 || springBoot > 100)) {
            System.out.println("Invalid marks");
        }
            // valid marks
        else {

            String result;
            if(java >= 40 && sql >= 40 && springBoot >=40) {
                result = "PASS";
            }
            else {
                result = "FAIL";
            }

            double average = (java + sql + springBoot)/3.0; 
            char grade;

            if(average >=90 ) {
                grade = 'A';
            }
            else if(average >=75 ) {
                grade = 'B';
            }
            else if(average >=60 ) {
                grade = 'C';
            }
            else if(average >=40 ) {
                grade = 'D';
            }
            else {
                grade='F';
            }

            int highestMarks = Math.max(java, Math.max(sql, springBoot));

            String highestSubject = "";

            if(java == highestMarks) {
                highestSubject = highestSubject + "Java ";
            }
            if(sql == highestMarks) {
                highestSubject = highestSubject + "SQL ";
            }
            if(springBoot == highestMarks) {
                highestSubject = highestSubject + "Spring Boot ";
            }
            System.out.println("Report card");

            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("Highest Subject: " + highestSubject);
            System.out.println("Result: " + result);
            

        }
        sc.close();

    }
}