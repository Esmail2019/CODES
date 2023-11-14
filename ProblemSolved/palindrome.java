public class palindrome {

    public static float getShortestPath(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return Math.sqrt(X2 + Y2);

    }

    public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
    int n = str.length();
    if (str.charAt(i) != str.charAt(n - 1 - i)) {
    // not A PALINDROME
    return false;
    }

    }
    return true;
    }

    public static void main(String args[]) {
        // String name = "noon";
        // System.out.println(isPalindrome(name));

        String path = "NSEE";
        System.out.println(getShortestPath(path));
        
        
    }

}
