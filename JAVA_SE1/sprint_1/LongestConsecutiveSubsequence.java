import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSubsequence {

    public static Tuple longestConsecutiveSubsequence(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            return new Tuple(0, new ArrayList<>());
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        int longestLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int longestStartIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                // Current element is part of the consecutive subsequence
                currentLength++;
            } else if (arr[i] != arr[i - 1]) {
                // Break in consecutive sequence, update the length and starting index
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStartIndex = startIndex;
                }
                currentLength = 1;
                startIndex = i;
            }
        }

        // Check if the last subsequence is the longest
        if (currentLength > longestLength) {
            longestStartIndex = startIndex;
        }

        // Create the actual subsequence list
        List<Integer> longestSubsequence = new ArrayList<>();
        for (int i = longestStartIndex; i < longestStartIndex + longestLength; i++) {
            longestSubsequence.add(arr[i]);
        }

        return new Tuple(longestLength, longestSubsequence);
    }

    public static void main(String[] args) {
        int[] input1 = {6, 7, 3, 1, 100, 102, 6, 12};
        int[] input2 = {5, 6, 1, 2, 8, 9, 7};
        int[] input3 = {4, 2, 8, 1, 3, 6, 100, 9};

        System.out.println(longestConsecutiveSubsequence(input1));
        System.out.println(longestConsecutiveSubsequence(input2));
        System.out.println(longestConsecutiveSubsequence(input3));
    }
}

class Tuple {
    int length;
    List<Integer> subsequence;

    public Tuple(int length, List<Integer> subsequence) {
        this.length = length;
        this.subsequence = subsequence;
    }

    @Override
    public String toString() {
        return "(" + length + ", " + subsequence + ")";
    }
}
