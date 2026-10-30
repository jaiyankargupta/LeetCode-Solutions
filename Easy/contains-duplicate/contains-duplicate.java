class Solution {
    public boolean containsDuplicate(int[] nums) {
        // integer array list : nums
        // if any values appears twice in array list -> return true else false
        // sol
        // we can pick one element and match withe the remaining once
        // so : total element is n and we are matching with n-1
        // so complexity will be : n * (n-1) ~ n^2
        // we need to use somethings else
        // use map because we can add like element: freq; if the freq > 1 then return false
        //start
        // Map<Integer, Integer> mpp = new HashMap<>(); 
        // // creation done
        // // we need to add all values in the map
        // for(int i=0; i<nums.length; i++){
        //       mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        // }
        // // checking the freq > 1
        // for(int i=0; i<nums.length; i++){
        //     if(mpp.get(nums[i]) > 1){
        //         return true;
        //     }
        // }
        // return false;
        // 2nd approach: set because hashMap adding extra integer per key, increasing memory usage
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            // if present return true
            // else false
            if(hashSet.contains(nums[i])){
                return true;
            }
            // add
            hashSet.add(nums[i]);
        }
        return false;
    }
}