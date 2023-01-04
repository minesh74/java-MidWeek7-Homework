package midweekhomwork;
            //Take two int values from user and print greatest among them.
import java.util.Scanner;

public class GreatInt {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1 :");
        num1= sc.nextInt();
        System.out.println("Enter Number2 :");
        num2= sc.nextInt();
        if (num1>num2) {
            System.out.println("First Number is greater than Second Number");
        } else if (num2>num1) {
            System.out.println("Second Number is greater than First Number");
        }else {
            System.out.println("Both are equal");

    }

    }
}
