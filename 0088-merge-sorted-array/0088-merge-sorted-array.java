class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Check = m - 1;    
        int num2Check = n - 1;       
        int finalA = m + n - 1;  

        while (num1Check >= 0 && num2Check >= 0) {
            if (nums1[num1Check] > nums2[num2Check]) {
                nums1[finalA] = nums1[num1Check];
                num1Check--;
            } else {
                nums1[finalA] = nums2[num2Check];
                num2Check--;
            }
            finalA--;
        }

        while (num2Check >= 0) {
            nums1[finalA] = nums2[num2Check];
            num2Check--;
            finalA--;
        }
    }
}