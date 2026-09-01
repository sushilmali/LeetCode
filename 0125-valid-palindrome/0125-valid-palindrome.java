class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 2: Two-pointer check
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // all matched
    }
}
