package most_freq_digit;

import java.util.HashMap;

public class freq {

	public static void main(String[] args) {
		int n=123;
		int n1=764;
		int n2=246;
		int n3=105;
		StringBuilder sb=new StringBuilder();
		int freq[]=new int[10];
		sb.append(n);
		sb.append(n1);
		sb.append(n2);
		sb.append(n3);
		for(int j=0;j<sb.length();j++){
	        freq[Integer.parseInt(Character.toString(sb.charAt(j)))]++;
	        }
	        int maxFreqIndex = 0;
			int maxFreq = 0;
	        
	        for(int i=0;i<9;i++){
	          if (freq[i] >= maxFreq) {
					maxFreqIndex = i;
					maxFreq = freq[i];
				}
	        }
	        System.out.println(maxFreqIndex);
		/*String s=String.valueOf(n);
		String s1=String.valueOf(n1);
		String s2=String.valueOf(n2);
		String s3=String.valueOf(n3);
		String st=s+s1+s2+s3;
		long num=Long.parseLong(st);
		System.out.println(st);
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=st.length()-1;i>=0;i--) {
			//System.out.println(st.charAt(i));
			if(hm.containsKey(st.charAt(i))) {
				int count=hm.get(st.charAt(i));
				//System.out.println("count= "+count);
				hm.put(st.charAt(i),++count );
			}
			else {
				hm.put(st.charAt(i), 1);
			}
			
		}
		for();*/
	}

}
