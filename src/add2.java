import java.util.Scanner;
public class add2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operation you want to do ");
        int c=sc.next().charAt(0);
        if(c == '+')
        {
            System.out.println("add : "+add(a,b));
        }
        if(c=='-')
        {
            System.out.println("add : "+sub(a,b));
        }
        if(c=='*')
        {
            System.out.println("add : "+multiple(a,b));
        }
        if(c=='/')
        {
            System.out.println("add : "+divi(a,b));
        }

    }
    public static int add(int a, int b)
    {

        return a+b;
    }
    public static int sub(int a, int b)
    {

        return a-b;
    }
    public static int multiple(int a, int b)
    {

        return a*b;
    }
    public static int divi(int a, int b)
    {

        return a/b;
    }

}
