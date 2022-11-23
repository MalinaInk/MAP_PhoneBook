import java.util.Map;
import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (phoneBook.getEntries().size() < 20) {
            phoneBook.addPhone(getRandomName(), getPhoneNumber());
        }
        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
            }
       }

    public static FullName getRandomName() {
        String name = "Test" + RANDOM.nextInt(1_000);
        String lastName = "TestLast" + RANDOM.nextInt(1_000);
        return new FullName(name, lastName);
    }

    public static String getPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(10));
        }
        return stringBuilder.toString();
    }
}