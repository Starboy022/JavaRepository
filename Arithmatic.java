import java.util.Scanner;

public class Arithmatic { // + - * / %


    public void add() //add
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any two numbers to add");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println("Addition = " + result);
    }

    public int sub(int a , int b) //sub
    {
        return (a-b);
    }
    public void multiply() //multiply
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any two numbers to multiply");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1*num2;
        System.out.println("multiply = " + result);
    }

    public int divide(int c , int d) //divide
    {
        return (c/d);
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Arithmatic obj = new Arithmatic();
        obj.add(); //add

        System.out.println("Enter any two numbers subtract"); //sub
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Subtraction = " + obj.sub(num1,num2));

        obj.multiply(); //multiply

        System.out.println("Enter any two numbers divide"); //divide
        int num3= sc.nextInt();
        int num4= sc.nextInt();
        System.out.println("Division = " + obj.divide(num3,num4));
    }
}
