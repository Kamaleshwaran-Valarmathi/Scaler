long Solution::subarraySum(vector<int> &A) {
    int n = A.size();
    long total_sum = 0;
    for (int i = 1; i <= n; ++i)
        total_sum += (A[i - 1] * i * (n - i + 1L));
    return total_sum;
}
