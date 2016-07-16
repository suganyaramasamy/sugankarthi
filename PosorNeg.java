import java.util.*;
public class PosorNeg {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the nos:");
int a;
a=s.nextInt();
if(a>0)
{
	System.out.println("given no is +ve:"+a);
}
else if(a<0)
{
	System.out.println("given no is -Ve:"+a);
}
else if(a==0)
{
	System.out.println("given no neighter +Ve nor _ve:"+a);
}
else
{
	System.out.println("enter valid nos:");
}
	
	}

}
