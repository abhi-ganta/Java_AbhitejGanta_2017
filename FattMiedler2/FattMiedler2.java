import java.util.Scanner;
import javax.swing.*;
public class FattMiedler2
{
  public static void main (String[] args)
  {
    String fullName, fullName2;
    int indexSpace;
    Scanner scan= new Scanner (System.in);
    System.out.println(" What's your Full Name?");
    fullName= scan.nextLine();
    indexSpace= fullName.indexOf(" ");
    if(indexSpace==0)
    {
      System.out.println();
    }
    else
    {
     JOptionPane.showMessageDialog(null, "You entered an invalid name. Please try again.", "Error!", 1);
    }
    
     fullName2= fullName.substring(indexSpace + 1, indexSpace + 2) +fullName.substring(1,indexSpace)+ " "+fullName.substring(0,1)+fullName.substring(indexSpace +2);
    System.out.println("Your new name is: " + fullName2);
}
}


    