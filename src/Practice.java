import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        return -1;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.


    // Find the difference between the largest and smallest integer in HashSet
    // o(n)
    public static int largestMinusSmallest(Set<Integer> nums){
        int smallest = Integer.MIN_VALUE;
        int largest = Integer.MAX_VALUE;;
    // Set<Integer> nums = new HashSet<>();
    for (int num : nums) {
        if (num > largest) {
            largest = num;
            }
        }
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }
      return largest - smallest; 
    
    }
    public static int largestWordCount(String[] words, char test){
 // Find the longest word that starts with a specific character letter in array
 // o(n)
        int count = 0;
        for (String word : words) {
                if (!word.isEmpty() && word.charAt(0) == test) {   
                
            if (word.length() > count) { 
                count = word.length();
                }
            }
        }
        return count;
    }
    

    // Count how many words are longer than n characters and shorter than m characters in arraylist

    public static void counterLargest(List<String> words, int n, int m){
        int nCounter = 0;
        int mCounter = 0;

        for (String word : words) {
            if (n < word.length()){
                nCounter++;
            }
            else if (m > word.length()) {
                mCounter++;
            }
        }
        // Count how many words are longer than n characters and shorter than m characters in arraylist

    public static void counterLargest(List<String> words, int n, int m){
        int nCounter = 0;
        int mCounter = 0;

        for (String word : words) {
            if (word.length() > n){
                nCounter++;
            }
            if (word.length() < m) {
                mCounter++;
            }
        }
        return "N Count: " + nCounter + " " + "M Count: " + mCounter;
        }
    }


   











}
