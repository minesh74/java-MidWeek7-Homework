package midweekhomwork;

import java.util.Scanner;

/*A school has following rules for grading system:
        a. Below 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
        Ask user to enter marks and print the corresponding grade.  */
public class GradeMarks {
    public static void main(String[] args) {
        int mark;
        Scanner in = new Scanner(System.in);
        mark = in.nextInt();
        System.out.println(" Enter  Marks :" + mark);
        String grade = "";
        if (mark >= 0 && mark < 25) {
            grade = "F+";
        } else if (mark > 25 && mark < 45) {
            grade = "E";
        } else if (mark >= 45 && mark < 50) {
            grade = "D";
        } else if (mark >= 50 && mark < 60) {
            grade = "C";
        } else if (mark >= 60 && mark < 80) {
            grade = "B";
        } else if (mark >= 80 && mark <= 100) {
            grade = "A";
        }
        System.out.println("Grade :   "+grade);
    }
}