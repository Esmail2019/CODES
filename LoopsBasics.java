import java.util.*;

public class LoopsBasics {
    public static void main (String args[]) {
      Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of times you want to print : ");
        // int count = 0;
        // while(count<100){
        //     System.out.println("ASSALAMUALAIKUM");
        //     count++;
        // }

        // int count = 1;
        // while (count<=10){
        //     System.out.println(count);
        //     count++;
        // }
            
        System.out.println("Enter the value of n : ");
        int num= sc.nextInt();
        int count=0;
        while(count<=num){
            System.out.println(count);
            count++;
        }
    }
    
}
