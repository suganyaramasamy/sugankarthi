package ex;

import java.util.Scanner;

public class Plalin {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter the String.");
	String s=sn.nextLine();
	String s1=sn.nextLine();
	int len=s.length();
	int len1=s1.length();
	if(len>len1)
	{
		System.out.println(len);
	}
	else
	{
		System.out.println(len1);
	}
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.length()==s1.length())
		{
			System.out.println(" String is palindrome palindrome");
		}
	}
	System.out.println("String is not Plaindrome.");
	
			
	
}
}
