import java.util.Scanner;

public class App {
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        printAsciiArt();
        greetUser();
        handleUserInput();
        printMathJoke();
    }

    private static void printAsciiArt() {
        System.out.println(CYAN +
            "  __  __           _       _           _ " + "\n" +
            " |  \\/  | ___   __| |_   _| | ___  ___| |" + "\n" +
            " | |\\/| |/ _ \\ / _` | | | | |/ _ \\/ __| |" + "\n" +
            " | |  | | (_) | (_| | |_| | |  __/\\__ \\_|" + "\n" +
            " |_|  |_|\\___/ \\__,_|\\__,_|_|\\___||___(_)" + RESET
        );
    }

    private static void greetUser() {
        System.out.println(YELLOW + "Hallo, Maxim!" + RESET);
    }

    private static void handleUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Gib etwas ein: ");
            String input = scanner.nextLine();
            System.out.println(RED + input + " is doof!" + RESET);
        }
    }

    private static void printMathJoke() {
        System.out.println("2 + 2 = 5");
    }
}