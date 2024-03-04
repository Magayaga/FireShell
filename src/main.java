// FireShell (v0.1.0–preview0) – Command-based shell for Java!
// Copyright 2024 Cyril John Magayaga
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        System.out.println("FireShell – Command-based shell for Java");
        System.out.println("Type 'exit' to quit");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while (true) {
                System.out.print("🔥> ");
                input = reader.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Parse and execute the command
                executeCommand(input);
            }
        }
          
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeCommand(String command) {
        // You can add more commands here
        switch (command.toLowerCase()) {
            case "help":
                System.out.println("Available commands:");
                System.out.println("help - Display this help message");
                System.out.println("echo <message> - Display a message");
                System.out.println("exit - Exit the shell");
                break;
            
            default:
                if (command.startsWith("echo ")) {
                    System.out.println(command.substring(5));
                }
            
                else {
                    System.out.println("Command not found. Type 'help' for available commands.");
                }
        }
    }
}
