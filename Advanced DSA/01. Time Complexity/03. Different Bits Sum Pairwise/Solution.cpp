int Solution::cntBits(vector<int> &A) {
    long res = 0, mod = 1e9 + 7;
    for (int i = 0; i < 32; ++i) {
        int set_bit_count = 0;
        for (int j = 0; j < A.size(); ++j)
            set_bit_count += bool(A[j] & (1 << i));
        res = (res % mod) + (((set_bit_count * (A.size() - set_bit_count)) << 1) % mod);
    }
    return res;
}
