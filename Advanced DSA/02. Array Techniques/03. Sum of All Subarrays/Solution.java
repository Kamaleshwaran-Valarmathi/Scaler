public class Solution {
    public Long subarraySum(ArrayList<Integer> A) {
        int n = A.size();
        long total_sum = 0;
        for (int i = 1; i <= n; ++i)
            total_sum += (A.get(i - 1) * i * (n - i + 1L));
        return total_sum;
    }
}
