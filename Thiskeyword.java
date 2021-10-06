//This keyword is used to refer current object inside a method or constructor
import java.util.*;
class MyFirstClass{
    int x,y;
    MyFirstClass(int x,int y){
        this.x = x;
        this.y = y;
    }

}
class MainClass{
    public static void main(String[] args){
        MyFirstClass Mfc = new MyFirstClass(10,20);
        System.out.println("object value :"+Mfc.y);
    }
}
