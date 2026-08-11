package Arrays;

public class zeroEnd {

    public int[] moveZeroes(int[] arr) {
    
        int[] temp = new int[arr.length];

       
        int index = 0;

      
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }




public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        zeroEnd sol = new zeroEnd();

        int[] result = sol.moveZeroes(arr);

        System.out.print("Array after moving zeroes: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
}

