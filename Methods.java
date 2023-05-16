package Lessons;

public class Methods {
     static void add(){
        int i = 10; int j = 10;
        System.out.println(i+j);
    };

     static void subtract(int x, int y){
         System.out.println(x-y);
     };

     static void name(int age, String name){
         System.out.println(name+" is "+age);
     }

     static int multiply(int num){
         return 5*num;
     }

    static void checkAge(int age) {
        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        add();
        subtract(50,20);
        name(20,"Felix");
        System.out.println(multiply(5));
        checkAge(15);
    }
}
