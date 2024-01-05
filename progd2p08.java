//initializing through method
class Student{
int rollno;
String name;
void insert(int a,String b){
rollno=a;
name=b;
}
void display(){
System.out.println(rollno+" "+name);
}
}
class Teststudent3
{
public static void main(String args[])
{
Student n1=new Student();
Student n2=new Student();
n1.insert(3003,"Yasasree");
n2.insert(3008,"Nadiya");
n1.display();
n2.display();
}
}