/* super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor. */
import java.util.*;
class SuperClass
{
    int a = 10;
    void display()
    {
     System.out.println("Inside super class value ="+a);
    }

}
class SubClass extends SuperClass
{
    int b = 20;
    super.display();
    void display()
    {

        System.out.println("Inside sub class value ="+b);
    }

}
class MainClass {
    public static void main(String[] args)
    {
        SubClass sb = new SubClass();
        sb.display();
    }
}
