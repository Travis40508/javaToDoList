package toDoListClean;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        ToDoList.writer();
        ToDoList.reader();
        while(true) {
        System.out.println("Please Select an Option: " + "\n" +
                           "1. Display To-Do List" + "\n" +
                           "2. Add Items to To-Do List" + "\n" +
                           "3. Remove Items from To-Do List" + "\n" +
                           "4. Help" + "\n" +
                           "5. Quit");
        String response1 = scanner.nextLine();
        switch(response1) {
            case ("1"):
                ToDoList.listItems();
                break;
            case ("2"):
                ToDoList.addItems();
                break;
            case("3") :
                ToDoList.removeItems();
                break;
            case("4") :
                ToDoList.help();
                break;
        }
        if(response1.equals("5")) {
            System.out.println("Come Back Again!");
            ToDoList.closer();
            break;
        }
        }
    }
}
