package ArrayDemo;

class JaggedArray {
	static void PrintArray(int c[][]) {
	System.out.println("Array elemnts are");
		for (int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
}


public class JaggedArrayDemo {

	public static void main(String[] args) {

		int c [][]={ {12,13,24} , {13,23,14} , {42,43,44} , {52,53,54} };
		System.out.println("MultiD Array");
	

	}

}
}
