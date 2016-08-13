package GuviDemo;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("enter the number.");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int a=0;
		int length=4;
		int len=0;
		while(num>0)
		{
		 a=num%10;
		 len= (int ) (len+Math.pow(a, length) ) ;
		 num=num/10;
		 
		 
	}
		System.out.println(len);

}
}
