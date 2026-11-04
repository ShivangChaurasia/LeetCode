
import java.util.*;

class Solution {

    class SlidingMedian {
        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        int leftSize = 0, rightSize = 0;
        long leftSum = 0, rightSum = 0;

        void add(int val) {
            if (left.isEmpty() || val <= left.lastKey()) {
                left.merge(val, 1, Integer::sum);
                leftSize++;
                leftSum += val;
            } else {
                right.merge(val, 1, Integer::sum);
                rightSize++;
                rightSum += val;
            }
            balance();
        }

        void remove(int val) {
            if (left.containsKey(val)) {
                removeValue(left, val);
                leftSize--;
                leftSum -= val;
            } else {
                removeValue(right, val);
                rightSize--;
                rightSum -= val;
            }
            balance();
        }

        void balance() {
            while (leftSize > rightSize + 1) {
                int val = left.lastKey();

                removeValue(left, val);
                leftSize--;
                leftSum -= val;

                right.merge(val, 1, Integer::sum);
                rightSize++;
                rightSum += val;
            }

            while (leftSize < rightSize) {
                int val = right.firstKey();

                removeValue(right, val);
                rightSize--;
                rightSum -= val;

                left.merge(val, 1, Integer::sum);
                leftSize++;
                leftSum += val;
            }
        }

        void removeValue(TreeMap<Integer, Integer> map, int val) {
            int count = map.get(val);

            if (count == 1) {
                map.remove(val);
            } else {
                map.put(val, count - 1);
            }
        }

        long getCost() {
            long median = left.lastKey();

            return median * leftSize - leftSum
                 + rightSum - median * rightSize;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        // Step 1: Calculate cost of every window
        long[] cost = new long[n - x + 1];

        SlidingMedian sm = new SlidingMedian();

        for (int i = 0; i < x; i++) {
            sm.add(nums[i]);
        }

        for (int i = 0; i <= n - x; i++) {

            cost[i] = sm.getCost();

            if (i + x < n) {
                sm.remove(nums[i]);
                sm.add(nums[i + x]);
            }
        }

        // Step 2: Dynamic Programming
        long INF = Long.MAX_VALUE / 4;

        long[] prev = new long[n + 1];
        long[] curr = new long[n + 1];

        // prev represents selecting 0 windows.
        // Minimum cost is 0 for every prefix.

        for (int j = 1; j <= k; j++) {

            Arrays.fill(curr, INF);

            for (int i = 1; i <= n; i++) {

                // Don't select a window ending at i
                curr[i] = curr[i - 1];

                // Select a window [i-x, i-1]
                if (i >= x && prev[i - x] != INF) {

                    curr[i] = Math.min(
                        curr[i],
                        prev[i - x] + cost[i - x]
                    );
                }
            }

            long[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}
