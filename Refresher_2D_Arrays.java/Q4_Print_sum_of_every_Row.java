import java.util.Scanner;

public class Q4_Print_sum_of_every_Row {
    
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
  
    public static void printWaveFormRowByRow(int arr[][] , int rows, int cols){

        int n = arr.length;
        int m = arr[0].length;

        System.out.println("Rows: "+n+" Cols: "+m);

        for(int row = 0; row < n ; row++){
            if(row % 2 == 0){
                for(int col = 0; col < m; col++){
                    System.out.print(arr[row][col]+" ");
                 } 
            }
            else{
                for(int col = m-1; col >= 0; col--){
                    System.out.print(arr[row][col]+" ");
                 } 
            }
            System.out.println("");       

        } 
            
    }

    public static void printWaveFormColByCol(int arr[][] , int rows, int cols){

        int n = arr.length;
        int m = arr[0].length;

        System.out.println("Rows: "+n+" Cols: "+m);

        for(int col = 0; col < m ; col++){
            if(col % 2 == 0){
                for(int row = 0; row < n; row++){
                    System.out.print(arr[row][col]+" ");
                 } 
            }
            else{
                for(int row = n-1; row >= 0; row--){
                    System.out.print(arr[row][col]+" ");
                 } 
            }
            System.out.println("");       

        } 
            
    }

    public static void sumOfEveryRow(int arr[][]){

        int n = arr.length;
        int m = arr[0].length;
        
        int arrNew[] = new int[n];
        System.out.println("Rows: "+n+" Cols: "+m);
        for(int row = 0; row < n ; row++){
            int sum = 0;
            for(int col = 0; col < m; col++){
             //  System.out.print(arr[row][col]+" ");
             sum += arr[row][col];
            
            } 
            arrNew[row] = sum;
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
      //  printMatrixRowByRow(mat,n,m);
      //  printWaveFormRowByRow(mat,n,m);
    //    printWaveFormColByCol(mat,n,m);
        sumOfEveryRow(mat);
    
    }

    
}
