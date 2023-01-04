package midweekhomwork;
        /*Write a program to print the sum of two numbers entered by user by defining your
        own method. */

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        num2 = sc.nextInt();
        int sum =num1 + num2;
        System.out.println("The Sum of two number entered is :" +sum);
    }
}
