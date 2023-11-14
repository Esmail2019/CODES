public class recursion {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fNm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int nfib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f1 = nfib(n - 1);
        int f2 = nfib(n - 2);
        int fn = nfib(n - 1) + nfib(n - 2);
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sum(n - 1);
        int Sn = n + sum(n - 1);
        return Sn;
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccur(arr, key, i + 1);
    }

    public static int lastOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n - 1);
        // int xn = x * xnm1 - 1;
        // return xn;

        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {// O(log(n))
        if (n == 0) {
            return 1;
        }

        int halfPower = optimizedPower(x, n / 2);
        int halfPowersq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static int tiling(int n) {// 2 x n (floor size)

        if (n == 0 | n == 1) {
            return 1;
        }
        // // kaam
        // // vertical choice
        // int fnm1 = tiling(n - 1);

        // // horizontal choice
        // int fmn2 = tiling(n - 2);

        // int totWays = fnm1 + fmn2;
        // return totWays;

        return tiling(n - 1) + tiling(n - 2);
    }

    public static void rdStrin(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            rdStrin(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            rdStrin(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int buddyPairring(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;

        }
        // // choice
        // // single
        // int fnm1 = buddyPairring(n - 1);

        // // pair
        // int fnm2 = buddyPairring(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // totways
        // int totWays = fnm1 + pairWays;
        // return totWays;

        return buddyPairring(n - 1) + (n - 1) * buddyPairring(n - 2);
    }

    public static void main(String args[]) {
        // int n = 6;
        // // printDec(n);
        // // System.out.println(fact(n));
        // // System.out.println(sum(n));
        // System.out.println(nfib(n));

        // int arr[] = { 1, 5, 3, 8, 5, 4 };
        // System.out.println(lastOccur(arr, 5, 0));
        // System.out.println(power(2, 10));

        System.out.println(optimizedPower(2, 5));
        System.out.println(tiling(2));
        String str = "appnnacollege";
        rdStrin(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(buddyPairring(3));

    }
}