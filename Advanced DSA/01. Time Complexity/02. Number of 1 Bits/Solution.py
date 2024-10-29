class Solution:
    # @param A : integer
    # @return an integer
    def numSetBits(self, A):
        set_bit_count = 0
        while A:
            set_bit_count += 1
            A = A & (A - 1)
        return set_bit_count
