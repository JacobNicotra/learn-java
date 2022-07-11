import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hello world from vs code IDE");
        // Primitive types include: Boolean, int, double (float; decimal number), char
        // (single character)
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'J';
        char sutdentLastInitial = 'N';
        boolean hasPerfectAttendance = true;

        // System.out.println(studentAge);
        // System.out.println(studentGPA);
        // System.out.println(studentFirstInitial);
        // System.out.println(sutdentLastInitial);
        // System.out.println(hasPerfectAttendance);

        // Reference types include: strings; string is built out of chars, so it is not
        // primitive.
        String studentFirstName = "Jacob";
        String studentLastName = "Nicotra";
        // System.out.println(studentFirstName);
        // System.out.println(studentLastName);

        // String operateors: charAt (input index -> char at that index)
        char studentFirstInitialFromCharAt = studentFirstName.charAt(0);
        char studentlastInitialFromCharAt = studentLastName.charAt(0);
        // System.out.println(studentFirstInitialFromCharAt);
        // System.out.println(studentlastInitialFromCharAt);

        // concatonating strings
        // System.out.println(studentFirstName + ' ' + studentLastName + " has a GPA of
        // " + studentGPA);
        // System.out.println("what dod you want to update it to?");

        // user input
        // Scanner input = new Scanner(System.in);
        // studentGPA = input.nextDouble();
        // System.out.println(studentFirstName + ' ' + studentLastName + "now has a GPA
        // of " + studentGPA);

        // Until this point we've just learned how to store and access dta in Java, will
        // now learn control flow, then debugging and functions.
        // e.g. conditionals and loops
        // * If Statement: lets make a fortune teller program to learn this...
        // System.out.println("pick a number between 1 and 10");
        // Scanner numInput = new Scanner(System.in);
        // int inputtedNum = numInput.nextInt();

        // if (inputtedNum < 5) {
        // System.out.println("Enjoy the good luck a friend brings you.");
        // } else {
        // System.out.println("Your shoe selection will make you happy today.");
        // }

        // // * While Loop: create music player to learn this...
        // Scanner musicInput = new Scanner(System.in);
        // boolean isOnRepeat = true;

        // while (isOnRepeat) {
        // System.out.print("playing current song...");
        // System.out.println("would you like to take this some off of repeat?");
        // String turnOffRepeatInput = musicInput.next();

        // if (turnOffRepeatInput.equals("yes")) {
        // isOnRepeat = false;
        // }
        // }

        String question = "What is 5 + 5? ";
        String ans1 = "11";
        String ans2 = "10";
        String ans3 = "6";
        String correctAns = ans2;

        System.out.println(question);
        System.out.println("Here are possible answers: " + ans1 + ans2 + ans3);
        Scanner input = new Scanner(System.in);
        String userAns = input.next();

        if (userAns.equals("10")) {

            System.out.println("You answered correctly!");
        } else {
            System.out.println("You answered incorrectly. The answer was " + ans2);
        }

    }
}
