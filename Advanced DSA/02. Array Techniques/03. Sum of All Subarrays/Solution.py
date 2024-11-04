class Solution:
    # @param A : list of integers
     # @return an long
    def subarraySum(self, A):
        n = len(A)
        total_sum = 0
        for i in range(1, n + 1):
            total_sum += (A[i - 1] * i * (n - i + 1))
        return total_sum
