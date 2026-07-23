
 class Digits {
    public void digit(int n){
        int count=0;
        while(n>0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        Digits d = new Digits();
        d.digit(4567);
    }

}
