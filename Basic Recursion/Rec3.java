public class Rec3 {
    public void result(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        result(n-1);
    };
    public static void main(String[] args) {
        Rec3 res = new Rec3();
        res.result(15);
    }
}
