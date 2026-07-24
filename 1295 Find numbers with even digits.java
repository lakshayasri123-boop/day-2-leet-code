class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            while (num > 0) {
                digits++;
                num = num / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
