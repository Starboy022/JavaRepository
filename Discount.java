import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double quantity,price,amount,discount;
        System.out.println("Enter The Price Of The Product:");
        price=sc.nextDouble();
        System.out.println("Enter The No Of Quantity:");
        quantity=sc.nextDouble();
        amount=quantity*price;
        if(quantity>=10){
            discount=amount*0.10;
            amount=amount-discount;
            System.out.println("The Total Amount is:"+amount);
        }else{
            System.out.println("The Total Amount is:"+amount);
        }
    }
}
