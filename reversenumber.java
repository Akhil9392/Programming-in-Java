import java.util.*;
public class reversenumber
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number:");
String num =sc.nextLine();
System.out.println("reverse number is");
for(int i=num.length();i>0;--i)
{
System.out.print(num.charAt(i-1));
}
}
}