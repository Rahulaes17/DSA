class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0, end = nums.length-1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                arr[index] = nums[i];
                index++;
            }
            else{
                arr[end] = nums[i];
                end--;
            }
        }
        return arr;
    }
}