package Scanner;
import java.util.Scanner;

public class PersonDemo {
	

	public static void main(String[] args) {
		
Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person name :");
		name= ob.next();
		System.out.println("Enter age :");
		int age =ob.nextInt();
		System.out.println("enter gender : ");
		String gender = ob.next();
		
		System.out.println("Enter mobile number ");
		long mobileNumber=ob.nextLong()	;
		System.out.println("Enter income ");
		int income =ob.nextInt();
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(mobileNumber);
		
		
		 
		System.out.println(person.getName() );
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getIncome());
		System.out.println(person.getMobileNumber());
		System.out.println(person.getTax());
		
		 
		System.out.println(person);
		
		System.out.println("After creating tax object ");
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After Calculation of tax :");
		
		
		System.out.println(person );

	}


	}


