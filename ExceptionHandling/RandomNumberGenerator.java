import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random random = new Random();
        
        // Generate a random number between 1 and 15
        int randomNumber = random.nextInt(15) + 1;
        
        // Print the generated random number
        System.out.println("Random number between 1 and 15: " + randomNumber);
    }
}
