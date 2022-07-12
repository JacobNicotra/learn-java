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

        // String question = "What is 5 + 5? ";
        // String ans1 = "11";
        // String ans2 = "10";
        // String ans3 = "6";
        // String correctAns = ans2;

        // System.out.println(question);
        // System.out.println("Here are possible answers: " + ans1 + ", " + ans2 + ", "
        // + ans3);
        // Scanner input = new Scanner(System.in);
        // String userAns = input.next();

        // if (correctAns.equals(userAns)) {

        // System.out.println("You answered correctly!");
        // } else {
        // System.out.println("You answered incorrectly. The answer was " + ans2);
        // }
        // note: can use string.toLowerCase() for case insensitivity

        // * Debugging:

        // System.out.println("find are ");
        // can use debugger or print statements, same as js...

        // * Functions:
        // we can write this outside the main function and then call this function
        // inside the main function
        // note: dont need to define this function above main function...
        // The main function is always called at execution...
        // announceDeveloperTeaTime();
        double grouptTotalMealPrice = calcTotalMealPrice(115, .2, .08);
        System.out.println(grouptTotalMealPrice);

        double individualMealPrice = grouptTotalMealPrice / 5;
        System.out.println(individualMealPrice);

        // Test my salary calc:
        double salary = calcSalary(2080, 58, 14);
        System.out.println("annual sal is " + salary);


        // Now doing classes, creating triangle class

        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleb = new Triangle(3, 2.598, 3, 3, 3);
        System.out.println("triangleA " + triangleA + " " + triangleA.base + " " + triangleA.height);
        System.out.println("triangleA methdod " + triangleA.findArea());

        System.out.println("a triangle has this many sides: " + Triangle.numOfSides);
    }

    public static void announceDeveloperTeaTime() {
        System.out.println("waiting for dev tea time");
        System.out.println("type a random word and press enter to start dev tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("it is now dev teatime");
    }

    public static double calcTotalMealPrice(double price, double tipRate, double taxRate) {
        double tip = taxRate * price;
        double tax = taxRate * price;
        double res = price + tip + tax;
        // System.out.println("your total meazl price is " + res);
        return res;
    }

    // *-> return types: double, int, char, string, boolean, void
    // * --> --> "public static void" means it will return nothing

    // * Built-in functions:
    // * -> an example of this is System.out.println
    // -> also have operations on data types like .equals()
    double oneTwentyFive = Math.pow(5, 3);

    // Challenge: cerate salary calculator
    public static double calcSalary(double hoursWorked, double payRate, double unpaidVacationDays) {
        return (hoursWorked - unpaidVacationDays * 8) * payRate;
    }

    // * Classes
    // -> classes must be in new file

    // using Triangle class in the Triangle file....

}
// print