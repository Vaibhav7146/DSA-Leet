class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
          mp.put(0, -1);

        int sum = 0;
         
        for(int i=0;i<n;i++){
            sum +=nums[i];

            int reminder = sum%k;

             if (mp.containsKey(reminder)) {
                if(i - mp.get(reminder) >= 2){
                    return true;
                }
            }else{
                    mp.put(reminder, i);
            }
        }
        return false;
    }
}