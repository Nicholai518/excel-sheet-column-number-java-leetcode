public class Solution {
    public int titleToNumber(String columnTitle) {
        // number to be returned
        int number = 0;

        // iterate through column title
        for (char c : columnTitle.toCharArray()) {
            int digit = c - 'A' + 1;

            // multiple by 26 because base 26 (each letter of alphabet)
            number = number * 26 + digit;
        }
        return number;
    }
}
