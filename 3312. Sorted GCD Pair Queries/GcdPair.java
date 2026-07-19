
import java.util.Arrays;

class Solution {
    public int gcd(int a , int b){
        while(a>0 && b>0){
            if(a>b){
                a= a % b;
            }
            else{
                 b = b % a;
            }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }

    public int[] gcdValues(int[] arr, long[] queries) {
        int[] gcdPair = new int[(arr.length*(arr.length-1)) / 2];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                gcdPair[index] = gcd(arr[i],arr[j]);
                index++;
            }
        }
       Arrays.sort(gcdPair);

        int[] answer = new int[queries.length];
        for(int z =0; z<queries.length;z++){
            answer[z] = gcdPair[(int) queries[z]];
        }
        return answer;
    }

    
}