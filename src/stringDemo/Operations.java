package stringDemo;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch [] = {'I','N','D','I','A'};
		String str =new String(ch);
		System.out.println(str);
		
		String s1=new String("Vaishnavi Desai");
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.trim());
		String s3=s1.substring(1,6);
		System.out.println(s3);
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
		
		
		s2=new String(s1);
		
		//equals-->DATA Memory
		//== -> check object refernce checks memory
		//= -> checks the data not memory
		System.out.println("Case 1 :"+s1.equals(s2));
		System.out.println("Case 2 :"+ s1==s2);
	
		

	}

}
