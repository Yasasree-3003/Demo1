//initailising many obj through referene variable
class Student
{
int id;
String name;
}
class Teststudent2{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.id=3003;
s1.name="Yasasree";
s2.id=3008;
s2.name="Nadiya";
s3.id=505;
s3.name="Roshini";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
System.out.println(s3.id+" "+s3.name);
}
}

