public class spiralmatrix{

    public static void spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length;
        int endCol=matrix[0].length;

        while(startRow<=endRow && startCol<=endRow){
            for(int j=0; j<=endCol; j++){
                System.out.print(matrix[startRow][j]);
            }
    
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]);
            }
            for(int j=endCol-1; j>=startRow; j--){
                System.out.print(matrix[endRow][j]);
            }
    
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]);
            }
             startCol++;
             startRow++;
             endCol--;
             endRow--;
        }
        System.out.println();

        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiral(matrix);
       System.out.println(matrix);
    }
}