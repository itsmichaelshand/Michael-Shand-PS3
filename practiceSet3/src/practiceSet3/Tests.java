package practiceSet3;

//Everything i needed to import
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Tests {
	
	//the two test cases i made to test all my methods
	Account Test1; 
	Account Test2;
		
	//had to set the test cases to the account constructor
	@Before
	public void setUp() throws Exception{
		Test1 = new Account(1122, 20000.0);
		Test2 = new Account(1000, 0);
	}
	
	/**
	 * my test case for withdraw and deposit
	 * its throws an exception if withdraw is greater than the balance
	 * @throws InsufficientFundsException
	 */
	@Test
	public void test() throws InsufficientFundsException{
		Test1.withdraw(2500);
		assertTrue(Test1.getBalance() == 17500.0);
		Test1.deposit(3000);
		assertTrue(Test1.getBalance() == 20500.0);
	}
	
	/**
	 * my test case for the InsufficientFundsException
	 * my test withdraws more than the account has so an exception is thrown
	 * @throws InsufficientFundsException
	 */
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		Test2.deposit(500.00);
		assertEquals("$400 Expected, actual is $500",(long)Test2.getBalance(),(long)500.00);
        Test2.withdraw(900);
	}

}
 