package contests.top150.n134_gas_station;

public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int base = -1, sg = 0, sc = 0, total = 0, result = 0;
        for (int i = 0; i < gas.length; i++) {
            sg += gas[i];
            sc += cost[i];
        }
        if (sg < sc) {
            return base;
        }

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
    }

}