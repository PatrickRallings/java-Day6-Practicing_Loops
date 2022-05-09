import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FifthItem {
    private static final ArrayList<String> stringList = new ArrayList<>();
    private static String lastInput;

    public static void main(String[] args) {
        System.out.println("Please enter one string per line and enter a blank line when done.");
        while (stringList.size() < 5) {
            lastInput = null;
            System.out.println("Please enter at least "+(5 - stringList.size())+" more  lines of strings:");
            addList();
        }
        System.out.println("The fifth item you entered was " + stringList.get(4));
    }

    public static String scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static void addList() {
        while (!(Objects.equals(lastInput, ""))) {
                lastInput = scanner();
                if (!lastInput.equals("")) {
                    stringList.add(lastInput);
                }
        }
    }
}

