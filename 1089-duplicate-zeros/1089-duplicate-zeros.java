class Solution {
    public void duplicateZeros(int[] arr) {
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        int index = arr.length+zero-1;
        for(int j = arr.length-1; j>=0; j--){
            if( index< arr.length){
                arr[index] = arr[j];
            }
            index--;

            if(arr[j] == 0){
                if(index<arr.length){
                    arr[index] = 0;
                }
                index--;
            }
        }
    }
}