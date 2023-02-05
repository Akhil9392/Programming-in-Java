import java.util.*;
public class sqnumrightangled
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the no. of rows:");
int n= sc.nextInt();
int s=0,p=0;
for(int i=1;i<n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(s+i+p+" ");
}
System.out.print("\n");
}
}
}