class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            
            // If this number's count just crossed the halfway mark, we found it!
            if (m.get(nums[i]) > n / 2) {
                return nums[i];
            }
        }
        return -1; // Should never be reached based on problem constraints
    }
}