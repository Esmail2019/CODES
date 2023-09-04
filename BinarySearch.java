
import java.util.*;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Comapreison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {// Right
                start = mid + 1;

            } else {// left
                end = mid - 1;
            }
           
        }
         return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int key = 15456;
        System.out.print("Index for the key is: " + binarySearch(numbers, key));
    }

}
