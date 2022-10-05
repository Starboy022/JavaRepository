import java.util.Scanner;
public class Salary {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            double sal, bonus;
            System.out.println("Enter Salary: ");
            sal= sc.nextDouble();
            if(sal>=20000){
                bonus= .1;
            }
            else bonus= .2;
            double Nsal= sal+ .1*sal+ .15*sal+ .2*sal- .12*sal+ bonus*sal;
            System.out.println("New Salary: "+ Nsal);
        }
}
