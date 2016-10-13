package toDoListClean;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class ToDoList {
    public static void listItems() {
        Groceries.listGroceries();
        Personals.listPersonals();
        Chores.listChores();
    }

    public static void addItems() {
        System.out.println("Which Category Would You Like to add Items To?" + "\n" +
                           "1. Groceries" + "\n" +
                           "2. Personals" + "\n" +
                           "3. Chores");
        Scanner scanner = new Scanner(System.in);
        String response2 = scanner.nextLine();
        switch(response2) {
            case("1") :
                Groceries.addGroceries();
                break;
            case("2") :
                Personals.addPersonals();
                break;
            case("3") :
                Chores.addChores();
                break;
            default :
                System.out.println("Please Enter a Valid Option");
        }

    }
    public static void removeItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Category Would You Like to Remove From?" + "\n" +
                           "1. Groceries" + "\n" +
                           "2. Personals" + "\n" +
                           "3. Chores");
        String response9 = scanner.nextLine();
        switch(response9) {
            case("1") :
                Groceries.removeGroceries();
                break;
            case("2") :
                Personals.removePersonals();
                break;
            case("3") :
                Chores.removeChores();
                break;
            default :
                System.out.println("Please Enter a Valid Option");
        }
    }

    public static void help() {
        System.out.println("To-Do Lists are Important!" + "\n" +
                           "Choose to List your items, add them, or remove them!" + "\n" +
                           "Higher priority items are listed first in the list!" + "\n" +
                           "Use Number Indicators to Navigate throughout the app!");
    }

    public static void writer() throws IOException{
        Groceries.write();
        Personals.write();
        Chores.write();
    }

    public static void reader() throws IOException{
        Groceries.read();
        Personals.read();
        Chores.read();
    }
    public static void closer() throws IOException {
        Groceries.grocFinal();
        Groceries.outClose();
        Personals.persFinal();
        Personals.outClose();
        Chores.choresFinal();
        Chores.outClose();
    }

}
