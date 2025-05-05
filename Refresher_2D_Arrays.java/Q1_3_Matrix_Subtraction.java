import java.util.Scanner;

public class Q1_3_Matrix_Subtraction {
    public static void subtractTwoMatrices(int[][] matrixOne, int[][] matrixTwo){

        int n = matrixOne.length;
        int m = matrixOne[0].length;
        
        int matrixAdditon[][] = new int[n][m];
        System.out.println("Rows: "+n+" Cols: "+m);
        for(int row = 0; row < n ; row++){
            for(int col = 0; col < m; col++){
             //  System.out.print(matrixOne[row][col]+" ");
             matrixAdditon[row][col] = matrixOne[row][col] - matrixTwo[row][col];
             System.out.print(matrixAdditon[row][col]+" ");
            } 
            System.out.println("");           
        } 
            
    }


    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // row
        int[][] matrixOne = new int[n][n];
        //  2D array input 
        for(int row = 0; row < n ; row++){
            for(int col = 0; col < n; col++){
                matrixOne[row][col] = sc.nextInt();
            }            
        } 
    
        int[][] matrixTwo = new int[n][n];
        //  2D array input 
        for(int row = 0; row < n ; row++){
            for(int col = 0; col < n; col++){
                matrixTwo[row][col] = sc.nextInt();
            }            
        } 

        subtractTwoMatrices(matrixOne,matrixTwo);
     
    }

}
