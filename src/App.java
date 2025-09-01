import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ANSI-Farbcodes für bunte Ausgabe
        final String RESET = "\u001B[0m";
        final String CYAN = "\u001B[36m";
        final String YELLOW = "\u001B[33m";
        final String RED = "\u001B[31m";

        // ASCII-Art
        System.out.println(CYAN +
            "  __  __           _       _           _ " + "\n" +
            " |  \\/  | ___   __| |_   _| | ___  ___| |" + "\n" +
            " | |\\/| |/ _ \\ / _` | | | | |/ _ \\/ __| |" + "\n" +
            " | |  | | (_) | (_| | |_| | |  __/\\__ \\_|" + "\n" +
            " |_|  |_|\\___/ \\__,_|\\__,_|_|\\___||___(_)" + RESET
        );

        System.out.println(YELLOW + "Hallo, Maxim!" + RESET);
        System.out.print("Gib etwas ein: ");
        String Dings = s.nextLine();
        System.out.println(RED + Dings + " is doof!" + RESET);

        s.close();
    }
}
