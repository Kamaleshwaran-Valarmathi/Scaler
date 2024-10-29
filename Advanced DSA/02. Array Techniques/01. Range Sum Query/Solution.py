class Solution:
    # @param A : list of integers
    # @param B : list of list of integers
    # @return an list of long
    def rangeSum(self, A, B):
        pref_sum = [0]
        for i in range(len(A)):
            pref_sum.append(pref_sum[-1] + A[i])
        
        res = []
        for [l, r] in B:
            res.append(pref_sum[r+1] - pref_sum[l])
        return res
