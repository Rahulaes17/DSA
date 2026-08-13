
public class checkDuplicate {
    public int duplicateCheck(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[index] != arr[i]){
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1 ;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4,5,5,5,5,6};
        checkDuplicate res = new checkDuplicate();
        int k = res.duplicateCheck(arr);
        System.out.println("No. of unique elements = " + k);
        
    }
}
