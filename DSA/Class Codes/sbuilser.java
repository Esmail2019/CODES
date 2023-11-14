public class sbuilser { 
    public static void main (String args[]) {
   StringBuilder sb = new StringBuilder( );
      for(char ch = 'a'; ch <='z'; ch++) {
        sb.append(ch);
      }////abcsdcd
      //O(262)
      //O(n^2 )
      System.out.println(sb);
      System.out.println(sb.length());
    }
    
}
 