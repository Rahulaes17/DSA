public class Rec1{
    public void result(String name , int count, int n){
        if(count==n){
            return;
        };

        System.out.println(name);
        result(name, count + 1, n);
    };

    public static void main(String[] args) {
        Rec1 res = new Rec1();
        res.result("Rahul", 0 , 7);
    }
}