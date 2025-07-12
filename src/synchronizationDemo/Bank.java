package synchronizationDemo;

import Synchronization.DepositeLimitException;
import Synchronization.InsufficientBalance;

public interface Bank {
	
	static final int MINBAl=5000;
	static final int DAILY_LIMIT=25000;
	void deposit (int amt) throws DepositeLimitException;
	void withdraw(int amt) throws InsufficientBalance;
}


