# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)
![Platform](https://img.shields.io/badge/Platform-LeetCode-c2572b?style=flat-square)
![Language](https://img.shields.io/badge/Language-Java-0284c7?style=flat-square)

[View Problem on LeetCode](https://leetcode.com/problems/contains-duplicate/submissions/2185294609/)

---

## Solution Overview

- **Approach**: `Hash Map counting frequencies` (Alternative: `Hash Map with early exit (return true as soon as a duplicate is found) or sort‑in‑place and scan adjacent elements`)
- **Time Complexity**: `O(N)`
- **Space Complexity**: `O(1)`
- **Key Idea**: The algorithm iterates over the array, storing each element’s count in a hash map. If any element’s count exceeds one, a duplicate exists and the function returns true. This guarantees linear time because each lookup and insertion is O(1) on average. The second loop is redundant and can be removed for a cleaner implementation.
- **Alternatives**: Using a hash set with early exit offers O(N) time and O(N) space, while sorting the array and checking adjacent pairs achieves O(N log N) time but only O(1) auxiliary space.
- **Considerations**: Edge cases include empty arrays, single‑element arrays, negative numbers, and large integer values—all handled naturally by the hash map. Duplicates at the end of the array are detected just as efficiently as those at the beginning. The algorithm remains correct regardless of input order or distribution.


## Source Code (Java)

```java
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
        Map<Integer, Integer> mpp = new HashMap<>(); 
        // creation done
        // we need to add all values in the map
        for(int i=0; i<nums.length; i++){
              mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        // checking the freq > 1
        for(int i=0; i<nums.length; i++){
            if(mpp.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }
}
```

---
*Synced automatically with [Rustyn Analyzer](https://analzer.rustyn.me/)*
