import java.util.*;

class Test
{
    public static int sum(int a,int b)
    {
        return a + b;
    }
    public static int sum(int a,int b,int c)
    {
        return a + b + c;
    }
    public static float sum(float a1, float a2, float a3, float a4)
    {
        return a1 + a2 + a3 + a4;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        float a1 = sc.nextFloat();

        System.out.println("sum of x and y = "+sum(x,y));
        System.out.println("sum of x,y and z = "+sum(x,y,z));
        System.out.println("sum of x,y,z and a1 = "+sum(x,y,z,a1));
    }
}
