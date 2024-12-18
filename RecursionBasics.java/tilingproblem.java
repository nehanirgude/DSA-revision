public class tilingproblem {

    public static int  tiling(int n){
        if(n==0|| n==1){
            return 1;
        }

        //work
        //vertial
        int vertical=tiling(n-1);
        //horizontal
        int horizontal=tiling(n-2);
        //total no of ways
        int totalWays=vertical+horizontal;
        return totalWays;

    }


    public static void main(String args[]){
      int n;
      System.out.println(tiling(5));
    }
    
}
