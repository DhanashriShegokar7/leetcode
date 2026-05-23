class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }
        while(index < n) {
            temp[index] = 0;
            index++;
        }
        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}