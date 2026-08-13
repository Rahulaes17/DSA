
public class sortCheck {
    boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = {32,43,23,54,43,23};
        sortCheck res = new sortCheck();
        System.out.println(res.isSorted(arr));
    }

}