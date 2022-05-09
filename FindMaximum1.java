// Java program for the above approach
import java.io.*;
import java.util.Arrays;
class FindMaximum1 {
    /* For a given array arr[], 
        returns the maximum j-i such
       that arr[j] > arr[i] */
    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff = -1;
        int i, j;

        for (i = 0; i < n; ++i) {
			System.out.println();
			System.out.println("****arr["+i+"]="+arr[i]);
            for (j = n - 1; j > i; --j) {
				
				
					System.out.print("  arr["+j+"]="+arr[j]);
                if (arr[j] > arr[i] && maxDiff < (j - i)){
                    maxDiff = j - i;
					System.out.print("  StepmaxDiff="+maxDiff);
					}
            }
			System.out.print("  maxDiff="+maxDiff);
        }
			System.out.println();
        return maxDiff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        FindMaximum1 max = new FindMaximum1();
        int arr[] = { 9, 2, 3, 4, 5, 6, 18, 8, 7, 0 };
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------------");
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println("maxIndexDiff:"+maxDiff);
    }
}