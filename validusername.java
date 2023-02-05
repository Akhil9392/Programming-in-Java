import java.util.*;
public class validusername
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the username:");
String str1= sc.nextLine();
if(ValidUsername(str1))
{
System.out.println("valid username");
}
else
{
System.out.println("invalid username");
}
}
public static boolean ValidUsername(String username)
{
return(username.length()>8&&username.matches("[a-zA-Z0-9]"));
}
}