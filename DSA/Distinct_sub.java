package DSA401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distinct_sub {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        if(nums == null) {
            return result;
        }
        Arrays.sort(nums);
        helper(nums, 0, result, new ArrayList<Integer> ());
        return result;
    }

    public static void helper(int[] nums, int index, List<List<Integer>> result, List<Integer> subset) {
        if(index <= nums.length) {
            result.add(new ArrayList<>(subset));
        }
        for(int i = index; i < nums.length; i++) {
            if(i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            helper(nums, i + 1, result, subset);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
       int[] ar= {1,2,3};
        List<List<Integer>> ls= subsetsWithDup(ar);
        System.out.println(ls);
    }
}
