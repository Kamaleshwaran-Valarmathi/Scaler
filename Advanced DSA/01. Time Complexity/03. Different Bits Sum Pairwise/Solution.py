class Solution:
	# @param A : list of integers
	# @return an integer
	def cntBits(self, A):
        res, mod = 0, 1e9 + 7
        for i in range(32):
            set_bit_count = 0
            for j in range(len(A)):
                set_bit_count += bool((A[j] & (1 << i)) > 0)
            res = (res % mod) + (((set_bit_count * (len(A) - set_bit_count)) << 1) % mod)
        return int(res)
