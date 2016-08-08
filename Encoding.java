package ex;

public class StringEncription {
	public static void main(String[] args) {
		String a="Bcda";
		int len=a.length();
		
		char c[]=new char[len];
		int []flag=new int[len];
		for(int i=0;i<len;i++)
		{
			c[i]=a.charAt(i);
			if(c[i]>=65&&c[i]<=90)
			{
				flag[i]=1;
			}
		}
		char key='\0';
		for(int i=len-1;i>=0;i--)
		{
			if(c[i]>=65&&c[i]<=90||c[i]>=95&&c[i]<=122)
			{
				key=c[i];
				break;
			}
		}
		int keyval=key-96;
		for(int i=0;i<len;i++)
		{
			if(c[i]>=65&&c[i]<=90||c[i]>=97&&c[i]<=122)
			{
				char ch=Character.toLowerCase(c[i]);
				c[i]=(char)(ch+keyval);
			}
				if(c[i]>=123)
				{
					c[i]=(char)(c[i]-26);
					
				}if(flag[i]==1)
				{
					c[i]=(char)(c[i]-32);
					
				}
			
		System.out.print(c[i]);
		}
		}
	}

