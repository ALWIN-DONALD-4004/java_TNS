package com.tns.AssignmentFour;

public final class Transaction {
	
	 private final String transactionType;
	 private final float amount;
	 private final int transactionfee = 60;

	 public Transaction(String transactionType, float amount) {
	        this.transactionType = transactionType;
	        this.amount = amount;
	    }
	 

	    // Method to perform the transaction
	  public void performTransaction(Account account) {
	        switch (transactionType.toLowerCase()) {
	            case "deposit":
	                account.deposit(amount-transactionfee);
	                break;
	            case "withdraw":
	                account.withdraw(amount);
	                break;
	            default:
	                System.out.println("Invalid transaction type");
	        }
	    }
	  

	    // Final method to display transaction details
	    public final void displayTransaction() {
	        System.out.println("Transaction Type: " + transactionType);
	        System.out.println("Amount: " + amount);
	      
	        
	    }

}
