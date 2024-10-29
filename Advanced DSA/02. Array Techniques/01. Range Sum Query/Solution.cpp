vector<long long> Solution::rangeSum(vector<int> &A, vector<vector<int> > &B) {
    vector<long> prefix_sum(A.size()+1, 0);
    for (int i = 1; i <= A.size(); ++i)
        prefix_sum[i] = prefix_sum[i-1] + A[i-1];
    
    vector<long long> res;
    for (vector<int> i: B)
        res.push_back(prefix_sum[i[1]+1] - prefix_sum[i[0]]);
    return res;
}
