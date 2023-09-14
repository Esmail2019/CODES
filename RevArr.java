public class RevArr {

    public static void rev_Array(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        rev_Array(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }

}
