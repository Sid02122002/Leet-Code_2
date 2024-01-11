class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 because the first element is always unique
        int current = nums[0]; // The current unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                nums[uniqueCount] = nums[i];
                current = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
