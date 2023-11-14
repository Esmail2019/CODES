import java.util.*;

public class large2darr {


    public static void large(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
       System.out.println("Largest element is "+largest+" present at ");
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        //
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //ouput
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        large(matrix);

    }

}
