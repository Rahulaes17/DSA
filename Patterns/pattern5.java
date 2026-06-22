public class pattern5 {
    public void result(int n){
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5 res = new pattern5();
        res.result(5);
    }
}