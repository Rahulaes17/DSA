import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] arr, int n) {

        for(int i = 0; i < n - 1; i++) {

            int min = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        SelectionSort sorted = new SelectionSort();

        int[] arr = {10,18,22,30,14,66,54,75};

        int[] result = sorted.sort(arr, arr.length);

        System.out.println(Arrays.toString(result));
    }
}