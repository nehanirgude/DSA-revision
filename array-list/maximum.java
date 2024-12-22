import java.util.*;
public class maximum {
    public static void main(String args[]){

        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(6);

        //code for finding max num in array list
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size()-1; i++){
            
            if(list.get(i)>max){
                max=list.get(i);
            }
            
        }
        System.out.print(max);
       

    }
    
}
