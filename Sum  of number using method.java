import java.util.*;

class Test
{
    public static int sum(int a,int b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println("sum of x and y = "+sum(x,y));
    }
}
