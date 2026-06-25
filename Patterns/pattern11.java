public class pattern11 {
    public void result(int n){
        for(int i=0;i<n;i++){
            int b=0;
            if(i%2==0) b=1;

            for(int j=0;j<=i;j++){
                System.out.print(b);
                b = 1 - b;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern11 res = new pattern11();
        res.result(4);
    }
}
