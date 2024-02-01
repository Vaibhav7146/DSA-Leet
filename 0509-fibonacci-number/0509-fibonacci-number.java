class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int fno = fib(n-1);
        int sno = fib(n-2);
        return fno+sno;
    }
}