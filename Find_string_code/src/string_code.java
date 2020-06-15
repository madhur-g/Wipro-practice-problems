
public class string_code {

	public static void main(String[] args) {
		String s="WORLD WIDE WEB";
		StringBuffer sb=new StringBuffer();
		int sum=0;
		String[] st=s.split(" ");
		for(int i=0;i<=st.length-1;i++) {
			String temp=st[i].toLowerCase();
			
			for(int j=0;j<temp.length()/2;j++) {
				int x=(temp.charAt(j)-'a')-(temp.charAt(temp.length()-1-j)-'a');
				sum+=Math.abs(x);
				 
			}
			if(temp.length()%2!=0) {
				sum+=temp.charAt(temp.length()/2)-'a'+1;
			}
			sb.append(sum);
		}
 System.out.println(sb);
	}

}
