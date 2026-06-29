public class gcd{
    public int result(int n1,int n2){
        int a = Math.abs(n1);
        int b = Math.abs(n2);

        while(a>0 && b>0){
            if(a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        };
        if(a==0) return b;
        else return a;
    };

    public static void main(String[] args) {
        gcd res = new gcd();
        int gcd = res.result(18, 42);
        System.out.println("The GCD is " + gcd);
    }
}