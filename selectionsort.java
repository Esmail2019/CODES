public class selectionsort {

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

    }

public static void main (String args[]) {
  int arr[] ={5,4,1,3,2};
  selection_sort(arr);
  printArr(arr);
  
}
