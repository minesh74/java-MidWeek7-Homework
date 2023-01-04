package midweekhomwork;

import java.util.Scanner;
       /*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print
        percentage of class attended
        Is student is allowed to sit in exam or not.
         Modify the above question to allow student to sit if he/she has medical cause. Ask
        user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.  */
public class MedicalStudent {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Classes held :");
        float Class = sc.nextFloat();
        System.out.println("Enter the Number of Classes attended :");
        float Classheld = sc.nextFloat();
        System.out.println("Did Student have any medical cause\"true or false?");
        boolean medical = sc.nextBoolean();

        if (medical && (Class/Classheld*100>75)){
            System.out.println("You are allowed to sit in the exam with "+Classheld*100/Class+"% attendence");
        }
        else {
            System.out.println("You are not allowed to sit in the exam with "+Classheld*100/Class +"% attendence");
        }
    }
}