package Milestoneproblems;

public class CyclicMultiple {
	public static void main(String[] args) {
		int num=123;
		int temp=num;
		while(num>0)
	{
		int a=num%10;
		temp*=a;
		num=num/10;
	
	}
	System.out.println(temp);
	}

}
