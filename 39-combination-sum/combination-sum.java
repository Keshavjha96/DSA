class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        getAllCombinations(candidates,0,target,ans,combin);       
        return ans;
    }

    public void getAllCombinations(int[] arr, int idx, int tar, List<List<Integer>> ans,
List<Integer> combin) {

        if (tar == 0) {
            ans.add(new ArrayList<>(combin));
            return;
        }
        if (idx == arr.length || tar < 0) {
            return;
        }
        combin.add(arr[idx]);
        getAllCombinations(arr,idx,tar-arr[idx],ans,combin);
        combin.remove(combin.size() - 1);
        getAllCombinations(arr,idx+1,tar,ans,combin);
    }
}