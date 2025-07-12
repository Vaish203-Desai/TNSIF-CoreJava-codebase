package Synchronization;


	public class Account implements Bank  {

		//data members 
		private int accNo;
		private String name;
		private double balance;

		//getter and setter 
		public int getAccNo() {
			return accNo;
		}

		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		//to string
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
		}

		//default constructor
		
		public Account(int i, String string, int j) {
			super();
		}
		
	//para constructor 
		public Account(int accNo, String name, double balance) {
			super();
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		}

		public void deposit(int amt) throws DepositeLimitException {
		if(amt>25000)
			throw new DepositeLimitException("Daily Limit exceed .....");
		else
		{
			balance+=amt;
			System.out.println("Amount Deposited....."+amt);
		}
		}

		public synchronized void  withdraw(int amt) throws InsufficientBalance {
			
		if (balance - amt < amt)
			throw new InsufficientBalance();
		else
		{
			balance=balance-amt;
			System.out.println("After withdrawing Rs:"+
			amt +" Current balance is Rs:"+balance);
		}
		}
	}
	

	

