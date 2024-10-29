int Solution::solve(int A) {
    int factors_count = 0;
    for (int i = 1; i*i <= A; ++i)
        if (A % i == 0)
            factors_count += ((A / i == i) ? 1 : 2);
    return factors_count;
}
