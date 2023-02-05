import java.util.*;
public class rightangledpyramid
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the number of rows you want");
int rows = s.nextInt();
System.out.println("enter the special character you want");
char ch = s.next().charAt(0);
for(int i=0;i<=rows;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(ch);
}
System.out.print("\n");
}
}
}