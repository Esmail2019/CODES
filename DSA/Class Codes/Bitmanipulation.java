import java.util.*;

public class Bitmanipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is even");
        } else
            System.out.println(n + " is odd");
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit==0){
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int BitMAsk = newBit << i;
        return n | BitMAsk;
    }

    public static int clearIBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsinRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {// checkLSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {

        // // Logical And & - And gate
        // System.out.println((5 & 6));
        // // Logical OR |
        // System.out.println((5 | 6));
        // // Logical XOR ^
        // System.out.println((5 ^ 6));
        // // Logical One' Complement
        // System.out.println((~5));
        // System.out.println((~0));
        // // Left SHift
        // System.out.println((5 << 2));
        // // Right Shift
        // System.out.println((6 >> 1));

        // oddOrEven(12);
        // oddOrEven(0);
        // oddOrEven(5);

        System.out.println(fastExpo(5, 3));
    }

}
