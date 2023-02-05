import java.util.*;
public class strtoint
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the string:");
String str1=sc.nextLine();
int result = Integer.parseInt(str1);
System.out.println("the integer value is"+result);
}
}