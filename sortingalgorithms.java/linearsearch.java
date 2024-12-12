import java.util.*;
public class linearsearch {


    public static int linearsearch(int key,int numbers[]){

        for(int i=0; i<=numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
           
        }
        return -1;
    }
    public static void main(String args[]){

        int numbers[]={1,2,4,6,8,10,12,14};
        int key=10;

        int index=linearsearch(key, numbers);
        if(index==-1){
            System.out.println("index not found");
        }
        else{
            System.out.println("index found at "+ index);
        }
    }
    
}
