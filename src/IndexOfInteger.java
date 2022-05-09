import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    private static final ArrayList<Integer> intList = new ArrayList<>();
    private static Integer lastInput;

    public static void main(String[] args) {
        System.out.println("Please enter one integer per line and enter a '0' when done.");
        addList();
        System.out.println("List complete.\nWhat number from your list would you like to find?\nEnter 0 to exit.");

        while (true) {
            lastInput = scanner();
            if (lastInput != 0) {
                if (intList.contains(lastInput)) {
                    System.out.println("The integer " + lastInput + " can be found at index " + intList.indexOf(lastInput) + " on your list.");
                } else {
                    System.out.println("The integer you entered is not on your list.\nPlease try again.");
                }
            } else {
                break;
            }
        }
    }

    public static Integer scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void addList() {
        while (true) {
            lastInput = scanner();
            if (!(lastInput == 0)) {
                intList.add(lastInput);
            } else {
                break;
            }
        }
    }
}