import java.util.Scanner;

public class Q1_1_Sum_of_Columns_of_2D_Array {
    
    public static void sumOfEveryRow(int arr[][]){

        int n = arr.length;
        int m = arr[0].length;
        
        int arrNew[] = new int[n];
        System.out.println("Rows: "+n+" Cols: "+m);
        for(int col = 0; col < m ; col++){
            int sum = 0;
            for(int row = 0; row < n; row++){
             //  System.out.print(arr[row][col]+" ");
             sum += arr[row][col];
            
            } 
            arrNew[col] = sum;
            System.out.print(" "+sum);           
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
    
        sumOfEveryRow(mat);
    
    }

}
