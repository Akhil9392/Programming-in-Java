import java.util.*;
public class eligibleforvote
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the age:");
int age = sc.nextInt();
if(age>=18)
{
System.out.println("eligible for vote");
}
else
{
System.out.println("not eligible for vote");
}
int a=18-age;
if(age<18&&age>0)
System.out.println("no.of years left to be eligible for vote:"+a);
}
}

