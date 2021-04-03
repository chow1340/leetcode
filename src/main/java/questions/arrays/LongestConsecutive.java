package questions.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(Integer[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            //Go to lowest number
            if(!set.contains(nums[i] - 1)) {
                int current = 1;
                int n = nums[i];

                //Start going up
                while(set.contains(n + 1)) {
                    current++;
                    n++;
                }
                max = Math.max(max, current);
            }
        }

        return max;
    }
}
