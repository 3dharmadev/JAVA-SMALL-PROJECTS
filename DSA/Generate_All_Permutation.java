package DSA401;

public class Generate_All_Permutation {
    public static void main(String[] args) {
        Generate_All_Permutation gp=new Generate_All_Permutation();
        gp.permute("123",0,3);
    }
    /* 1 2 3
1 3 2
2 1 3
2 3 1
3 1 2
3 2 1
*/

    private void permute(String str, int index, int r)
    {
        if (index == r)
            System.out.println(str);
        else {
            for (int i = index; i < r; i++) {
                str = swap(str, index, i);
                permute(str, index + 1, r);
                str = swap(str, index, i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
