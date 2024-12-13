public class substr {
    public static String substring(String str, int si ,int ei){
        String subString="";
        for(int i=si; i<ei; i++){
         subString+=str.charAt(i);
        }
        return subString;

    }
    public static void main(String args[]){

        String str="helloworld";

       System.out.println(substring(str, 1, 4));

    }
    
}
