class Solution {
    public boolean isPerfectSquare(int num) {

        int n = 1;

        while ((long)n * n <= num) {

            if ((long)n * n == num)
                return true;

            n++;
        }

        return false;
    }
}