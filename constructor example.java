public class ConOverload
{
    int x; int y;
    ConOverload()
    {
        x = 10;
        y = 10;
        System.out.println("First constructor "+x+" "+y);
    }
    public void display()
    {
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
    }
    public static void main(String args[])
    {
        ConOverload c = new ConOverload();
        c.display();

    }
}
