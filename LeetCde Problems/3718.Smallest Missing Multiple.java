import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Step 1: Store all numbers in a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Start checking multiples of k
        int multiple = k;
        while (true) {
            if (!set.contains(multiple)) {
                return multiple; // Found the missing multiple
            }
            multiple += k; // Move to next multiple
        }
    }
}
