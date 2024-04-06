class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer ,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            int n = nums[i];
             if(map.containsKey(n)){
                return true;
            }map.put(n,i);
        }return false;
    }
}