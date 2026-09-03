class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            check.put(nums[i],i);
            }
            for(int j=1; j<=nums.length;j++){
                if(!check.containsKey(j)){
                 missing.add(j);
                }
            }
            return missing;
        }
    }