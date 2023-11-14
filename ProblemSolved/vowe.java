public class vowe {

    public static void vow(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
            if (str.charAt(i) == 'e') {
                count++;
            }
            if (str.charAt(i) == 'i') {
                count++;
            }
            if (str.charAt(i) == 'o') {
                count++;
            }
            if (str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        String str = "abci";
        vow(str);
    }
}