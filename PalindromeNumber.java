public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return x == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println(result); // Output: true
    }

}
