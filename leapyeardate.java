import java.util.*;
public class leapyeardate
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the date");
int date=sc.nextInt();
System.out.println("enter the month");
int month=sc.nextInt();
System.out.println("enter the year");
int year=sc.nextInt();
System.out.println("you entered date is: "+date+"/"+month+"/"+year);
if(year%4==0)
{
System.out.println("given date is leap year");
}
else
{
System.out.println("given date is non leap year");
}
}
}