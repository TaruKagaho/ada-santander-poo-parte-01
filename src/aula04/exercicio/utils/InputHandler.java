package aula04.exercicio.utils;

import aula04.exercicio.models.RestaurantEntity;

import java.util.Scanner;

public class InputHandler {
    public InputHandler() {
    }

    public static String getStringNextLine(String message){
        Scanner sc = new Scanner(System.in);

        // System.out.println();
        // System.out.print(message);
        System.out.println(message);

        return sc.nextLine();
    }

    public static String getStringNext(String message){
        Scanner sc = new Scanner(System.in);

        // System.out.println();
        System.out.print(message);

        return sc.next();
    }

    public static double getDouble(String message){
        Scanner sc = new Scanner(System.in);

        // System.out.println();
        System.out.print(message);

        return sc.nextDouble();

        /*System.out.println(message);

        String response = sc.nextLine();

        return Double.parseDouble(response);*/
    }

    public static int getInt(String message){
        Scanner sc = new Scanner(System.in);

        // System.out.println();
        System.out.print(message);

        return sc.nextInt();

        /*System.out.println(message);

        String response = sc.nextLine();

        return Integer.parseInt(response);*/
    }

    public static String getRestaurant(RestaurantEntity restaurant) {
        return "";
    }
}
