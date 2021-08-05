import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ContactController {
    private Scanner scanner = new Scanner(System.in);

    private Map<String, Contact> contactMap = new HashMap<>();

    public void displayContact() {
        System.out.printf("%5s%20s", "", "Address Book\n");
        System.out.printf("%15s%15s", "Contact Name", "Phone number\n");
        Iterator<Map.Entry<String, Contact>> iterator = contactMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next().getValue();
            System.out.printf("%15s%15s\n", contact.getName(), contact.getPhone());
        }
    }

    public void findContact() {
        System.out.println("Please enter a name to search: ");
        String searchingName = scanner.nextLine();
        if (!contactMap.containsKey(searchingName)) {
            System.err.println("Not found");
        } else {
            System.out.printf("Found contact name: %s\n", searchingName);
            System.out.printf("Phone number: %s", contactMap.get(searchingName).getPhone());
        }
    }

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        contact.setName(name);
        System.out.println("Please enter phone: ");
        String phone = scanner.nextLine();
        contact.setPhone(phone);
        contactMap.put(name, contact);
    }
}
