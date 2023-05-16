package Lessons;

import java.util.Scanner;

public class switch_lesson {
    public static void main(String[] args) {
        Scanner ft = new Scanner(System.in);
        double balance = 500000;
        System.out.println("Welcome to Louis's Bank");
        System.out.println("Do you want to withdraw, transfer or send airtime");
        System.out.println("Enter '1' for withdrawal '2' for transfer and '3' for airtime");
        int answer = ft.nextInt();
        switch(answer){
            case 1:
                System.out.println("How much do you want to withdraw");
                double amount = ft.nextDouble();
                if(amount>balance){
                    System.out.println("Insufficient balance");
                } else {
                    double new_amt = balance - amount;
                    System.out.println("You have withdrawn " + amount + " Your new balance is " + new_amt);
                }
                break;
            case 2:
                System.out.println("How much do you want to transfer");
                break;
            case 3:
                System.out.println("How much credit do you wanna send");
                break;
        }
    }
}
