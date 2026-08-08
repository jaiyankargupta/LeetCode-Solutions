# Two Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)
![Platform](https://img.shields.io/badge/Platform-LeetCode-c2572b?style=flat-square)
![Language](https://img.shields.io/badge/Language-Java-0284c7?style=flat-square)

[View Problem on LeetCode](https://leetcode.com/problems/two-sum/submissions/2083986412/)

---

## Solution Overview

- **Approach**: `Hash Table`
- **Time Complexity**: `O(N)`
- **Space Complexity**: `O(N)`
- **Key Idea**: The key idea is to store the numbers in the input array as keys in a Hash Table, along with their indices. Then, for each number, we check if its complement (target - number) is already present in the Hash Table. If it is, we return the indices of the two numbers.

- **Considerations**: When considering edge cases, note that the input array may contain duplicate numbers. However, since we're storing the numbers as keys in the Hash Table, we'll only store each number once, and its index will be updated accordingly.
- **Optimization Notes**: The time complexity is O(N) because we're iterating through the input array once. The Hash Table operations (containsKey and put) take constant time on average, so they don't affect the overall time complexity.

## Source Code (Java)

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

---
*Synced automatically with [Rustyn Analyzer](https://analzer.rustyn.me/)*
