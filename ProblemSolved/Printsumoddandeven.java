import java.util.*;

public class Printsumoddandeven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        int n = sc.nextInt();
        int sum_even = 0;
        int sum_odd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum_even = sum_even + i;
            } else {
                sum_odd += i;
            }
        }
        System.out.println("The sum of even numbers are : "+sum_even);
        System.out.println("The sum of odd  numbers are : "+sum_odd);

    }

}
