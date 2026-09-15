class Solution {
    public int maxArea(int[] height) {
        int end= height.length-1;
        int start = 0;
        int maxProduct = 0;
        while(start<end){
            int base = end- start;
          if(base * Math.min(height[start], height[end])> maxProduct){
            maxProduct = base * Math.min(height[start], height[end]);
          }
          if(height[start]> height[end]){
            end--;
          }
          else{
            start++;
          }
            
        }
        return maxProduct;
    }
}