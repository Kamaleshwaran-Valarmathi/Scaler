void reverse(vector<int> &A, int left, int right) {
    for (; left < right; ++left, --right)
        swap(A[left], A[right]);
}


vector<int> Solution::solve(vector<int> &A, int B) {
    int n = A.size();
    B %= n;
    reverse(A, 0, n - B - 1);
    reverse(A, n - B, n - 1);
    reverse(A, 0, n - 1);
    return A;
}
