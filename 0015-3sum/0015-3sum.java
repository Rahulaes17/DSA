class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> unique = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int needed = -(nums[i] + nums[j]);
                if(set.contains(needed)){
                    List<Integer> triplet = new ArrayList (Arrays.asList(nums[i],nums[j],needed));

                    Collections.sort(triplet);
                    unique.add(triplet);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(unique);
    }
}