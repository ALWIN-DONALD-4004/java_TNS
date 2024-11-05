package project2.Tax;

public class TaxCalc {
    
    public void calculateTax(User u1) {
    	
      //  int Amount = u1.getIncome();
        String Gender = u1.getGender();
        
        if (Gender.equals("female")){  
            u1.setTax(0); 
        } else {
            u1.setTax(1000); 
        }
    }
}

