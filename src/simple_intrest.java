import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount");
        int p=sc.nextInt();
        System.out.println("Enter the time period");
        int t= sc.nextInt();
        System.out.println("Enter the rate ");
        int r= sc.nextInt();
        System.out.println("The simple interst is "+(p*t*r));
    }
}
