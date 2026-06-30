public class Rec2 {
    public void result(int n, int num){
        if(num > n){
            return;
        }
        System.out.println(num);
        result(n, num+1);
    };

    public static void main(String[] args) {
        Rec2 res = new Rec2();
        res.result(15,1);
    }
}
