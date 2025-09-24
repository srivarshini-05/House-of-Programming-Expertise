def longest_common_substring(s1: str, s2: str):
    n, m = len(s1), len(s2)

    # Step 1: Create dp as an empty list
    dp = []

    # Step 2: Fill dp with rows of zeros (m+1 columns, n+1 rows)
    for i in range(n + 1):
        row = []
        for j in range(m + 1):
            row.append(0)
        dp.append(row)

    # dp is now a (n+1) x (m+1) matrix of zeros
    max_len = 0
    end_index = 0  # in s1

    # Step 3: Fill the dp table
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            if s1[i - 1] == s2[j - 1]:
                dp[i][j] = dp[i - 1][j - 1] + 1
                if dp[i][j] > max_len:
                    max_len = dp[i][j]
                    end_index = i
            else:
                dp[i][j] = 0

    # Step 4: Extract substring from s1
    return s1[end_index - max_len:end_index], max_len


# Example usage
s1 = "abcdfgh"
s2 = "zbcdfq"
substring, length = longest_common_substring(s1, s2)
print("Longest Common Substring:", substring)
print("Length:", length)
