//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

import java.util.Random;

public class ArrayShuffle {
	 public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(originalArray);

	        System.out.print("Shuffled Array: ");
	        for (int num : originalArray) {
	            System.out.print(num + " ");
	        }
	    }

	    // Fisher-Yates shuffle algorithm
	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random rand = new Random();

	        for (int i = n - 1; i > 0; i--) {
	            // Generate a random index between 0 and i (inclusive)
	            int j = rand.nextInt(i + 1);

	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
}
