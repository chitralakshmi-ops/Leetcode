class Solution {
    public String largestNumber(int[] nums) {
        String[] a = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = String.valueOf(nums[i]);
        }
        // Sort using if condition
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]).compareTo(a[j] + a[i]) < 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if (a[0].equals("0")) {
            return "0";
        }
        String ans = "";
        for (String s : a) {
            ans += s;
        }
        return ans;
    }
}