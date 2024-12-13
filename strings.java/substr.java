public class substr {
      // si = starting index , ei= ending index
    public static String substring(String str, int si ,int ei){ 
        String subString="";   // new substring 
        for(int i=si; i<ei; i++){  
         subString+=str.charAt(i);  //concatenation
        }
        return subString;

    }
    public static void main(String args[]){

        String str="helloworld";

       System.out.println(substring(str, 1, 4));

    }
    
}
