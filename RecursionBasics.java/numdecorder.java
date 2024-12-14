public class numdecorder {
    public static void numDec(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.print(num+" ");
        numDec(num-1);
    }

    public static void main(String args[]){
        int num=10;
        numDec(num);
    } 
    
}
