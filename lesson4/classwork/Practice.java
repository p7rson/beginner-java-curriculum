import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        // Problem 1
        // Create an array of 4 cars.
        // Print the first car and the last car.
        
        String[] cars = {"toyota", "honda", "bmw", "tesla"};
        System.out.println(cars[0]);
        System.out.println(cars[3]);

        // Problem 2
        // Create an array of 5 numbers.
        // Print the number at index 2.

        int[] nums = {13, 26, 39, 52, 65};
        System.out.println(nums[2]);

        // Problem 3
        // Create an array of 3 cities.
        // Print the length of the array.

        String[] cities = {"Seattle", "Bellevue", "Redmond"};
        System.out.println(cities.length);

        // Problem 4
        // Create an array of 6 file extensions.
        // Print a random one.

        String[] extensions = {"pdf", "docx", "xlsx", "mp4", "jpg"};
        int randIndex = (int) (math.random() * extensions.length);
        System.out.println(extensions[randIndex]);

        // Problem 5
        // Create an array of 5 animals.
        // Use a for loop to print each animal.

        String[] animals = {"cat", "dog", "tiger", "lion", "panda"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}