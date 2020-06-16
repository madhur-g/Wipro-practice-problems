package addition_using_string;

public class add {

	public static void main(String[] args) {
		String input1 = "123456732128989543219"; 
		String input2 = "987612673489652"; 
		
		 if (input1.length() > input2.length()){ 
		        String t = input1; 
		        input1 = input2; 
		        input2 = t; 
		    }
		 String str = "";  
		 int n1 = input1.length(), n2 = input2.length();  
		    int diff = n2 - n1; 
		    int carry = 0;  
		    for (int i = n1 - 1; i>=0; i--)  
		    { 
		        int sum = ((int)(input1.charAt(i)-'0') +  
		            (int)(input2.charAt(i+diff)-'0') + carry);  
		        str += (char)(sum % 10 + '0');  
		        carry = sum / 10;  
		    }  
		    for (int i = n2 - n1 - 1; i >= 0; i--)  
		    {  
		        int sum = ((int)(input2.charAt(i) - '0') + carry);  
		        str += (char)(sum % 10 + '0');  
		        carry = sum / 10;  
		    }  
		  
		    
		    if (carry > 0)  
		        str += (char)(carry + '0');  

		    StringBuilder sb= new StringBuilder(str);
		   String res= sb.reverse().toString(); 
		    System.out.println(res);

	}

}
