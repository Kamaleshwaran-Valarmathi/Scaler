public class Solution {
    public int numSetBits(int A) {
        int set_bit_count = 0;
        for ( ; A > 0; A = (A & (A-1)))
            ++set_bit_count;
        return set_bit_count;
    }
}
