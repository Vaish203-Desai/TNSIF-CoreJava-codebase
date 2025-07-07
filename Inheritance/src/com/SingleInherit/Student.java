package com.SingleInherit;

public class Student extends Citizen {
	
	//data members
		private int rollNo;
		private String collegeName;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, String adharNo, String address, long phone,int rollNo, String collegeName) {
			super(name, adharNo, address, phone);
			// TODO Auto-generated constructor stub
		}
		public Student(int rollNo, String collegeName) {
			super();
			this.rollNo = rollNo;
			this.collegeName = collegeName;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
					+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
					+ "]";
		}
		
		
		

}
