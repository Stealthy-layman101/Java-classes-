package Lessons;

public class Inheritance {
    int x = 20;

    public void add(){
        int x=5; int y=5;
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Inheritance inherit = new Inheritance();
        Inheritance inherit2 = new Inheritance();
        System.out.println(inherit.x);
        System.out.println(inherit2.x);
    }
}
