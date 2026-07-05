public class ReverseArray {
    public static int[] rev(int arr[]){
        int l = 0;
        int r = arr.length-1;

        while(r>l){
            int temp = arr[l] ;
            arr[l] = arr[r] ;
            arr[r] = temp ;

            l++;
            r--;
        }

        return arr;
    };

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ReverseArray.rev(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
