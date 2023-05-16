package Lessons;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Toyota","Ford","Bugatti"};
        int[] num = {1,2,3,4,5};
        int [] arr = new int[10];
        arr[0] = 1;
        System.out.println(arr[0]);
        // System.out.println(cars[1]);
        cars[0] = "Ferrari";
        for (int i =0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        String[] vehicles = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : vehicles) {
            System.out.println(i);
        }
    }
}
