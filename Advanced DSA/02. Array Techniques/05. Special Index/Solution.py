class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        oddPrefSum = [0 for _ in range(len(A))]
        evenPrefSum = [0 for _ in range(len(A))]
        for i in range(len(A)):
            oddPrefSum[i] = (0 if i == 0 else oddPrefSum[i - 1]) + (A[i] if (i & 1) == 0 else 0)
            evenPrefSum[i] = (0 if i == 0 else evenPrefSum[i - 1]) + (A[i] if (i & 1) == 1 else 0)
        
        validElementsCount = 0
        for i in range(len(A)):
            curOddSum = (0 if i == 0 else oddPrefSum[i - 1]) + (evenPrefSum[-1] - evenPrefSum[i])
            curEvenSum = (0 if i == 0 else evenPrefSum[i - 1]) + (oddPrefSum[-1] - oddPrefSum[i])
            validElementsCount += (1 if curOddSum == curEvenSum else 0)
        return validElementsCount
