package midweekhomwork;

import java.util.Scanner;

/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print
        percentage of class attended
Is student is allowed to sit in exam or not.  */
public class ExamStudent {
    public static void main(String[] arg){

        float perc;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Classes held :");
        int classes = in.nextInt();
        System.out.println("Enter the Number of Classes attended :");
        int heldclass = in.nextInt();
       perc =((heldclass*100)/classes);
        System.out.println(perc);
        if (perc>=75)
            System.out.println("Student is allowed to sit in exam with:" +perc +"% attendence");
        else
            System.out.println("Student is not allowed to sit in exam with :" +perc +"% attendence");
    }

}
