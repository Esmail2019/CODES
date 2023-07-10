import java.util.*;

public class ISEVEN {

    public static int isEven(int n){
       boolean solution;
        if(n%2==0){
            solution= true;
        }
        else {
            solution= false;
        }
        return 0;
    }

    public static void main (String args[]) {
      Scanner sc = new Scanner(System.in);
      int number=sc.nextInt();
      isEven(number);      
    }
    
}
