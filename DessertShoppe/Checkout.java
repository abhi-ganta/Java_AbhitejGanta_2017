//**********************************************************
//Author: Abhi Ganta
//Date: 2/19/15
//Purpose: Print a receipt of dessert items someone ordered
//**********************************************************
//Students must fully comment this code, verify it works, and complete the missing sections

public class Checkout {
    
    private int numItems = 0;
    private DessertItem[] desserts = new DessertItem[100];
    
    public Checkout()
    {
        
    }
    
    
    public void enterItem(DessertItem item)
    {
        desserts[numItems] = item;
        numItems++;
    }
    
    
    public void clear()
    {
        for(int i = 0; i < numItems; i++)
        {
            desserts[i] = null;
        }
        numItems = 0;
    }
    
    public int numberOfItems() {
      return numItems;
    }
    
    public int totalCost(){
      //compute total cost here. Itererate throu the desserts[] array and return the total cost.
    int total = 0;
      for(int i = 0; i< desserts.length;i++)
      {
        total = desserts[i].getCost();
      }
      return total;
    }
    
    public double totalTax(){
      //compute and return the totalTax here. Be sure to use the final variable that indicates the tax rate
      return (this.totalCost() * DessertShoppe.TAX_RATE)/100;
    }
    
    public String toString()
    {
        String output = "";
        output += DessertShoppe.STORE_NAME + "\n";
        output += "--------------------\n";
        output += "Number of Items: " + numItems + "\n\n";
        
        int preCost = 0;
        for(int i=0; i < numItems; i++)
        {
          // concatenate to "output" the desserts[i] element and
          // add to preCost the cost of each dessert item.
          output+=desserts[i].toString();
          preCost += desserts[i].getCost();
        }
        output += "\n";
        
        String preTax = DessertShoppe.cents2dollarsAndCents(preCost);
        output += "Subtotal     ";
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - 8 - preTax.length(); i++)
        {
            output += " ";
        }
        output += preTax + "\n";
        
        output += "Tax     ";
        int tax = (int)Math.round(preCost * DessertShoppe.TAX_RATE/100.0);
        String taxS = DessertShoppe.cents2dollarsAndCents(tax);
        
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - 3 - taxS.length(); i++)
        {
            output += " ";
        }
        output += taxS + "\n";
        
        output += "Total     ";
        int total = preCost + tax;
        String totalS = DessertShoppe.cents2dollarsAndCents(total);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - 5 - totalS.length(); i++)
        {
            output += " ";
        }
        output += totalS + "\n";
        return output;
    }
    
}
