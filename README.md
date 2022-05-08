# DSA

Compilation of my DSA journey in one place.

| No. 	| Pattern 	| Problem 	| Solution 	| Approach 	|   Time & Space complexity|
|-----	|---------	|---------	|-------	|-------	| -------	|
| 1 | Arrays | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)  | [Solution](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/Duplicate.java) | **Brute Force:** For every element we can iterate through the entire array and check if there is a duplicate.<br> **Optimised:** Add each element in a Set(or List). Before adding each element to the set, we should check if its already present. If present, then we can stop since duplicate exists. | **Brute Force:** Time - O(n^2) & O(1)