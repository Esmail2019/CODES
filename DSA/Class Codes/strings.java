import java.util.*;

public class strings {


         public  static String revStr(String S) {

            char[] str = S.toCharArray();
           int first=str[0],last=str.length-1;
      
           while (first < last) {
            // swap
            char temp = str[last];
            str[last] = str[first];
            str[first] =  temp;

            first++;
            last--;
       }
       return str.toString();
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    // public static void printLetters(String str) {
    // for (int i = 0; i < str.length(); i++) {
    // System.out.print(str.charAt(i) + " ");
    // }
    // System.out.println();
    // }

    public static void main(String args[]) {
        String str = "abcd";
        // // String str2 = new String("xyzfgrf345");

        // // //Strings are IMMNUTABLE
        // // Scanner sc = new Scanner(System.in);
        // // String name;
        // // name =sc.nextLine();
        // // System.out.print(name);
        // // // System.out.print()

        // // String fullName = "Tony Stark";
        // // // System.out.print(fullName.length());

        // // String firstName = "Sajid";
        // // String lastName = "Sheikh";
        // // String fullName = firstName + " " + lastName;
        // // System.out.println(fullName + " is this");
        // // System.out.println(fullName.charAt(3));
        // // printLetters(fullName);

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if (s1 == s2) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("NOt equal");
        // }

        // if (s1 == s3) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("String are not equal");
        // }

        // if (s1.equals(s3)) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // String sr = "HelloWorld";
        // System.out.println(subString(sr, 0, 5));
        // System.out.println(sr.substring(0, 4));
        System.out.println(revStr(str));

        
    }

}
