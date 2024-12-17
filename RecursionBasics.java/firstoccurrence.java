public class firstoccurrence {
    public static int firstOccurr(int arr[], int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurr(arr, key, i+1);

    }

    public static void main(String args[]){
        int arr[]={1,5,6,3,4,7,8,4};
        int i=0;
        int key=5;
        System.out.println(firstOccurr(arr, key, i));
    }
    
}
