import java.util.*;
class MyFirstClass{
    MyFirstClass(){
        System.out.println("Inside parent class");
    }
    {
        System.out.println("Inside Block parent class");
    }
}
class MySecondClass extends MyFirstClass{
    MySecondClass(){
        System.out.println("Inside second class");
    }
    {
        System.out.println("Block Inside second class");
    }
}
class MainClass{
    public static void main(String[] args){
        System.out.println("Inide main class");
        MySecondClass MySec = new MySecondClass();
    }
}
