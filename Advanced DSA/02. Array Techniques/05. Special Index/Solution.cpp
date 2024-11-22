int Solution::solve(vector<int> &A) {
    vector<int> oddPrefSum(A.size(), 0);
    vector<int> evenPrefSum(A.size(), 0);
    for (int i = 0; i < A.size(); ++i) {
        oddPrefSum[i] = (i == 0 ? 0 : oddPrefSum[i - 1]) + ((i & 1) ? 0 : A[i]);
        evenPrefSum[i] = (i == 0 ? 0 : evenPrefSum[i - 1]) + ((i & 1) ? A[i] : 0);
    }

    int validElementsCount = 0;
    for (int i = 0; i < A.size(); ++i) {
        int curOddSum = (i == 0 ? 0 : oddPrefSum[i - 1]) + (evenPrefSum.back() - evenPrefSum[i]);
        int curEvenSum = (i == 0 ? 0 : evenPrefSum[i - 1]) + (oddPrefSum.back() - oddPrefSum[i]);
        validElementsCount += bool(curOddSum == curEvenSum);
    }
    return validElementsCount;
}
