class Circle{
int radius;
void insert(int r){
radius=r;
}
void display()
{
System.out.println("Area of Circle="+3.14*radius*radius);
System.out.println("perimeter of Circle="+2*3.14*radius);
}
}
class TestCircle{
public static void main(String args[])
{
Circle r1=new Circle();
Circle r2=new Circle();
r1.insert(10);
r2.insert(20);
r1.display();
r2.display();
}
}