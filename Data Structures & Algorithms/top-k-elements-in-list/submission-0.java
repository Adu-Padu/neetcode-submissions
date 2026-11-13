class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        int[][] leaderboard = new int[k][2];
        List<Integer> list = new ArrayList<Integer>();

        int count;
        int currentNum;

        for(int i = 0; i<k; i++){
            leaderboard[i][1] = 0;
            
        }

        for(int i = 0; i < nums.length; i++){
            count = 0;
            if (!list.contains(nums[i])){
                for(int s = 0; s < nums.length; s++){
                    if (nums[i]==nums[s]){
                        count++;
                    }
                }
                list.add(nums[i]);
                update(leaderboard, nums[i], count, k);
                
            }
        }

        for(int i = 0; i<k ; i++){
            result[i] = leaderboard[i][0];
        }
        return result;
    }

        public int[][] update(int[][] leaderboard, int number, int frequency, int k) {
            // 1. Check if the new frequency is strictly greater than the lowest frequency on the board
            // (The lowest is always at the very bottom, index k - 1)
            if (frequency > leaderboard[k - 1][1]) {
                
                // 2. Start from the second-to-last element and work backwards
                int i = k - 2;
                
                // 3. Shift elements down as long as they are smaller than the new frequency
                while (i >= 0 && leaderboard[i][1] < frequency) {
                    leaderboard[i + 1][0] = leaderboard[i][0]; // Shift number down
                    leaderboard[i + 1][1] = leaderboard[i][1]; // Shift frequency down
                    i--;
                }
                
                // 4. Insert the new number and frequency into the empty slot we just created
                leaderboard[i + 1][0] = number;
                leaderboard[i + 1][1] = frequency;
            }
            
            return leaderboard;
        }
}
