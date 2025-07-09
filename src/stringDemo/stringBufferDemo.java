package stringDemo;

public class stringBufferDemo {
	
	public static void main(String []args) {
		
		StringBuffer buffer =new StringBuffer();
				System.out.println(buffer);
		System.out.println(((CharSequence) buffer).length());
		System.out.println(buffer.capacity());
	}


}
