import java.util.*;
class ParentClass
{
    public void M1()
    {
        System.out.println("Parent class method");
    }
}
class ChildClass extends ParentClass
{
    public void M2()
    {
        System.out.println("In child class");
    }
}
class Inheritance
{
    public static void main(String[]args)
    {
        ChildClass p =new ChildClass();
     p.M1();
     p.M2();
    }

}
