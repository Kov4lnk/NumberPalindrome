public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int startNumber = number;
        int reverse = 0;
        int lastDigit;

        while (number != 0){
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (startNumber == reverse){
            return true;
        } else {
            return false;
        }

    }
}
