package Lessons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryandcatch{
    public static void main(String[] args) {
        try {
            Scanner ft = new Scanner(System.in);
            System.out.println("Enter your age:");
            int age = ft.nextInt();
            System.out.println("Hello Louis you are" + age);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong input");
        }
    }
}
