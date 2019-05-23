// Program to segragate the 
// array of 0s, 1s and 2s 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
class GFG { 
    public static void main(String[] args) 
    { 
        // Using Scanner class to take input 
        Scanner sc = new Scanner(System.in); 
  
        // Number of testcase input 
        int t = sc.nextInt(); 
  
        // Iterating through all the testcases 
        while (t-- > 0) { 
  
            // Input n, i.e. size of array 
            int n = sc.nextInt(); 
  
            int arr[] = new int[n]; 
  
            // Taking input of array elements 
            for (int i = 0; i < n; i++) 
                arr[i] = sc.nextInt(); 
  
            // Calling function to segragate 
            // input array 
            segragateArr(arr, n); 
  
            // printing the modified array 
            for (int i = 0; i < n; i++) { 
                System.out.print(arr[i] + " "); 
            } 
  
            System.out.println(); 
        } 
        sc.close(); 
    } 
  
    // Function to segragate 0s, 1s and 2s 
    public static void segragateArr(int arr[], int n) 
    { 
        /* 
        low : to keep left index 
        high : to keep right index 
        mid : to get middle element 
        */
        int low = 0, high = n - 1, mid = 0; 
  
        // Iterating through the array and 
        // segregating elements 
        while (mid <= high) { 
  
            // If element at mid is 0 
            // move it to left 
            if (arr[mid] == 0) { 
                int temp = arr[low]; 
                arr[low] = arr[mid]; 
                arr[mid] = temp; 
                low++; 
                mid++; 
            } 
  
            // If element at mid is 1 
            // nothing to do 
            else if (arr[mid] == 1) { 
                mid++; 
            } 
  
            // If element at mid is 2 
            // move it to last 
            else { 
                int temp = arr[mid]; 
                arr[mid] = arr[high]; 
                arr[high] = temp; 
                high--; 
            } 
        } 
    } 
} 