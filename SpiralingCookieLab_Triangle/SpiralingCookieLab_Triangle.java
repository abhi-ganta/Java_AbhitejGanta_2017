import java.util.*;
import java.util.*;
public class SpiralingCookieLab_Triangle
{
  public static void main (String[] args)
  {
    Scanner scan= new Scanner(System.in);
    double base,height,area;
    System.out.println("What is the base of your triangle in feet?");
    base= scan.nextDouble();
    System.out.println("What is the height of your triangle in feet?");
    height= scan.nextDouble();
    area= (1/2*base*height);
    System.out.println("The area of your triangle is: " +area+ " feet squared");
  }
}