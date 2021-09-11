/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        int num = sc.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = sc.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = sc.nextInt();
        int slicesTot = slices * pizzas;
        System.out.printf("%d people with %d pizzas (%d slices)\n", num, pizzas, slicesTot);
        int perPerson = slicesTot / num;
        int leftover = slicesTot % num;
        System.out.printf("Each person get %d pieces of pizza.\n", perPerson);
        System.out.printf("There are %d leftover pieces.\n", leftover);
    }
}
