package ex;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str=sc.nextLine();
	String[] s=str.split(" ");
	String s1="";
	for(int i=s.length-1;i>=0;i--){
		s1+=s[i]+" ";
	}
	System.out.print(s1);
	}
}
