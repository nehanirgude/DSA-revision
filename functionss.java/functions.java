public class functions {
    //binary to decimal
    public static void binToDec( int binNum){

        int decNum=0;
        int pow=0;

        while(binNum>0){

            int lastDigit= binNum%10;

             decNum=decNum+(lastDigit*((int)Math.pow(2,pow)));
             pow++;
             

             binNum=binNum/10;
        }
        System.out.println(decNum);
         

    }

    //decimal to binary

    public static void decToBin( int decNum){

        int binNum=0;
        int pow=0;
        while(decNum>0){
            int rem=decNum%2;
            binNum=binNum+(rem*((int)Math.pow(10,pow)));
            pow++;
            decNum=decNum/2;

        }

        System.out.println(binNum);
        
    }

    public static void main(String args[]){

        // binToDec(101);
        decToBin(7);



    }
    
}
