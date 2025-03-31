import java.util.Scanner;
public class MarksCheck {

    public static int grade(int marks){

        System.out.println("Your marks is: " + marks);

        if(marks >= 75){
            System.out.println("You got an 'A'");
        } else if (marks >= 65) {
            System.out.println("You got a 'B'");
        } else if (marks >= 50) {
            System.out.println("You got a 'C'");
        } else if (marks >= 35) {
            System.out.println("You got a 'S'");
        } else {
            System.out.println("You got a 'W'");
        }
        return marks;
    }

    public static void main(String[] args){
        MarksCheck marksCheck = new MarksCheck();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your marks: ");
        int marks = scanner.nextInt();

        scanner.close();
        marksCheck.grade(marks);
    }
}
