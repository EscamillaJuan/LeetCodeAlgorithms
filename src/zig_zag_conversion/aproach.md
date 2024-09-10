## Zig zag conversion

### Description

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

Example:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Description provided by LeetCode.

### Approach

To solve this problem, an algorithm with O(n) complexity was implemented.

First, we iterate through the array of strings based on the number of rows provided, creating empty rows during this iteration. In a subsequent loop, we traverse the entire string, adding characters to the appropriate rows. To do this correctly, we use a variable to track the row index. This index increases with each iteration of the loop and, when the maximum row is reached, the direction is reversed to start decreasing the index. Once all rows are built, we concatenate them to form the final string in the desired order.
