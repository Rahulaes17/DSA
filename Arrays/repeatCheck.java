/* class Solution {
    public int getSingleElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    count++;
            }

            if (count == 1) return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        Solution obj = new Solution();
        int ans = obj.getSingleElement(arr);

        System.out.println("The single element is: " + ans);
    }
}  */


//Optimal approach 

class Solution {
    public int getSingleElement(int[] arr) {
        int xorr = 0;
        for (int num : arr) {
            xorr ^= num;
        }
        return xorr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        Solution obj = new Solution();
        int ans = obj.getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}
