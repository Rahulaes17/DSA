class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> duplicate = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(duplicate.containsKey(nums[i])){
                return true;
            }
            else{
                duplicate.put(nums[i],i);
            }
        }
        return false;
    }
}