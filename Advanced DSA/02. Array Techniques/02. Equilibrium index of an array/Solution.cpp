int Solution::solve(vector<int> &A) {
    vector<int> suffix_sum(A.size() + 1, 0);
    for (int i = A.size() - 1; i >= 0; --i)
        suffix_sum[i] = suffix_sum[i+1] + A[i];
    
    int prefix_sum = 0;
    for (int i = 0; i < A.size(); ++i) {
        if (prefix_sum == suffix_sum[i + 1])
            return i;
        prefix_sum += A[i];
    }
    return -1;
}
