public class BasicSorting {

    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] >arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;

                }
            }
            System.out.println(swap);
        }
    }

    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                // if (arr[minPos] < arr[j])
                {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

    }

    public static void insertionSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int curr = i;
            int prev = i - 1;

            // finding correc tposition for insertion
            while (prev >= 0 && ar[prev] > curr) {
                ar[prev + 1] = ar[prev];
                prev--;
            }
            // insertion
            ar[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int k : arr) {
            largest = Math.max(largest, k);
        }
        int[] count = new int[largest + 1];
        for (int k : arr) {
            count[k]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 1, 3, 2 };
        countingSort(arr);
        // Arrays.sort(arr,0,3,Collections.reverseorder())
        printArr(arr);

    }

}
