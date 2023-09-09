package app;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        int[] tickets = {2345, 4231, 8887, 7777, 1323, 7676};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ticket number :");
        int number = scanner.nextInt();
        int idx = -1;
        for (int i = 0; i < tickets.length; i++){
            if(tickets[i] == number)
                idx = i;
        } if (idx == -1 )
            System.out.println("Sorry, ticket " + number + " is not win :(");
        else
            System.out.println("Congratulations! Ticket " + number + " is win!");
    }
}




