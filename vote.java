import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the age:");
        int age=sc.nextInt();
        String result= (age>=18?"yes":"no");
        System.out.println("Can the person vote?: " + result);

        }

}
