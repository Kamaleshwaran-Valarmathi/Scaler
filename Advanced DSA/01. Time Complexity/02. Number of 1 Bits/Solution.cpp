int Solution::numSetBits(int A) {
    int set_bit_count = 0;
    for ( ; A > 0; A >>= 1)
        set_bit_count += (A & 1);
    return set_bit_count;
}
