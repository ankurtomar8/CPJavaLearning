import java.util.Scanner;

public class Q1_2_Largest_in_each_Row_of_2D_Array {
    
    public static void largestRowElement(int arr[][]){

        int n = arr.length;
        int m = arr[0].length;
        int arrNew[] = new int[n];
        System.out.println("Rows: "+n+" Cols: "+m);
        for(int row = 0; row < n ; row++){
            int largest = arr[row][0];
            for(int col = 0; col < m; col++){
                if(arr[row][col] > largest ){
                    largest = arr[row][col];
                    //    System.out.print(arr[row][col+1]+" ");
                }
               
            } 
            arrNew[row] = largest;
            System.out.println(arrNew[row]+"");           
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
        largestRowElement(mat);

    }
}
