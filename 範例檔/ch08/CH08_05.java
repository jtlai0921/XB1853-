// �p��ꭱ�n�����O��@
class Circle
{
    double pi=3.14;
    double radius;
   
    double area()
    {
        return (3.14159*radius*radius);
    }
}

public class CH08_05
{
    public static void main(String args[])
    {
        Circle obj=new Circle();
      
        obj.radius=3.0;
   
        System.out.println("�b�|="+obj.radius);
        System.out.println("�ꭱ�n="+obj.area());
    }
}