# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)
![Platform](https://img.shields.io/badge/Platform-LeetCode-c2572b?style=flat-square)
![Language](https://img.shields.io/badge/Language-Java-0284c7?style=flat-square)

[View Problem on LeetCode](https://leetcode.com/problems/contains-duplicate/submissions/2185294609/)

---

## Solution Overview

- **Approach**: `Uses a HashMap to count frequencies of each element, then scans the array again to find any count greater than one.` (Alternative: `Use a HashSet to detect duplicates during a single pass, returning true immediately when an element is already present.`)
- **Time Complexity**: `O(N)`
- **Space Complexity**: `O(N)`
- **Key Idea**: Iterate through the array, inserting each number into a set. If insertion fails because the number is already in the set, a duplicate exists and the function returns true. Otherwise, after the loop, return false.
- **Alternatives**: Sorting the array and checking adjacent elements gives O(N log N) time with O(1) auxiliary space, whereas the hash-based approach offers O(N) time with O(N) space.
- **Considerations**: Handle empty or single-element arrays (no duplicates). Negative numbers and large values are fine because the hash structure stores them as keys. The algorithm works for any integer range within Java’s int limits.
- **Optimization Notes**: The current implementation performs two linear passes; it can be optimized to a single pass by checking the map during insertion. All operations on the hash map are O(1) on average, keeping the overall time linear.

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
