import java.util.Scanner;
class If_Else_example1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=s.nextInt();
int j=s.nextInt();
if(j==0)System.out.println("Division by error");
else System.out.println(i+" divided by "+j+" is "+(i/j));
i=i+j;
}
}