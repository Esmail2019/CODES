import java.util.*;
public class Kadane {

    public static void print_Subarrays(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Sum of subarray is = " + maxsum);
    }

    public static void kadanes(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<num.length;i++){
            cs = cs + num[i];
            if(cs<0){
                cs = 0; 
            }
             ms = Math.max(cs,ms);

        }
        System.out.println("Sum of subarray is = " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
       kadanes(numbers);

    }
}
