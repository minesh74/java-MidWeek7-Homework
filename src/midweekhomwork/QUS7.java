package midweekhomwork;

import java.util.Scanner;
            /*Take input of age of 3 people by user and determine oldest and youngest among
             them.  */
public class QUS7 {
    public static void main(String[] args){
        int age1,age2,age3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter age of First Person :");
        age1=sc.nextInt();
        System.out.println("Enter age of Second Person :");
        age2=sc.nextInt();
        System.out.println("Enter age of Third Person :");
        age3=sc.nextInt();

        if ((age1>age2) && (age1>age3)){
            System.out.println("First Person is Oldest");
        } else if ((age2>age1) && (age2>age3)){
            System.out.println("Second Person is Oldest");
        }  else if ((age3>age1) && (age3>age2)){
            System.out.println("Third Person is Oldest");
        } else {
            System.out.println("All Person is Equal");
        }

    }
}
