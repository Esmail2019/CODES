import java.util.*;

public class HollowRectangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int line=1;line<=n;line++){
            System.out.println("*");
            for(int i=1;i<=line;i++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

}
