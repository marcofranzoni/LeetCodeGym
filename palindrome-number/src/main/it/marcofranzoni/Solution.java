package it.marcofranzoni;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        char[] charArray = String.valueOf(x).toCharArray();

        for (int i=0; i < charArray.length; i++) {
            if (i == charArray.length/2) {
                return true;
            }

            if (!(charArray[i] == charArray[charArray.length-i-1])) {
                return false;
            }

        }

        return true;

    }
}
