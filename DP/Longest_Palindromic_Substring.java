class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;

        // dp[i][j] = true if substring s[i..j] is a palindrome
        boolean[][] dp = new boolean[n][n];

        int maxLen = 1;
        int start = 0;

        // All single characters are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                if (maxLen < 2) {
                    maxLen = 2;
                    start = i;
                }
            }
        }

        // Check substrings of length 3 and more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;  // end index

                // s[i..j] is palindrome if s[i] == s[j] and s[i+1..j-1] is palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
