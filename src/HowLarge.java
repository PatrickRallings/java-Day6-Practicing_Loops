import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HowLarge {
    private static final ArrayList<String> stringList = new ArrayList<>();
    private static String lastInput;

    public static void main(String[] args) {
        System.out.println("Please enter one string per line and enter a blank line when done.");
            addList();
        System.out.println("The the list you created contains " + stringList.size()+" values.");
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