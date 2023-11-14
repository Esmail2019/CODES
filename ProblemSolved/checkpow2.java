public class checkpow2 {
  
    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main (String args[]) {
      int n =16;
     System.out.println(isPowerofTwo(n));;
      
    }
    
}
