
public class string_weight {

	public static void main(String[] args) {
		String s="Hello World"; //s=input1
		int n=0;
		int res=0;
		
		
		if(n==0) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				
				}
				else {
					if(Character.isUpperCase(s.charAt(i))) {
						res+=s.charAt(i)-64;
					}
					else if(Character.isLowerCase(s.charAt(i))) {
						res+=s.charAt(i)-96;
					}
					
				}
			}
			System.out.println(res);
		}
		else if(n==1) {
			for(int i=0;i<s.length();i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					res+=s.charAt(i)-64;
				}
				else if(Character.isLowerCase(s.charAt(i))) {
					res+=s.charAt(i)-96;
				}
			}
			System.out.println(res);
		}

	}

}
