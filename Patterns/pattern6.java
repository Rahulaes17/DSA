public class pattern6 {
    public void result(int n ){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern6 res = new pattern6();
        res.result(5);
    }
}


//Striver's Solution
/*public class pattern6 {
    public void result(int n ){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern6 res = new pattern6();
        res.result(5);
    }
}*/