public class EnhancedComparisonDistance {

    public static int enhancedComparisonDistance(String[] strArr) {
        // Check if the array is not empty and both strings have equal length
        if (strArr.length != 2 || strArr[0].length() != strArr[1].length()) {
            throw new IllegalArgumentException("Input strings must be of equal length");
        }

        String str1 = strArr[0];
        String str2 = strArr[1];

        int distance = 0;

        // Iterate through the characters of both strings and calculate the distance
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Ensure characters are lowercase alphabet characters or numbers
            if ((char1 >= 'a' && char1 <= 'z' || (char1 >= '0' && char1 <= '9')) &&
                (char2 >= 'a' && char2 <= 'z' || (char2 >= '0' && char2 <= '9'))) {
                
                // Calculate the absolute difference in ASCII values
                distance += Math.abs(char1 - char2);
            } else {
                throw new IllegalArgumentException("Input strings must contain only lowercase alphabet characters and numbers");
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        String[] input1 = {"10011", "10100"};
        String[] input2 = {"helloworld", "worldhello"};

        System.out.println(enhancedComparisonDistance(input1)); // Output: 3
        System.out.println(enhancedComparisonDistance(input2)); // Output: 8
    }
}
