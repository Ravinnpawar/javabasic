//AutoBoxing or Boxing and UnBoxing.
public class BoxingUnExample {
	public static void main(String[] args) {
		int i=10;
		Integer a=new Integer(i);//Boxing
		
		Integer a2=new Integer(20);
		
		int i2=a2;// unboxing
		System.out.println("Boxing Premitive Data Type: "+i);
		System.out.println("Auto Boxing Wrapper class Data Type: "+a);
		
		System.out.println("UnBoxing Premitive Data Type: "+i2);
		
		System.out.println("AutoUnBoxing Premitive Data Type: "+a2);

	}

}
