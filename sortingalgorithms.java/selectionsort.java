public class selectionsort {
    public static void selectionSort(int numbers[]){
        for(int i=0; i<numbers.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[minpos]<numbers[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=numbers[minpos];
            numbers[minpos]=numbers[i];
            numbers[i]=temp;

        }
    }

    public static void main(String args[]){
        int numbers[]={2,9,5,4,8};

    }
    
}
