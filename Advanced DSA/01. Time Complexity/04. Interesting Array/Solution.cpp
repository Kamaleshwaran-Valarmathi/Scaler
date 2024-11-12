string Solution::solve(vector<int> &A) {
    int cummulative_xor = 0;
    for (int i = 0; i < A.size(); ++i)
        cummulative_xor ^= A[i];
    return (cummulative_xor & 1) ? "No" : "Yes";
}
