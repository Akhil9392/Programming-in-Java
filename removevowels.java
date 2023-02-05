import java.util.*;
public class removevowels 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str= sc.nextLine();
str = str.replaceAll("[AaEeIiOoUu]", "");
System.out.println(str);
}
}