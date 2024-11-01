public class Solution {
    public int solve(ArrayList<Integer> A) {
        int[] suffix_sum = new int[A.size() + 1];
        for (int i = A.size()-1; i >= 0; --i)
            suffix_sum[i] = suffix_sum[i + 1] + A.get(i);
        
        int prefix_sum = 0;
        for (int i = 0; i < A.size(); ++i) {
            if (prefix_sum == suffix_sum[i + 1])
                return i;
            prefix_sum += A.get(i);
        }
        return -1;
    }
}
