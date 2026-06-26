package Mathss;

public class reverse {
    public int rev(int n){
        int revNum=0;
        while(n>0){
            int ld = n%10;
            revNum= (revNum*10) + ld;
            n = n/10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        reverse r = new reverse();
        System.out.println(r.rev(123456789));
    }
}
