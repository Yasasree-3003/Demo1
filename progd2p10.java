class Rectangle{
int length;
int breadth;
void insert(int l,int b){
length=l;
breadth=b;
}
void display()
{
System.out.println("Area of Rectangle="+length*breadth);
}
}
class TestRectangle{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(3,8);
r2.insert(2,6);
r1.display();
r2.display();
}
}