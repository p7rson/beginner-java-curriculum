public class LogicalOperators {
    public static void main(String[] args) {
        int temperature = 75;
        String isSunny = "yes";

        if (temperature >= 80 && isSunny.equals("yes")) {  // AND: both conditions must be true
            System.out.println("It is a gread day for a picnic.");
        } else {
            System.out.println("It may not be a good day for a picnic.");
        }

        // || - OR: at least one condition must be true.
        String hasCar = "no";
        String hasBike = "yes";

        if (hasCar.equals("yes") || hasBike.equals("yes")) {
            System.out.println("You have a way to get to school.");
        } else {
            System.out.println("You do not have a way to get to school.");
        }
        
        // NOT: reverses the result of the condition
        String homeworkDone = "yes";
        if (!(homeworkDone.equals("yes"))) {
            System.out.println("Please do your homework.");
        } else {
            System.out.println("Your homework is already done.");
        }
    }
}