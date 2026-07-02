class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int less1 = fib(n-1);
        int less2 = fib(n-2);
        return less1 + less2;
    }
}