import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        while (!userInput.equals("stop")) {

            System.out.println(userInput.toUpperCase());
            System.out.print("Please Enter a String or Enter 'stop' to quit: ");
            userInput = keyboard.nextLine();

        }

    }
}