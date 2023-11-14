import java.util.Arrays;

public class anagrams {

    public static void main(String args[]) {
        String str1 = "Earth";
        String str2 = "Heart";

        // convert to lowercase so dont have to compare uppercase also

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // if length are equal then we can proceed

        if (str1.length() == str2.length()) {

            // conversion to charArray gives the capability to use sort function

            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the charArrays so if same then sorted charArray will be same

            Arrays.sort(str1charArray);

            Arrays.sort(str2charArray);

            // compare is both are equal using .equals
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are the anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }

    }

}
