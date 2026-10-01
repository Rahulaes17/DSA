class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        
        Integer[] boxedArr1 = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            boxedArr1[i] = arr1[i];
        }
        
        Arrays.sort(boxedArr1, (a, b) -> {
            boolean hasA = map.containsKey(a);
            boolean hasB = map.containsKey(b);
            
            if (hasA && hasB) {
                return map.get(a) - map.get(b);
            } else if (hasA) {
                return -1;
            } else if (hasB) {
                return 1;
            } else {
                return a - b;
            }
        });
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = boxedArr1[i];
        }
        
        return arr1;
    }
}