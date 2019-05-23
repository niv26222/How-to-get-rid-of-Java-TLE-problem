# How to get rid of Java TLE problem




It happens many times that you have written correct Java code with as much optimization as needed according to the constraints. But, you get TLE 😢.
This happens due to the time taken by Java to take input and write output using Scanner class which is slow as compared to BufferedReader and StringBuffer class. Read in detail about Scanner Class here.

Have a look at some tips to get rid of this TLE issue (when your logic is correct obviously)?

Tip 1 : Avoid using Scanner Class and try to use BufferedReader class.
Tip 2 : Try to use StringBuffer class in case you have to print large number of data.

Let’s take a problem from GeeksforGeeks practice and solve the TLE issue:
Problem : Segragate an Array of 0s, 1s and 2s
In short, problem is, given an array of 0s, 1s and 2s. We have to segregate all the 0s in starting of array, all the 1s in mid of the array, and all the 2s in last of the array.
Examples:

Input : 1 1 2 0 0 2 1
Output : 0 0 1 1 1 2 2


Approach : Segregate array of 0s, 1s and 2s



implementation is in the script.
