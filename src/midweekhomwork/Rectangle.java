package midweekhomwork;
  //Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class Rectangle {
    public static void main (String [] args){
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Length :");
        a=sc.nextInt();
        System.out.println("Enter the Breadth :");
        b=sc.nextInt();
        if ((a==b)) {
            System.out.println("It is a Square");
        }else{
            System.out.println("It's not a Square");
        }

        }




}
