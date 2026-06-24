class Pattern8 {
    public void result(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            };

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            };

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            };
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern8 res = new Pattern8();
        res.result(5);
    }
}

