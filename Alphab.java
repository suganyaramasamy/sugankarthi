package GuviDemo;

import java.util.Scanner;

public class Alpha {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
				System.out.println("enter the letter.");
				char cha=s.next().charAt(0);
		if(cha>='a'&&cha<='z'||cha>='A'&&cha<='Z')
		{
			System.out.println("Given letter is Alphapets."+cha);
		}
		else
		{
			System.out.println("Given is not a alphabets.");
		}
	}

}
