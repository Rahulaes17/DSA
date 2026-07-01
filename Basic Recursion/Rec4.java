public class Rec4 {
    public static int result(int n){
        if(n==0){
            return 0;
        }
    
        return n + result(n-1);
        
    };

    public static void main(String[] args) {
       System.out.println(Rec4.result(5));
    }
}
