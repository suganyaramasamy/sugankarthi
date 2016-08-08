package ex;

import java.util.Scanner;

public class B1pow {
public static void main(String[] args) {
	int a,n;
	Scanner sn =new Scanner(System.in);
	n=sn.nextInt();
	int ans=0;
while(n>0)
	{
		a=n%10;
		int n1=n/10;
		int b=n1%10;
		n=n1;
		ans=(int) (ans+Math.pow(a, b));
	
	}
	System.out.println(ans);
}
}
