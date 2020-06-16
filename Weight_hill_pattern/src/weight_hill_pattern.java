
public class weight_hill_pattern {

	public static void main(String[] args) {
		int x=4; //input1=x
		int y=1; //input2=y
		int z=5; //input3=z
		int res=y;
		int a=y+z;
		int smp=0;
		int count=2;
		for(int i=0;i<x-1;i++) {
			smp=a*count;
			a+=z;
			count++;
			
			res+=smp;
		}
		
		System.out.println("res= "+res);
	}

}
