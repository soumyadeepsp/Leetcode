import java.util.*;
class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPalindrome(n));
        scan.close();
    }
    public static boolean isPalindrome(int x) {
        return isPalindrome(Integer.toString(x));
    }
    public static boolean isPalindrome(String x) {
        if (x.length()==1 || x.length()==0) {
            return true;
        }
        if (x.length()==2 && x.charAt(0)==x.charAt(1)) {
            return true;
        }
        return x.charAt(0)==x.charAt(x.length()-1) && isPalindrome(x.substring(1, x.length()-1));
    }
}