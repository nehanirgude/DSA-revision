import java.util.ArrayList;
public class multidimensional{
    public static void main(String args[]){
        //syntax for creation of multidimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        mainList.add(arr);

        //similarly we can make second list

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(5);
        arr2.add(6);
        mainList.add(arr2);

        // to print list in mainlist

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList=mainList.get(i);  // i will get whole list beacause at ith position there is a list presennt

            //for print the element in that sublist i can iterat on currList

            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
       //if i want to print whole mainlist then
       System.out.println(mainList);
    }

}