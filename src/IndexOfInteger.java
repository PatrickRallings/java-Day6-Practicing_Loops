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
                    indexOf();
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
    public static void indexOf() {
        for(int i = 0;i < intList.size();i++){
            int value = intList.get(i);
            if (lastInput == value) {
                System.out.println("Your chosen integer of "+lastInput+" has an index of "+i);
            }
        }
    }
}