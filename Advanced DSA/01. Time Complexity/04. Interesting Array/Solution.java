public class Solution {
    public String solve(ArrayList<Integer> A) {
        int cummulative_xor = 0;
        for (int i = 0; i < A.size(); ++i)
            cummulative_xor ^= A.get(i);
        return ((cummulative_xor & 1) == 1) ? "No" : "Yes";
    }
}
