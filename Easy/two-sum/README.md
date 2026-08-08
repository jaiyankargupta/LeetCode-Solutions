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
- **Key Idea**: The key idea is to store the numbers we've seen so far in a hash map, where the key is the number and the value is its index. Then, for each number, we check if its complement (the target minus the number) is in the hash map. If it is, we return the indices of the two numbers.

- **Considerations**: When considering edge cases, we should note that the input array is not necessarily sorted, and the target number can be any integer. We also assume that there is exactly one solution to the problem.
- **Optimization Notes**: The time complexity is O(N) because we're doing a constant amount of work for each element in the input array. The hash map operations (containsKey and put) take O(1) time on average.

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
