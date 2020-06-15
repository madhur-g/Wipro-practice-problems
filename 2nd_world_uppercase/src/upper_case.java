
public class upper_case {

	public static void main(String[] args) {
		String s="Wipro tech"; //s=input1
		String[] sp=s.split(" ");
		if(sp.length<=1) {
			System.out.println("LESS");
		}
		else
			System.out.println(sp[1].toUpperCase());

	}

}
