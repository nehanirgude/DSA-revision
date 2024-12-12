import java.util.*;

public class arralgo {

    // to find max value in array
    public static int largestNum(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
        
    }

    // to find min value in array

    public static int smallestNum(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[]={5 ,6,3,9,4,10,2};
        // int  number= largestNum(numbers);
        // System.out.println(number);

        int smallNumber=smallestNum(numbers);
        System.out.println("smallest num is"+ smallNumber);
    }

    
}
