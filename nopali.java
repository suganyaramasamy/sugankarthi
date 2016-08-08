package ex;

public class Nopali {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int n=num;
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==num)
		{
			System.out.println("Palintrome");
		}
		System.out.println("Number Not Plalindrome.");
	}

}
