class Pattern2{
    public void result(int n){
        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 res = new Pattern2();
        res.result(5);
    }
}
