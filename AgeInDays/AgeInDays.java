import java.util.*;
public class AgeInDays
{
  public static void main(String[] args)
  {
    int year, month, day, days=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("What month were you born in?(Enter number)");
    month= scan.nextInt();
    System.out.println("How old are you?");
    year= scan.nextInt();
    System.out.println("What date were you born on?");
    day= scan.nextInt();
    if(month==1)
    {
      days=(year*365)+(month*31)+(day);
    }
    if(month==3)
    {
      days=(year*365)+(month*31)+(day);
    }
    if(month==5)
    {
      days=(year*365)+(month*31)+(day);
    }
    if(month==7)
    {
      days=(year*365)+(month*31)+(day);
    }
    if(month==8)
    {
      days=(year*365)+(month*31)+(day);
    }
    if(month==10)
    {
      days=(year*365)+(month*31)+(day);
    }  
    if(month==12)
    {
      days=(year*365)+(month*31)+(day);
    }
    if(month==4)
    {
      days=(year*365)+(month*30)+(day);
    }
    if(month==6)
    {
      days=(year*365)+(month*30)+(day);
    }
    if(month==9)
    {
      days=(year*365)+(month*30)+(day);
    }
    if(month==11)
    {
      days=(year*365)+(month*30)+(day);
    }
    if(month==2)
    {
       days=(year*365)+(month*28)+(day);
    }
    if(year%400==0)
    {
      if(month==2)
      {
        days=(year*365)+(month*29)+(day);
      }
    }
    System.out.println("Your age in days is: " +days);
 }
}