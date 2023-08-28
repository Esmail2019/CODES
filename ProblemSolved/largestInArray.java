public class largestInArray {

    public static int LargestinArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];

            }
            
        }
        System.out.println(smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[]={1,2,3,4};
        int solution = LargestinArray(numbers);
        System.out.print(solution);
    }

}
