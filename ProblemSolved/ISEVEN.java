import java.util.*;

public class ISEVEN {

    public static boolean isEven(int n){
       if(n%2==0){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main (String args[]) {
      Scanner sc = new Scanner(System.in);
      int number=sc.nextInt();
      boolean solution =isEven(number);    
      System.out.println(solution);  
    }
    
}
