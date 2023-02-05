import java.util.*;
public class sumoffibonacciseries
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int d1=0,d2=1,d3,sum=0;
System.out.println("\n"+d1+"\n"+d2);
for(int i=2;i<=n;i++)
{
d3=d1+d2;
System.out.println(""+d3);
d1=d2;
d2=d3;
sum=sum+d2;
}
System.out.print("the sum is:"+sum);
}
}