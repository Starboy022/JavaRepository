import java.util.Scanner;
public class Area {
    static void Circle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius" );
        int c_radius=sc.nextInt();
        double pi = 3.142, c_area;
        c_area=pi * c_radius * c_radius;
        System.out.println("area of circle: "+c_area);

    }
    static void Square(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: " );
        int s_len=sc.nextInt();
        double s_area;
        s_area=s_len * s_len;
        System.out.println("area of Square: "+s_area);

    }
    static void Triangle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height: " );
        int t_height=sc.nextInt();
        System.out.println("Enter the base: " );
        int t_base=sc.nextInt();
        double t_area;
        t_area=(t_height * t_base)/2;
        System.out.println("area of Triangle: "+t_area);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------To find area of shapes--------------------");
        System.out.println("Enter a number:(1-Circle/2-Square/3-Triangle): ");
        int opt=sc.nextInt();
        switch (opt){
            case 1:
                Circle();
                break;
            case 2:
                Square();
                break;
            case 3:
                Triangle();
                break;
            default:
                System.out.println("Enter a valid number(1/2/3)");
        }
    }
}

