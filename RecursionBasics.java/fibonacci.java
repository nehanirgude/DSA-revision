public class fibonacci {

    public static int fib(int n){
        if(n==0|| n==1){
            return n;
        }

        int fn1=fib(n-1);
        int fn2=fib(n-2);
        int fibnum=fn1+fn2;
        return fibnum;
    }

    public static void main(String args[]){
        int n=25;

        System.out.println(fib(n));
    }
    
}
