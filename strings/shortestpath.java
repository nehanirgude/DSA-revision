public class shortestpath{
    public static float  shortestPath(String path){
        int x=0,y=0;
      for(int i=0; i<path.length(); i++){
        int dir=path.charAt(i);
        //south
        if(dir=='S'){
            y--;
        }
        //north
        else if(dir=='N'){
            y++;
        }
        //east
        else if(dir=='E'){
            x++;
        }
        //west
        else{
            x--;
        }
      }
      int X2=x*x;
      int Y2=y*y;

      return  (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));

    }
}