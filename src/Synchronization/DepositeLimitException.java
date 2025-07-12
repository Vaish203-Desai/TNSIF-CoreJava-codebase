package Synchronization;


	public class DepositeLimitException extends Exception {

		public DepositeLimitException()
		{
			super("Daily Limit of deposit is exceed.....");
		}
		public DepositeLimitException(String message )
		{
			super (message);
		}

	}

