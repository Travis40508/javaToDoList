package toDoListClean;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by rodneytressler on 10/11/16.
 */
public class Chores {
    public static String fileName = "chores.txt";
    public static ArrayList<String> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter outFile;
    public static String chor;
    public static void addChores() {
        while(true) {
            System.out.println("Which Item Would You Like to Add to Chores?");
            String response7 = scanner.nextLine().toLowerCase();
            System.out.println("Is this item of High Priority?");
            String response32 = scanner.nextLine().toLowerCase();
            if(response32.toLowerCase().substring(0, 1).equals("y")) {
                list.add(0, response7);
            } else {
                list.add(response7);
            }
            System.out.println("Add Another?");
            String response8 = scanner.nextLine();
            if(response8.toLowerCase().substring(0, 1).equals("n")) {
                break;
            }
        }
    }
    public static void listChores() {
        System.out.println("Chores:");
        for (String item : list) {
            System.out.println(item);
        }
    }
    public static void removeChores() {
        while (true) {
            listChores();
            System.out.println("Which Item Would you Like to Remove?");
            String response13 = scanner.nextLine().toLowerCase();
            list.remove(response13);
            System.out.println("Remove Another?");
            String response14 = scanner.nextLine();
            if(response14.toLowerCase().substring(0 , 1).equals("n")) {
                break;
            }

        }
    }
    public static void write() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter("chores.txt", true));
    }
    public static void read() throws IOException {
        Scanner scanner = new Scanner(new FileReader("chorList.txt"));
        while(scanner.hasNextLine()) {
            chor = (scanner.nextLine());
            list.add(chor);
        }
    }
    public static void choresFinal() throws IOException{
        outFile = new PrintWriter(new FileWriter("chorList.txt"));
        for (int i = 0; i < list.size(); ++i) {
            outFile.println(list.get(i));

        }
    }
    public static void outClose() {
        outFile.close();
    }
}
