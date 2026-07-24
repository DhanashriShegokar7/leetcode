class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0; i < nums.length; i++) {
            ts.add(nums[i]);
        } 
        if(ts.size() < nums.length) {
            return true;
        }
        return false;
    }
}