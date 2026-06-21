public class pattern3 {
    public void result(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3 res = new pattern3();
        res.result(5);
    }
}
