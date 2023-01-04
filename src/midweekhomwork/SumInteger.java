package midweekhomwork;
   /*Take 10 integers from keyboard using loop and print their average value on the
        screen.Take 10 integers from keyboard using loop and print their average value on the
        screen. */
import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args){
        int a=1;
        int sum =0,num;
        float avg;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number :");
        while (a<=10){
            sum = sum+ sc.nextInt();
            a++;

        }
        avg=sum/10;
        System.out.println(" AVERAGE IS :" +avg);
    }

}
