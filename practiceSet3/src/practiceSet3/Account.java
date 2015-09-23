/**
 * @author Michael Shand
 * PracticeSet3
 */

package practiceSet3;

//everything i needed to import
import java.util.Date;
import java.util.Scanner;

public class Account {
	
	//main method
	public static void main(String[] args) throws InsufficientFundsException{
		//these are created just to make an example in the class itself before i tested them
		Account acc = new Account();
		//sets the balance so i can give a quick example
		acc.setBalance(20000);
		acc.withdraw(2500);
		acc.deposit(3000);
	}
	
	//All the private integers i needed
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//needed this so that i could use non-static methods in my main
	public Account(){
		//no-args constructor
	}
	
	//my constructor of Account with the proper parameters
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	//the monthly interest rate method
	public double monthlyInterestRate(){
		double monthlyInterestRate;
		monthlyInterestRate = (annualInterestRate / 12);
		return monthlyInterestRate;
	}

	/**
	 * my with draw method
	 * takes in a double which is the amount you are withdrawing from the account
	 * its throws the exception in-case you try to withdraw more than you have
	 * @param withdraw
	 * @throws InsufficientFundsException
	 */
	public void withdraw(double withdraw) throws InsufficientFundsException{
		//if the withdraw amount is in the range of the balance, it just displays the balance
		if(this.balance - withdraw >= 0){
		this.balance = this.balance - withdraw;
		}
		//if the withdraw amount exceeds the balance an exception is thrown
		else{
			throw new InsufficientFundsException(withdraw - getBalance());
		}
		//prints the balance after money is withdrawn
		System.out.println("Your balance after withdrawing " + withdraw + " dollars is " + this.balance + " dollars.");
	}
	
	/**
	 * my deposit method
	 * @param deposit
	 */
	public void deposit(double deposit){
		this.balance = this.balance + deposit;
		//prints out the amount in your account after money is deposited
		System.out.println("Your balance after depositing " + deposit + " dollars is " + this.balance + " dollars.");
	}
	
	
	//All my getters and setters for my variables
	
	public Date getDateCreated(){
		return dateCreated;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

}
