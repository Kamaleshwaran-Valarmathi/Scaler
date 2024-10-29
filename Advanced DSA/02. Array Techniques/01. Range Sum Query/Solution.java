public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        long[] prefix_sum = new long[A.size() + 1];
        for (int i = 1; i <= A.size(); ++i)
            prefix_sum[i] = prefix_sum[i - 1] + A.get(i - 1);
        
        ArrayList<Long> res = new ArrayList<>();
        for (ArrayList<Integer> range: B) {
            int left = range.get(0);
            int right = range.get(1);
            res.add(prefix_sum[right + 1] - prefix_sum[left]);
        }

        return res;
    }
}
