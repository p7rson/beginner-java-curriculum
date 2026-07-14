public class Casting {
    public static void main(String[] args) {
        double decimalNum = 9.99;
        int truncatedNum = (int) decimalNum;
        System.out.println(truncatedNum);

        int wholeNum = 7;
        double decimalValue = (double) wholeNum;

        String numString = "42";
        int numValue = Integer.parseInt(numString);
        System.out.println(numValue + 1);

        String decimalString = "3.14";
        double piValue = Double.parseDouble(decimalString);  // Convert String to double
        System.out.println(piValue + 4.12);

        int num = 100;
        String text = String.valueOf(num);
        System.out.println(num);
    }
}