import java.util.Scanner;
class Test7{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
{
if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
System.out.println("YES");
else
System.out.println("NO");
}
else
System.out.println("NO");
}
}
}

