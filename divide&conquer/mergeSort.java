public class mergeSort {

    public static void mergesort(int arr[],int si,int ei){
      //base case
      if(si>=ei){
        return;
      }
      int mid=si+(ei-si)/2;
      //recursion call for left part
      mergesort(arr, si, mid);
      //recursion call for right side
      mergesort(arr, mid+1, ei);

      // merge
      merge(arr, si, mid,ei);
    }

    public static void merge(int arr[], int si, int mid , int ei){
        int temp[]=new int[ei-si+1];
        int i=si;  //iterator for left side
        int j=mid+1; // iterator  for rigth side
        int k=0; //iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //leftover elements from rigtht part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //leftover elements form left parts
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        
    //copy temp to original array
     for(k=0,i=si; k<temp.length; i++,k++){
        arr[i]=temp[k];

     }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={2,6,4,1,7,3};
        int si=0;
        int ei=arr.length-1;
        mergesort(arr, si, ei);
        printArr(arr);

    }
    
}
