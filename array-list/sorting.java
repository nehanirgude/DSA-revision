import java.util.*;
import java.util.Collections;

public class sorting {

    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(5);
    list.add(3);
    list.add(7);
    list.add(4);
    list.add(6);
   System.out.println(list);

   //for ascending order
    Collections.sort(list);
    System.out.println(list);

    //for descending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    }


    
}
