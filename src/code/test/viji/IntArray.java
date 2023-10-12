package code.test.viji;

public class IntArray {
static int arr[] = {26,78,35,89,124,90};
static int sum()

{
    int sum = 0;
	int i;
	for (i = 0;i<arr.length;i++)
		sum += arr[i];
	return sum;	 
  
  
}
 public static void main(String args[])
 {
	 System.out.println("Sum of array is "+sum());
 }	
 }

	

