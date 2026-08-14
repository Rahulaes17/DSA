import java.util.*;

/*class ArrayUnion {
    public List<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int i = 0; i < n; i++)
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        for (int i = 0; i < m; i++)
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        List<Integer> Union = new ArrayList<>();
        for (int key : freq.keySet())
            Union.add(key);
        return Union;
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayUnion obj = new ArrayUnion();
        List<Integer> Union = obj.FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
} */

    import java.util.*;

class Solution {
    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> st = new TreeSet<>();
        for (int num : arr1) {
            st.add(num);
        }
        for (int num : arr2) {
            st.add(num);
        }
        return new ArrayList<>(st);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        Solution obj = new Solution();
        List<Integer> result = obj.findUnion(arr1, arr2);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

