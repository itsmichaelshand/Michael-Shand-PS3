package practiceSet3;

import java.io.*;
/**
 * Custom class for throwing an insufficient funds exception
 * @author Dad
 *
 */
public class InsufficientFundsException extends Exception
{
   private double amount;
   /**
    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
    * @param amount
    */
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
      System.out.printf("You are trying to withdraw %f dollars more than you have", amount);
      System.out.println();
   } 
   public double getAmount()
   {
      return amount;
   }
}