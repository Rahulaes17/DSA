     //My Method
// public class pattern10 {
//     public void result1(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("* ");
//             };
//             System.out.println();
//         }
//     }

//     public void result2(int n){
//         for(int i=0;i<n-1;i++){
//             for(int j=n-1;j>i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         pattern10 res = new pattern10();
//         res.result1(3);
//         res.result2(3);
//     }
// }


//Optimal method

public class pattern10 {
    public void result1(int n){
        for(int i=1;i<2*n-1;i++){
            int stars=i;
            if(i>n) stars= 2*n-i;

            for(int j=1;j<stars;j++){
                System.out.print("* ");
            };
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern10 res = new pattern10();
        res.result1(5);

    }
}

