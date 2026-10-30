# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)
![Platform](https://img.shields.io/badge/Platform-LeetCode-c2572b?style=flat-square)
![Language](https://img.shields.io/badge/Language-Java-0284c7?style=flat-square)

[View Problem on LeetCode](https://leetcode.com/problems/contains-duplicate/submissions/2185299161/)

---

## Solution Overview

- **Approach**: `HashSet`
- **Time Complexity**: `O(N)`
- **Space Complexity**: `O(N)`
- **Key Idea**: Iterate through the array, inserting each element into a HashSet. If an element is already present, a duplicate exists and the function returns true. Otherwise, after the loop, return false. This guarantees O(1) average lookup and insertion per element.
- **Alternatives**: Sorting the array and scanning for adjacent equals gives O(N log N) time and O(1) auxiliary space, but is slower than the hash‑based approach.
- **Considerations**: Edge cases include empty arrays, single‑element arrays, negative numbers, and duplicates at the very beginning or end. The algorithm handles all these correctly because it checks membership before insertion. The HashSet automatically manages hash collisions, ensuring consistent performance across diverse inputs.
- **Optimization Notes**: The loop runs once per element, with constant‑time set operations. No nested loops or expensive operations are present, so the runtime scales linearly with input size.

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
```

---
*Synced automatically with [Rustyn Analyzer](https://analzer.rustyn.me/)*
