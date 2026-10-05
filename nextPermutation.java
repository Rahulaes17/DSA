import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    private void generatePermutations(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> permutations) {
        int n = nums.length;
        if (current.size() == n) {
            permutations.add(new ArrayList<>(current));
            return;
        }
        for (int index = 0; index < n; index++) {
            if (used[index]) {
                continue;
            }
            used[index] = true;
            current.add(nums[index]);
            generatePermutations(nums, current, used, permutations);
            current.remove(current.size() - 1);
            used[index] = false;
        }
    }

    private int compareLists(List<Integer> first, List<Integer> second) {
        int n = first.size();
        for (int index = 0; index < n; index++) {
            if (!first.get(index).equals(second.get(index))) {
                return first.get(index) - second.get(index);
            }
        }
        return 0;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }
        List<Integer> original = new ArrayList<>();
        for (int value : nums) {
            original.add(value);
        }
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(nums, new ArrayList<>(), new boolean[n], permutations);
        Collections.sort(permutations, this::compareLists);
        for (List<Integer> permutation : permutations) {
            if (compareLists(permutation, original) > 0) {
                for (int index = 0; index < n; index++) {
                    nums[index] = permutation.get(index);
                }
                return;
            }
        }
        List<Integer> smallest = permutations.get(0);
        for (int index = 0; index < n; index++) {
            nums[index] = smallest.get(index);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        Solution sol = new Solution();
        sol.nextPermutation(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
}
