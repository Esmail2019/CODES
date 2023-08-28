import java.util.*;

public class Arrays {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;

    }

    // public static void update(int marks[],int nonchangeable) {
    // nonchangeable=10;
    // for (int i = 0; i < marks.length; i++) {
    // marks[i]=marks[i]+1;
    // }
    // }

    public static void main(String args[]) {
        // int marks[] = { 97, 98, 99 };
        // int nonchangeable=5;
        // update(marks,nonchangeable);
        // System.out.println(nonchangeable);
        // for(int i=0;i<marks.length;i++){
        // System.out.print(marks[i]+" ");
        // }
        // System.out.println();

        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest value is : " + getLargest(numbers));
        // System.out.println("Smallest value is :"+getLargest(numbers));

    }

}
