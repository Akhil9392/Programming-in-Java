import java.util.*;
public class reversestring
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the string:");
String str1 =sc.nextLine();
System.out.println("reverse string is");
for(int i=str1.length();i>0;--i)
{
System.out.print(str1.charAt(i-1));
}
}
}