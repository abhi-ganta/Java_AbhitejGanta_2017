//*********************************************************************************************************
//Author:Abhi Ganta
//Purpose:Design and write a program that computes a studentís grade in AP CS by using objects and methods.
//Period:1
//Date:11/2
//*********************************************************************************************************
import java.text.DecimalFormat;
import java.lang.*;
public class Student
{ //instance variables
  String firstName, lastName;
  double summativeAverage, formativeAverage, courseAvg;
  char letterGrade=0;
public Student(String n, String l,double s, double f)
 { //constructor
   firstName= n;
   lastName= l;
   summativeAverage= s;
   formativeAverage= f;
 }
public Student() //default student
{
  firstName= "John";
  lastName= "Doe";
  summativeAverage= 80.2;
  formativeAverage= 79.2;
}
public double calcCourseAvg()//calculates course average//accessor
{
  courseAvg=(.75*summativeAverage)+(.25*formativeAverage);
  return courseAvg;
}
public double calcClassAvg(Student s1, Student s2, Student s3, Student s4, Student s5, Student s6)
{
  return (s1.calcCourseAvg()+s2.calcCourseAvg()+s3.calcCourseAvg()+s4.calcCourseAvg()+s5.calcCourseAvg()+s6.calcCourseAvg())/6.0;
}
public char calcLetterGrade()//calculates letter grade;also a modifier
{
 if(Math.round(courseAvg) >= 90)
 {
   letterGrade= 'A';
 }
 else if(Math.round(courseAvg) >=80)
 {
   letterGrade= 'B';
 }
 else if(Math.round(courseAvg) >=70)
 {
   letterGrade= 'C';
 }
 else if(Math.round(courseAvg) < 70)
 {
   letterGrade= 'F';
 }
 Math.round(courseAvg);
 return letterGrade;
}
  public void setSumAvg(double sumAvg)//modifier
{
    summativeAverage = sumAvg;
  }
 public String toString()
 {
   DecimalFormat fmt= new DecimalFormat("###.00");
   return(firstName + "\t\t" + lastName + "\t\t" + summativeAverage + "\t\t\t" + formativeAverage +"\t\t\t"+fmt.format(calcCourseAvg())+ "\t\t  " +(calcLetterGrade()));
 }
}



  
