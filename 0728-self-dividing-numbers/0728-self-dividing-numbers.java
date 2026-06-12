class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        // 1 to 9 are always self-dividing
        while (left <= right && left < 10) {
            ans.add(left);
            left++;
        }

        // Check remaining numbers
        for (int i = left; i <= right; i++) {

            int num = i;
            boolean flag = true;

            while (num > 0) {

                int divisor = num % 10;

                if (divisor == 0 || i % divisor != 0) {
                    flag = false;
                    break;
                }

                num = num / 10;
            }

            if (flag == true) {
                ans.add(i);
            }
        }

        return ans;
    }
}