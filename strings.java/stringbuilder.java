public class stringbuilder {
    public static void main(String args){
        StringBuilder sb=new StringBuilder("");//abcsefghijklmnopqrstuvwxyz
        for(char ch='a'; ch<'z'; ch++){
            sb.append(ch);

        }
        System.out.print(sb.length());
    }
    
}
