class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int x : nums1) count.put(x, count.getOrDefault(x, 0) + 1);
        for (int x : nums2) count.put(x, count.getOrDefault(x, 0) + 1);

        for (int v : count.values()) {
            if (v % 2 != 0) return -1;
        }

        HashMap<Integer, Integer> freq1 = new HashMap<>();
        HashMap<Integer, Integer> freq2 = new HashMap<>();

        for (int x : nums1) freq1.put(x, freq1.getOrDefault(x, 0) + 1);
        for (int x : nums2) freq2.put(x, freq2.getOrDefault(x, 0) + 1);

        int swaps = 0;

        for (int key : count.keySet()) {
            int c1 = freq1.getOrDefault(key, 0);
            int c2 = freq2.getOrDefault(key, 0);

            swaps += Math.abs(c1 - c2) / 2;
        }

        return swaps / 2;
    }
}