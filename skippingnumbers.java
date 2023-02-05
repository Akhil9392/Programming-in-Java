import java.util.*;
public class skippingnumbers
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the starting range(m):");
int m = sc.nextInt();
System.out.println("enter the ending range(n):");
int n = sc.nextInt();
System.out.println("enter the no.of skips you want");
int k = sc.nextInt();
int a=0;
for(int i=m;i<=n;i++)
{
	int a =i+k+1;
}
System.out.print(a(i));
}
}
