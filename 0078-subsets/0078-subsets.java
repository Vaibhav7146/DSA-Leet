class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findSolution(0, nums, ans, new ArrayList<>());
        return ans;
    }

    private void findSolution(int ind, int[] arr,List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i= ind; i < arr.length; i++){
        ds.add(arr[i]);
        findSolution(i+1, arr, ans, ds);
        ds.remove(ds.size()-1);
        }
    }
}