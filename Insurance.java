import java.util.Scanner;
//Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
//        If driver is married
//        If driver is unmarried male and age above 30
//        If driver is unmarried female and age above 25

public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the person married(yes/no):");
        String marital = sc.nextLine();
        String s = "yes", n = "no", gen1 = "male", gen2 = "female";
        if (s.equals(marital)) {
            System.out.println("you are eligible for insurance.");
        } else if (n.equals(marital)) {
            System.out.println("Enter the gender(male/female): ");
            String gender = sc.nextLine();

            if (gen1.equals(gender)) { //male
                System.out.println("Enter the age: ");
                int age1 = sc.nextInt();
                if (age1 >= 35) {
                    System.out.println("you are eligible for insurance.");
                } else {
                    System.out.println("you NOT are eligible for insurance.");
                }
            }
            if(gen2.equals(gender)){ //female
                System.out.println("Enter the age: ");
                int age2 = sc.nextInt();
                if (age2 >= 25) {
                    System.out.println("you are eligible for insurance.");
                } else {
                    System.out.println("you NOT are eligible for insurance.");
                }
                }
        }
    }
}

