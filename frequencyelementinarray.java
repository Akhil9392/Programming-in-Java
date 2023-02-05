import java.util.*;
public class frequencyelementinarray
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of elements you want:");
int n=sc.nextInt();
int a[]=new int[30];
for(int i=1;i<=n;i++)
{
a[i]=sc.nextInt();
}
int b[]=new int[30];
int visited=-1;
for(int i=1;i<=n;i++)
{
int count=1;
for(int j=i+1;j<=n;j++)
{
if(a[i]==a[j])
{
count++;
if(b[j]!=visited);
}
}
if(b[i]!=visited)
b[i]=count;
}
System.out.println("----------------------------------------------------------");
System.out.println("      element        |        frequency        ");
System.out.println("----------------------------------------------------------");
for(int i=1;i<=n;i++)
{
System.out.println("    "+a[i]+"        "+"        "+b[i]+"        ");
}
}
}