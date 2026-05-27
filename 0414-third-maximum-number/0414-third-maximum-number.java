class Solution {

    public int thirdMax(int[] nums) {

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (num > largest) {

                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            }

            else if (num > secondLargest && num != largest) {

                thirdLargest = secondLargest;
                secondLargest = num;
            }

            else if (num > thirdLargest &&
                     num != secondLargest &&
                     num != largest) {

                thirdLargest = num;
            }
        }

        // third maximum does not exist
        if (thirdLargest == Long.MIN_VALUE) {
            return (int) largest;
        }

        return (int) thirdLargest;
    }
}