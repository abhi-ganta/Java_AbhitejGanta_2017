 import java.util.Scanner;
 public class IdealWeight
 {
 //**********************************************************************
 //Author: Abhi Ganta
 //Date: September 6, 2014
 //Purpose: Calculates ideal weight based on a persons height and gender.
 //**********************************************************************
  public static void main(String[] args)
     {
       int heightFeet;
       int heightInches;
       int totalHeight;
       Scanner scan = new Scanner (System.in);
       System.out.println("What is your height in feet?");
       heightFeet= scan.nextInt();
       System.out.println("What is your height in inches?");
       heightInches= scan.nextInt();
       totalHeight= 12*heightFeet + (heightInches);
       int mweight;
       int fweight;
       fweight= 100 + 5*((heightFeet*12 + heightInches)-60);
       mweight= 106 + 6*((heightFeet*12 + heightInches)-60);
       System.out.println ("Ideal Female Weight: " + fweight);
       System.out.println ("Ideal Male Weight: " + mweight);
  }
 }