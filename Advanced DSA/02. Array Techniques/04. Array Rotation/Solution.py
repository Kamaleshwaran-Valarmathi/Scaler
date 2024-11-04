def reverse(A, left, right):
    while left < right:
        A[left], A[right] = A[right], A[left]
        left += 1
        right -= 1


class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return a list of integers
    def solve(self, A, B):
        n = len(A)
        B %= n
        reverse(A, 0, n - B - 1)
        reverse(A, n - B, n - 1)
        reverse(A, 0, n - 1)
        return A
