import java.util.*;

class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        if (nums.length != max + 1) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i < max; i++) {
            if (map.getOrDefault(i, 0) != 1) {
                return false;
            }
        }

        return map.getOrDefault(max, 0) == 2;
    }
}