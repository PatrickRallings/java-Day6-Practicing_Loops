import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    private static final ArrayList<Integer> intList = new ArrayList<>();
    private static Integer lastInput;
    public static String list = "";

    public static void main(String[] args) {
        System.out.println("Please enter one integer per line and enter a '0' when done.");
        addList();
        listList();
        System.out.println(list + " were the items in the list. The sum of that list is: " + sum()+".");
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

    public static Integer sum() {
        int sum = 0;
        for (Integer integer : intList) {
            sum += integer;
        }
        return sum;
    }
    public static void listList() {
        for (int i = 0; i < intList.size();i++) {
            if (i == intList.size() - 1) {
                list += "and "+ intList.get(i);
            } else {
                list += intList.get(i)+", ";
            }

        }
    }
}