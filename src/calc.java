import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        System.out.println("welcome to calc here you have to enter two numbers and can perform basic operations");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the operation as + - * / ");
        char op=sc.next().charAt(0);
        if(op=='+')
        {
            System.out.println(num1+num2);
        }
        if(op=='-')
        {
            System.out.println(num1-num2);
        }
        if(op=='*')
        {
            System.out.println(num1*num2);
        }
        if(op=='/')
        {
            System.out.println(num1%num2);
        }
        else
            System.out.println("Enter valid options");
    }
}
