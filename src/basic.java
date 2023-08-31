import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        int a =sc.nextInt();
        if(a%2==0)
        {
            System.out.println("It is even");

        }
        else
            System.out.println("It is odd");

    }
}
