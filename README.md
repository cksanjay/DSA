# DSA

Compilation of my DSA journey in one place.

| No. 	| Pattern 	| Problem 	| Solution 	| Approach 	|   Time & Space complexity|
|-----	|---------	|---------	|-------	|-------	| -------	|
| 1 | Arrays | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)  | [Optimised](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/Duplicate.java) | **Brute Force:** For every element we can iterate through the entire array and check if there is a duplicate.<br> **Optimised:** Add each element in a Set(or List). Before adding each element to the set, we should check if its already present. If present, then we can stop since duplicate exists. | **Brute Force:** Time - O(n^2) & O(1) <br> **Optimised:** O(n) & O(n)|
| 2 | Arrays | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | [Solution](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/ValidAnagram.java) | We can add the occurences of all characters of the string into separate hashmaps & then compare them both | O(s+t) & O(s+t)|
| 3 | Arrays | [Two Sum](https://leetcode.com/problems/two-sum/) |[Optimised](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/TwoSum.java)| **Brute Force:** For each element iterate through the rest of the array and calcuate the sum. Basically we are calculating sum of of all possible combinations in the array. <br>**Optimised** Eg- If target is 9, and the current element is 2, then we are looking for a difference of 7 to add it to 9.