class Employee{
int id;
String name;
String dept;
void insert(int a,String b,String c){
id=a;
name=b;
dept=c;
}
void display(){
System.out.println(id+" "+name+" "+dept);
}
}
class TestEmployee
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(3003,"Yasasree","AI&DS");
e2.insert(3008,"Nadiya","AI&DS");
e3.insert(3026,"Chandana","AI&DS");
e1.display();
e2.display();
e3.display();
}
}