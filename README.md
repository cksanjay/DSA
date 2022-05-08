# DSA

Compilation of my DSA journey in one place.<br><br>


# Questions:

| No. 	| Pattern 	| Problem   |
|-----	|---------	|---------	|
| 1 | Arrays | [Contains Duplicate](#1-contains-duplicate)| 
| 2 | Arrays | [Valid Anagram](#2-valid-anagram)|
| 3 | Arrays | [Two Sum](#3-two-sum)|
| 4 | Two Pointers  | [Valid Palindrome](#4-valid-palindrome)|
| 5 | Sliding Window    | [Best Time to Buy & Sell stock](#5-best-time-to-buy--sell-stock)|
| 6 | Stack | [Valid Parentheses](#6-valid-parentheses)|
| 7 | Stack | [Min stack](#7-min-stack)|

<br>

# Solutions : 

## 1. Contains Duplicate
 **Question:** [Leetcode](https://leetcode.com/problems/contains-duplicate/) <br>

 **Brute Force:** For every element we can iterate through the entire array and check if there is a duplicate.<br>
 **Time & Space Complexity:** O(n^2) & O(1) <br> 

 **Optimised:** Add each element in a Set(or List). Before adding each element to the set, we should check if its already present. If present, then we can stop since duplicate exists. <br>
 **Time & Space Complexity:** O(n) & O(n)
 
 **Code:** [ Java](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/Duplicate.java)

 [Back to top](#questions)

## 2. Valid Anagram
**Question:** [Leetcode](https://leetcode.com/problems/valid-anagram/)

**Solution** We can add the occurences of all characters of the string into separate hashmaps & then compare them both   <br>
**Time & Space Complexity:** O(s+t) & O(s+t)   <br>

**Code:** [Java](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/ValidAnagram.java)

[Back to top](#questions)

## 3. Two Sum
**Question:** [Two Sum](https://leetcode.com/problems/two-sum/)

**Brute Force:** For each element iterate through the rest of the array and calcuate the sum. Basically we are calculating sum of of all possible combinations in the array.    <br>
**Time & Space Complexity:** O(n^2) & O(1)   <br>

**Optimised:** Eg- If target is 9, and the current element is 2, then we are looking for a difference of 7 to add it to 9. So we will add this difference in a hashmap where key:value as difference:index. Now we can check if the desired difference is available in the hashmap.   <br>
**Time & Space Complexity:**  O(n) & O(n)  <br>

**Code:** [Java](https://github.com/cksanjay/DSA/blob/main/src/Java/arrays/TwoSum.java)

[Back to top](#questions)



## 4. Valid Palindrome
**Question:** [Leetcode](https://leetcode.com/problems/valid-palindrome/)

**Solution:** The catch here is only aplhanumeric characters should be considered. We start with 2 pointers. One at the beginning & one at the end of the string and start comparing the characters and converge in the middle. If any non alphanumeric characters are found, then simple proceed to the next index without considering them. <br>
**Time & Space Complexity:** O(n) & O(1)   <br>

**Code:** [Java](https://github.com/cksanjay/DSA/blob/main/src/Java/twopointers/ValidPalindrome.java)

[Back to top](#questions)

## 5. Best Time to Buy & sell Stock
**Question:** [Leetcode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

**Brute Force:** Iterate through the array. For each element, set it as day of buying and calculate the profit if sold on every day coming up and return the maximum profit in this process.   <br>
**Time & Space Complexity:** O(n^2) & O(1)   <br>

**Optimised:** We can have 2 pointers buy & sell and follow a sliding window approach. When starting, the buy pointer would be the first element and sell would be second. 
- If the price of the sell pointer is less than that of buy, then we would change the buy pointer to the index of sell pointer and increment the sell pointer to next element.
- Else, calculate the profit and store if its the maximum and simply increment the sell pointer till the end of the array.
   <br>

**Time & Space Complexity:** O(n) & O(1)   <br>

**Code:** [Java](https://github.com/cksanjay/DSA/blob/main/src/Java/slidingwindow/BestTimetoBuySellStock.java)

[Back to top](#questions)

## 6. Valid Parentheses
**Question:** [Leetcode](https://leetcode.com/problems/valid-parentheses/)

**Solution:** Iterate through every character of the string.
- If a character is an opening bracket of any type add it in an array and increment the length.
- Else if acharacter is a closing bracket and if the last character in the array is the opening charactr of the same type, then its valid and decrease the length of the array.

If the length of the array is 0, then its valid parentheses order.  <br>

**Time & Space Complexity:** O(n) & O(n)   <br>

**Code:** [Java](https://github.com/cksanjay/DSA/blob/main/src/Java/stack/ValidParenthesis.java)

[Back to top](#questions)

## 7. Min Stack
**Question:** [Leetcode](https://leetcode.com/problems/min-stack/)

**Solution:** We can solve this by using 2 stacks - basicStack & minStack. basicStack is to store the values given and minStack is for retrieving the minimum number in contant time O(1).
- push : 
    - Always push the given element to basicStack. 
    - If the given element is lesser than the top-most element of minStack, then push it to minStack.
- pop: 
    - Always pop the element from basicStack.
    - If the popped element from basicStack is the last element in minStack. then pop.
- getMin: We are maintaining the minStack in such a way that the minimum number from the basicStack is always at the top of minStack. So with a simple peek() on minStack we can get the minimum number in constant time.
   <br>

**Time & Space Complexity:** O(1) & O(n)   <br>

**Code:** [Java]()

[Back to top](#questions)