package get_code_through_strings;

public class code {

	public static void main(String[] args) {
		String input1="Wipro Technologies";
		//String input1="The Good The bad and the ugly";
		String[] s1=input1.split(" ");
		String res="";
		int sum=0;
		for(int i=0;i<s1.length;i++) {
			res+=s1[i].length();
		}
		int num=Integer.parseInt(res);
		while(num>0 || sum>9) {
			if (num == 0) { 
                num = sum; 
                sum = 0; 
            } 
			 sum += num % 10; 
	            num /= 10; 
		}
		System.out.println(sum);
		}

	}


