import java.util.*;
public class basicOperation {
    public static void main(String args[]){

        ArrayList <Integer> list=new ArrayList<>(); //created a new array list if name list

        //add opration
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       System.out.println(list);

       //get element by get-opeartion

       int element=list.get(2); //index 2 contain elemnt =4
       System.out.println(element);  //output=4

       //remove element

       list.remove(2); //index 2 have 4 element so 4 will remove 
       System.err.println(list);


       //set element at index 
       list.set(1,7);
       System.out.println(list);

       //contain element 
       //this operation checks wether element present in arralist or not

       System.out.println(list.contains(7));  //output =true



    }
    
}

    
