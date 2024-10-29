class Solution:
    # @param A : integer
    # @return an integer
    def solve(self, A):
        factors_count = 0
        for i in range(1, A+1):
            if i*i > A:
                break
            if A % i == 0:
                factors_count += (1 if A // i == i else 2)
        return factors_count
