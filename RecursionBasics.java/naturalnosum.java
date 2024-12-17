public class naturalnosum {

    public static int sum(int n){
        if(n==0){
            return n;
        }
        int Snmn=sum(n-1);
        int Sn=n+Snmn;
        return Sn;
    }

    public static void main(String args[]){
        int n=10;
        System.err.println(sum(n));
    }
    
}
