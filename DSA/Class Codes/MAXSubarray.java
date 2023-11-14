public class MAXSubarray {

    public static void print_Subarrays(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    // sum of subarray
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
            System.out.println();
        }
        System.out.println("Sum of subarray is = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        print_Subarrays(numbers);

    }

}
