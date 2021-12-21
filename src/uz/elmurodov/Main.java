package uz.elmurodov;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("In -> 1");
        System.out.println("Out -> 2");
        System.out.println("Pay -> 3");
        System.out.println("Available Places -> 4");
        System.out.println("Quit -> -1");
        System.out.print("?:");
        int choice = SCANNER.nextInt();
        switch (choice) {
            case 1 -> System.out.println("In car please");
            case 2 -> System.out.println("Out car");
            case 3 -> System.out.println("Pay");
            case 4 -> System.out.println("Available places");
            case -1 -> {
                System.out.println("Fell free come back any time");
                return;
            }
            default -> System.out.println("Wrong Choice");
        }
        mainMenu();
    }

}
