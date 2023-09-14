import java.util.*;

public class Palindrome {
    
    public static void main (String args[]) {
      Scanner  sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0;
        while(n<0){
            dec=n%10; 
            System.out.print(dec);
            n=dec+n/10;
           
        }
       
        System.out.print(dec);
      
    }
    
}
