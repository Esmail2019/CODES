// import java.util.*;

public class bubsort {

//     public static void bubbleSort(int num[]) {
//         for (int turn = 0; turn < num.length; turn++) {
//             int swap = 0;
//             for (int j = 0; j < num.length - 1 - turn; j++) {
//                 if (num[j] < num[j + 1]) {

//                     // swap
//                     int temp = num[j];
//                     num[j] = num[j + 1];
//                     num[j + 1] = temp;
//                     swap++;
//                 }
//             }
//             // System.out.print(swap);
//         }
//     }

    public static void selectionSort(int num[]) {
        for (int turns = 0; turns < num.length; turns++) {
            int minpos = turns;
            for (int j = turns + 1; j < num.length - 1; j++) {
                if (num[minpos] < num[j]) {
                    minpos = j;
                }

            }
            int temp = num[minpos];
            num[minpos] = num[turns];
            num[turns] = temp;
        }
    }

    public static void insertionSort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = i;
            int prev = i - 1;

            while (prev >= 0 && num[prev] < curr) {
                num[prev + 1] = num[prev];
                prev--;
            }

            num[prev + 1] = curr;

        }
    }

    public static void countingSort(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int k : num) {
            largest = Math.max(largest, k);
        }
        int[] count = new int[largest + 1];
        for (int k : num) {
            count[k]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    

    public static void printArray(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingSort(arr);
        printArray(arr);
    }
}
