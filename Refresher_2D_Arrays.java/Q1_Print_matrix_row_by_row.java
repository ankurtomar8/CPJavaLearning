import java.util.Scanner;

public class Q1_Print_matrix_row_by_row {

    public static void printMatrixRowByRow(int arr[][] , int n, int m){

        System.out.println("Rows: "+n+" Cols: "+m);
        for(int row = 0; row < n ; row++){
            for(int col = 0; col < m; col++){
               System.out.print(arr[row][col]+" ");
            } 
            System.out.println("");           
        } 
            
    }

    public static void printMatrixColByCol(int arr[][] , int n, int m){

        System.out.println("Rows: "+n+" Cols: "+m);
        for(int col = 0; col < m; col++){
        for(int row = 0; row < n ; row++){
               System.out.print(arr[row][col]+" ");
            } 
            System.out.println("");           
        } 
            
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt(); // row
        int m = sc.nextInt(); // col
        int[][] mat = new int[n][m];
        //  2D array input 
        for(int row = 0; row < n ; row++){
            for(int col = 0; col < m; col++){
                mat[row][col] = sc.nextInt();
            }            
        }   
    //    printMatrixRowByRow(mat,n,m);
        printMatrixColByCol(mat,n,m);

    }
    
}
