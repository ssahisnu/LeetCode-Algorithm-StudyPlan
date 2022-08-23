public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid; // not mid-1 as mid cannot be removed from the search space yet
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
