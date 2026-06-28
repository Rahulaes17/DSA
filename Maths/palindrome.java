package Mathss;

public class palindrome {
    public void drome(int n){
        int rev=0;
        int num=n;
        while(n>0){
            int ld = n% 10;
            rev = (rev *10) + ld;
            n=n/10;
        }

        if(rev== num) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.drome(122221);
    }
}