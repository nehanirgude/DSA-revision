public class lastoccurrence {

    public static int lastOccurr(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurr(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        
        return isFound;

    }

    public static void main(String args[]){
        int arr[]={1,2,4,5,3,7,2,9,3};
        int key=2;
        int i=0;
        System.out.println(lastOccurr(arr, key, i));
    }
    
}
