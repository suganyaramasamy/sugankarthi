public class Prefix {

		 public static void main(String[] args){
		    String s1 ="welcome to ksrce";
		    String s2 = "welcome to ksrce cse";
		    int minStrLen = s1.length();
		    if ( minStrLen > s2.length()){
		        minStrLen = s2.length();
		    }

		    StringBuilder output = new StringBuilder();
		    for(int i=0; i<minStrLen; i++){
		        if ( s1.charAt(i) ==  s2.charAt(i)){
		         output.append(s1.charAt(i));
		        }else{
		          break;
		        }
		    }       
		    System.out.println(output.toString());
		  }}
