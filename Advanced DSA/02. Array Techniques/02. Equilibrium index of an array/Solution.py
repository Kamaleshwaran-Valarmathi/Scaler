class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        suffix_sum = [0 for _ in range(len(A) + 1)]
        for i in range(len(A)-1, -1, -1):
            suffix_sum[i] = suffix_sum[i + 1] + A[i]
        
        prefix_sum = 0
        for i in range(len(A)):
            if prefix_sum == suffix_sum[i+1]:
                return i
            prefix_sum += A[i]
        return -1
