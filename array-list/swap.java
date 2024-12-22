import java.util.*;

public class swap {
    
     public static void swapTwoIdx(ArrayList <Integer> list,int idx1,int idx2){

        int temp=list.get(1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    

     }
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(6);

        // my arraylist looks line =[1,2,5,3,7,4,6]
        // i want to swap two numbers that is 2 and 3

        int idx1=list.get(1);
        int idx2=list.get(2);

        swapTwoIdx(list, idx1, idx2);
        System.out.print(list);



    }
}
