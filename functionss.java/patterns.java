public class patterns{


    //hollow rectangle pattern
    public static void hollowrect(int row,int cols){

        for(int i=1; i<=row; i++){
            for(int j=1; j<=cols; j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowrect(4,5);

    }
}