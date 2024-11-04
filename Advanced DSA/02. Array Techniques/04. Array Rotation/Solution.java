public class Solution {
    private void reverse(ArrayList<Integer> A, int left, int right) {
        for ( ; left < right; ++left, --right)
            Collections.swap(A, left, right);
    }


    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        B %= n;
        reverse(A, 0, n - B - 1);
        reverse(A, n - B, n - 1);
        reverse(A, 0, n - 1);
        return A;
    }
}
