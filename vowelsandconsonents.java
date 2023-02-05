import java.util.*;
public class vowelsandconsonents
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str1= sc.nextLine();
int vowels=0,consonents=0;
String str=str1.toLowerCase();
for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if(i=='a'||i=='e'||i=='o'||i=='u')
{
++vowels;
System.out.print("vowels is:"+ch+"\n");
}
if(i!='a'||i!='e'||i!='o'||i!='u')
{
++consonents;
System.out.print("consonents is:"+ch+"\n");
}
}
}
}