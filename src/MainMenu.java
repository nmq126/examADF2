import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);
    private ContactController contactController = new ContactController();
    public void generateMainMenu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("--------------------");
            System.out.println("1. Add new contact.");
            System.out.println("2. Find contact by name.");
            System.out.println("3. Display contacts.");
            System.out.println("4. Exit.");
            System.out.println("--------------------");
            System.out.println("Please enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    contactController.addContact();
                    break;
                case 2:
                    contactController.findContact();
                    break;
                case 3:
                    contactController.displayContact();
                    break;
                case 4:
                    System.out.println("Bye bye");
                    break;
                default:
                    break;
            }
            if (choice == 4) {
                break;
            }
            scanner.nextLine();
        }
    }
}
