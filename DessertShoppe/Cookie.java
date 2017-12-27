//**********************************************************
//Author: Abhi Ganta
//Date: 2/19/15
//Purpose: Print a receipt of dessert items someone ordered
//**********************************************************
public class Cookie extends DessertItem
{
  int number;
  int priceper12;
  
  public Cookie(String name, int numb, int pp12)
  {
   super(name); 
   number = numb;
   priceper12 = pp12;
  }
  
  public int getCost()
  {
    int cost = (int)(Math.round(number * priceper12/12));
    return cost;
  }
  public String toString()
  {
    return number + " @ " + DessertShoppe.cents2dollarsAndCents(priceper12) + " /dz"+ "\n"+ name + "\t" +DessertShoppe.cents2dollarsAndCents((number * priceper12)/12)+"\n";
  }
}
  