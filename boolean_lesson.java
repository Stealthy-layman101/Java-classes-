package Lessons;

import java.util.Scanner;

public class boolean_lesson {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner ft = new Scanner(System.in);
        int age = ft.nextInt();
        System.out.println("Enter your name:");
       String name = ft.next();
        if (age>=18){
            if(name.equals("Louis")) {
                System.out.println("Goodname");
            }
            System.out.println("Old enough to vote!");
        } else if (age==17) {
            System.out.println("Almost there");
        }else{
            System.out.println("Not old enough to vote " + age + " you are too young");
        }
    }
}
