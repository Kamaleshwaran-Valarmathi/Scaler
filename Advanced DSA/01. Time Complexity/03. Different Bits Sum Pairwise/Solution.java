public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        long res = 0, mod = 1000000007;
        for (int i = 0; i < 32; ++i) {
            long set_bit_count = 0;
            for (int j = 0; j < A.size(); ++j)
                set_bit_count += (((A.get(j) & (1 << i)) > 0) ? 1 : 0);
            res = ((res % mod) + (set_bit_count * (A.size() - set_bit_count) << 1)) % mod;
        }
        return (int)res;
    }
}
