package code.test.viji;

public class Unary4 {
	public static void main(String args[])
	{
		
		int num = 20;
		System.out.println("The value of num is: "+num);
		
		int result = +num;
		System.out.println("The value of result  after unary  plus is: "+result);
		
		result = -num;
		System.out.println("The value of result after minus is: "+result);
		
		result = ++num; //(num = num + 1)
		System.out.println("The value of pre-increment num* is: "+num);
		System.out.println("The values of result after Pre-incrememt is: "+result);
		
		result = num++; // num, (num + 1)
		System.out.println("The value of post-increment num* is: "+num);
		System.out.println("The value of result after post-increment is: "+result);
		
		result = --num;
		System.out.println("The value of pre-decrement num* is: "+num);
		System.out.println("The value of result after pre-decrement is: "+result);
		
		result = num--; // num, (num - 1)
		System.out.println("The value of result after post-decrement is: "+result);
		System.out.println("The value of num after post-decrement is : "+num);
		
		result = num++;
		
		System.out.println("The value of post-increment result is: "+result);
		
		System.out.println("The value of post-increment num is: "+num);
		
		result = ++num;
		
		System.out.println("The value of pre-increment result is: "+result);
		System.out.println("The value of pre-increment num is: "+num);
		
	}

}
