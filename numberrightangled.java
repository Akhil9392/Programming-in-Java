import java.util.*;
public class numberrightangled
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the no. of rows:");
int n= sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(i);
}
System.out.print("\n");
}
}
}