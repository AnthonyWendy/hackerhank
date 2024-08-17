#### Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix `arr` is shown below:
 
#### Example

|`1 2 3`| <br>
|`4 5 6`| <br>
|`9 8 9`| <br>

The left-to-right diagonal = `1 + 5 + 9 = 15`. The right to left diagonal = `3 + 5 + 9 = 17`. Their absolute difference is `|15 + 17| = 2`.  

##### Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

- <i>int arr[n][m]:</i> an array of integers
##### Returns

<i>int:</i> the absolute diagonal difference.
##### Input Format
The first line contains a single integer,<i>n</i> , the number of integers in the array.
The second line contains <i>n</i> space-separated integers that describe the values in <i>a</i>.