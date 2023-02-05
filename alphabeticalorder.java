import java.util.*;
public class alphabeticalorder
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no. of names you want to enter");
int n =sc.nextInt();
String names[] = new String[30];
Scanner sca =new Scanner(System.in);
for(int i=0;i<n;i++)
{
names[i]=sca.nextLine();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(names[i].compareTo(names[j])>0)
{
String temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.println("order is:");
for(int i=0;i<n-1;i++)
{
System.out.print(names[i]+"\n");
}
System.out.print(names[n-1]);
}
}