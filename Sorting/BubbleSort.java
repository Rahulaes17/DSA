
public class BubbleSort{
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,2,4,78,23,65,34,53};
        sort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}