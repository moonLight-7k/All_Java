import java.util.Arrays;
import java.util.Scanner;

public class plusOne {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            System.out.println(Arrays.toString(digits));
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        System.out.println(Arrays.toString(newDigits));
        return newDigits;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] ans = plusOne(new int[] { 1, 2, 3, 4 });

        System.out.print(Arrays.toString(ans));
    }

}
