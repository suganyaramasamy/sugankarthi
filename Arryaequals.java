package guvi;

public class Aclass {

	 public static void main(String[] args) {
		 int arr[]={1,2,3};
		 for(int i=0;i<arr.length;i++){
				if(i+2<arr.length&&arr[i]+arr[i+1]==arr[i+2]){
					System.out.println("I Value is "+arr[i]);
					System.out.println("J Value is "+arr[i+1]);
					System.out.println("K Value is "+arr[i+2]);
				
					System.out.println(arr[i+2]);
					System.exit(0);
				}
			}
			System.out.println("No Such Expression Matched");
				
}
}
