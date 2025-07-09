package stringDemo;

public class ComparisonDemo {
	public static void main(String args[]) {
		String  s1 = "TNSIF";  //creating string using literals // pool memory
		String s2="TNSIF";
		
		String s3=new String("TNSIF");
		String s4 = new String("VAISH");
		
		//Create String operator // Heap memory
		
		//== /equals
		
		System.out.println("Case 1 :"+ (s1==s2));
		System.out.println("case 2 :"+ (s1==s3));
		System.out.println("case 3 :"+ (s2.equals(s1)));
		System.out.println("case 4 :"+ (s2.equals(s4)));
		System.out.println("case 5 :"+ (s3==s4));
		System.out.println("case 6 :"+ (s3.equals(s4)));
		
		
		
		// hashCode
		
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.compareTo(s4));
		
	}

}
