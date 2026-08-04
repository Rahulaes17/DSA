package Arrays;

public class rotatedSort {
    boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean sort = true;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    sort = false;
                    break;
                }
            }
            if (sort) {
                for (int j = 0; j < i - 2; j++) {
                    if (nums[j] > nums[j + 1]) {
                        sort = false;
                        break;
                    }
                }
            }

            if (sort && i != 0 && nums[nums.length - 1] > nums[0]) {
                sort = false;
            }

            if (sort) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3 };
        rotatedSort res = new rotatedSort();
        System.out.println(res.isSorted(arr));
    }
}
