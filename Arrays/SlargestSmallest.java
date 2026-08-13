
public class SlargestSmallest {
    public static int[] second(int[] arr){
        int largest = Integer.MIN_VALUE ;
        int large = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE;
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                large = largest;
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                small = smallest;
                smallest = arr[i];
            }
            else if(arr[i]< small && arr[i]!= smallest){
                small = arr[i];
            }

        }
        return new int[]{large , small};
    }
    
    public static void main(String[] args) {
        int[] arr = {11,2,3,23,12,54,65,23,14,42};
        int[] ans = second(arr);

        System.out.println("Second largest number is:" + ans[0]);
        System.out.println("Second smallest number is:" + ans[1]);
    }
}