public class Practice {
    public static void main(String[] args) {
        // Problem 1
        // Create a variable for height in centimeters.
        // Print "Tall" if the height is greater than 170, otherwise print "Short".
        int height = 175;

        if (height > 170) {
            System.out.println("Tall");
        } else {
            System.out.println("Short");
        }

        // Problem 2
        // Create a variable for age.
        // If they are 18 or older, print "Adult", else print "Minor".
        int age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // Problem 3
        // Create a variable for a number.
        // Print "Fizz" if it is divisible by 3, "Buzz" if divisible by 5,
        // print "FizzBuzz" if divisible by both 3 and 5,
        // otherwise print the number itself.
        int number = 15;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }


        // Problem 4
        // Create a variable for a password.
        // If the password is "sova" or "coding", print "Access granted".
        // Otherwise print "Access denied".
        String password = "sova";

        if (password.equals("sova") || password.equals("coding")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Problem 5
        // Create a variable for a test score (0-100).
        // Print the grade based on score:
        //   90 and above: "A"
        //   80 to 89: "B"
        //   70 to 79: "C"
        //   60 to 69: "D"
        //   below 60: "F"
        // Use nested if or else if statements.
        int score = 85;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
