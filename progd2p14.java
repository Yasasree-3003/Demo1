import java.io.*;
import java.util.*;
class Demo12{
static public void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Demo12.printMonth(inpVar));
}
public static String printMonth(int Monthno){
String Month;
switch(Monthno){
case 0:{Month="JANUARY";break;}
case 1:{Month="FEB";break;}
case 2:{Month="MARCH";break;}
case 3:{Month="APRIL";break;}
case 4:{Month="MAY";break;}
case 5:{Month="JUNE";break;}
case 6:{Month="JULY";break;}
case 7:{Month="AUGUST";break;}
case 8:{Month="SEPTEMBER";break;}
case 9:{Month="OCTOBER";break;}
case 10:{Month="NOVEMBER";break;}
case 11:{Month="DECEMBER";break;}
default:Month="INVALID";
}
return Month;
]
}
}
