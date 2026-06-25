public class pattern13 {
    public void result(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern13 res = new pattern13();
        res.result(5);
    }
}
