package GuviDemo;

import java.util.Scanner;

public class DiviteAvg {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter Number of elements in array");
	int len=scr.nextInt();
	int[] arr=new int[len];
	int length1=len/2;
	int val1=0,val2=0;
	float avg1,avg2;
	System.out.println("Enter Values");
	for(int i=0;i<len;i++){
		arr[i]=scr.nextInt();
		if(i>=length1)
		val2+=arr[i];
		else
			val1+=arr[i];
	}



   avg1=val1/length1;
avg2=val2/(len-length1);
if(avg1==avg2)
	System.out.println("success");
	else
		System.out.println("Not Possible");
}
}
