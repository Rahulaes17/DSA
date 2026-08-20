class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];
        int left = 0, right = nums.length-1, pos = squared.length-1;
        while(left<=right){
            if(nums[left]*nums[left]>nums[right]* nums[right]){
                squared[pos] = nums[left]*nums[left];
                left++;
            }
            else{
                squared[pos] = nums[right]* nums[right];
                right--;
                
            }
            pos--;
        }
        return squared;
    }
}