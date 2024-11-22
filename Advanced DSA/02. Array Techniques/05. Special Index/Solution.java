public class Solution {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> oddPrefSum = new ArrayList<>(Collections.nCopies(A.size(), 0));
        ArrayList<Integer> evenPrefSum = new ArrayList<>(Collections.nCopies(A.size(), 0));
        for (int i = 0; i < A.size(); ++i) {
            oddPrefSum.set(i, (i == 0 ? 0 : oddPrefSum.get(i - 1)) + ((i & 1) == 0 ? A.get(i) : 0));
            evenPrefSum.set(i, (i == 0 ? 0 : evenPrefSum.get(i - 1)) + ((i & 1) == 1 ? A.get(i) : 0));
        }

        int validElementsCount = 0;
        for (int i = 0; i < A.size(); ++i) {
            int curOddSum = (i == 0 ? 0 : oddPrefSum.get(i - 1)) + (evenPrefSum.get(evenPrefSum.size() - 1) - evenPrefSum.get(i));
            int curEvenSum = (i == 0 ? 0 : evenPrefSum.get(i - 1)) + (oddPrefSum.get(oddPrefSum.size() - 1) - oddPrefSum.get(i));
            validElementsCount += (curOddSum == curEvenSum ? 1 : 0);
        }
        return validElementsCount;
    }
}
