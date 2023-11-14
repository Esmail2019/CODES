import java.util.*;

public class Functions {

    // //Primes in Range

    // public static void PrimerRange(int n){
    // for(int i=2;i<=n;i++){
    // if(isPrime(i)){
    // //true
    // System.out.print(i+" ");
    // }
    // }
    // System.out.println();

    // }

    // // Optimised prime
    // public static boolean isPrime(int n) {

    // if (n == 2) {
    // return true;
    // }

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }

    // }
    // return true;
    // }

    // // only for n>=2
    // public static boolean isPrime(int n) {

    // // Corner cases //
    // // 2
    // if (n == 2) {
    // return true;
    // }

    // // boolean isPrime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // // isPrime = false;
    // return false;
    // }
    // }
    // return true;
    // }

    // public static float sum(float a, float b) {
    // return a + b;
    // }

    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static int factorial(int n) {
    // int result = 1;

    // for (int i = 1; i <= n; i++) {

    // result *= i;
    // }
    // return result;

    // }

    // public static int binCoeff(int n, int r) {
    // int nfac = factorial(n);
    // int rfact = factorial(r);
    // int nmrfact = factorial(n - r);
    // int binCoeff = (nfac) / (rfact * nmrfact);
    // return binCoeff;
    // }

    // public static void product(int a, int b) {
    // int result;
    // result = a * b;
    // System.out.print("The product is : " + result);
    // }

    // public static void swap(int a, int b) {
    // int temp;
    // temp = a;
    // a = b;
    // b = temp;
    // System.out.print(a + " " + b);
    // }

    // public static void sum() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = a + b;
    // System.out.print("The sum is " + result);

    // }

    // public static int calculatesum(int a, int b) {
    // int result = a + b;
    // return result;
    // }

    // public static void helloworld() {
    // System.out.println("HELLO WORLD");
    // System.out.println("HELLO WORLD");
    // System.out.println("HELLO WORLD");
    // System.out.println("HELLO WORLD");
    // System.out.println("HELLO WORLD");
    // // return 3 if the return type is int , it gives
    // return;

    // }

    public static void binTOdec(int binNum) {
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.print("The binary of decimal number : " + Mynum + "= " + decNum);
    }

    public static void decToBin(int n) {
        int mynum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;

        }
        System.out.println("Binary form of " + mynum + "=" + binNum);
    }

    public static void main(String args[]) {
        // Using a logic repitively without writing the logic again and again
        // Reuseable part of code
        // helloworld();
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // // sum();
        // int sum= calculatesum(a, b);s
        // System.out.println("The sum is : "+sum);

        // SWAP
        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        // System.out.print(a + " " + b);
        // swap(a, b);

        // product(a, b);
        // int solution = factorial(a);
        // System.out.println("The factorial of the number is : "+solution);

        // int n= sc.nextInt();
        // int r=sc.nextInt();
        // int deno = n-r;
        // deno=factorial(deno);
        // n=factorial(n);
        // r=factorial(r);
        // int solution = (n)/((r)*(deno));
        // int solution = binCoeff(n,r);
        // System.out.println("The Binomial Coefficient is : " + solution);
        // System.out.println(sum(4, 4));
        // System.out.println(sum(3.2f,4.8f));

        // int n = sc.nextInt();
        // System.out.println(isPrime(n));

        

        // int n=sc.nextInt();
        // PrimerRange(n);
        int binary=sc.nextInt();
        int decimal=sc.nextInt();
        binTOdec(binary);
        System.out.println();
        decToBin(decimal);



        //  //SCOPE
        // System.out.print(s);
        //  int s=49;
        //   System.out.print(s)
    }

}
