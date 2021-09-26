public class ConOverload
{
    int x; int y;
    ConOverload()
    {
        x = 10;
        y = 10;
        System.out.println("First constructor "+x+" "+y);
    }
    ConOverload(ConOverload c)
    {
        x = c.x;
        y = c.y;
        System.out.println("sum value of con  = "+(x+y));
    }

    public static void main(String args[])
    {
        ConOverload c1 = new ConOverload();
        ConOverload c2 = new ConOverload(c1);

    }
}
