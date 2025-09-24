def all_substrings(s: str):
    substrings = []
    n = len(s)
    for i in range(n):
        for j in range(i + 1, n + 1):
            substrings.append(s[i:j])
    return substrings


# Example
s = "abc"
print(all_substrings(s))

