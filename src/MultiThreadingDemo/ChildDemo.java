package MultiThreadingDemo;

public class ChildDemo {
	public static void main (String []args) {
		ChildThread c= new ChildThread(10, " Hii Vaish");
		
		c.start();
	}

}
