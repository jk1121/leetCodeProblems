package main.java;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = 10 * rev + x % 10;
            x /= 10;
        }
        return x == rev || (rev / 10) == x;
    }
}
