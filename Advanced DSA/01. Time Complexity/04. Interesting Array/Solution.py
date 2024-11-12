class Solution:
    # @param A : list of integers
    # @return a strings
    def solve(self, A):
        cummulative_xor = 0
        for val in A:
            cummulative_xor ^= val
        return 'No' if cummulative_xor & 1 else 'Yes'
