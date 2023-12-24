package contests.top150.n198_house_robber;

public class Solution {

    public int rob(int[] nums) {
        int firstHouse = 0, secondHouse = 0;
        for (int sum: nums) {
            int max = Math.max(firstHouse, secondHouse + sum);
            secondHouse = firstHouse;
            firstHouse = max;
        }

        return firstHouse;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.rob(new int[] {1, 2, 3, 1}));
    }
}
