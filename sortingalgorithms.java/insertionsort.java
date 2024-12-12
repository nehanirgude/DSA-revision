public class insertionsort {
    public static void  insertionSort(int numbers[]){
        for(int i=1; i<numbers.length; i++){
            int curr=numbers[i];
            int prev=i-1;
            // finding small value
            while(prev>=0 && numbers[prev]>numbers[curr]){
                numbers[prev+1]=numbers[curr];
                prev--;

            }

            // insertion
            numbers[prev+1]=curr;
            System.out.println(numbers[i-1]);

        }
        

    }
    public static void main(String args[]){
        int numbers[]={2,5,3,8,4,1};
        insertionSort(numbers);
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
    }
    
}
