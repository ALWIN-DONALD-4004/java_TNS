package com.tns.AssignmentFour;

public class TransactionExecuter {

	public static void main(String[] args) {

		// Create a SavingsAccount and perform transactions
        SavingsAccount savings = new SavingsAccount(1000);
        Transaction depositTransaction = new Transaction("deposit", 500);
        Transaction withdrawTransaction = new Transaction("withdraw", 30);
        depositTransaction.performTransaction(savings);
        depositTransaction.displayTransaction();
        savings.show();
        
        
        System.out.println();
        
        withdrawTransaction.performTransaction(savings);
        withdrawTransaction.displayTransaction();
        savings.show();
        
        

	}

}
