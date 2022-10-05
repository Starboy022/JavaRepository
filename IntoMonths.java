import java.util.Scanner;

public class IntoMonths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of days: ");
        int days=sc.nextInt();
        int remain_days=days%30;
        int month=days/30;
        System.out.println(days + " days = " + month + " Month and " + remain_days + " days");
    }
}
