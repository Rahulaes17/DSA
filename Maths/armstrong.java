
public class armstrong {
    public void arm(int n){
        int sum = 0;
        int num = n;
        while(n>0){
            int ld = n% 10;
            sum = sum + (ld*ld*ld);
            n = n/10;
        }

        if(num == sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }

    public static void main(String[] args) {
        armstrong a =  new armstrong();
        a.arm(371);
    }
}
