package toDoListClean;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class Groceries {
    public static String groc;
    public static ArrayList<String> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter outFile;
    public static void addGroceries() {
        while (true) {
            System.out.println("Which Grocery Item Would You Like to Add?");
            String response3 = scanner.nextLine().toLowerCase();
            System.out.println("Is this item of High Priority?");
            String response30 = scanner.nextLine().toLowerCase();
            if(response30.toLowerCase().substring(0, 1).equals("y")) {
                list.add(0, response3);
            } else {
                list.add(response3);
            }
            System.out.println("Add Another?");
            String response4 = scanner.nextLine();
            if (response4.toLowerCase().substring(0, 1).equals("n")) {
                break;
            }
        }
    }

    public static void listGroceries() {
        System.out.println("Groceries:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void removeGroceries() {
        while (true) {
            listGroceries();
            System.out.println("Which Item Would you Like to Remove?");
            String response9 = scanner.nextLine().toLowerCase();
            list.remove(response9);
            System.out.println("Remove Another?");
            String response10 = scanner.nextLine();
            if(response10.toLowerCase().substring(0 , 1).equals("n")) {
                break;
            }

        }
    }
    public static void write() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter("groceries.txt", true));
    }
    public static void read() throws IOException {
        Scanner scanner = new Scanner(new FileReader("grocList.txt"));
        while(scanner.hasNextLine()) {
            groc = (scanner.nextLine());
            list.add(groc);
        }
    }
    public static void grocFinal() throws IOException{
        outFile = new PrintWriter(new FileWriter("grocList.txt"));
        for (int i = 0; i < list.size(); ++i) {
            outFile.println(list.get(i));

        }
    }
    public static void outClose() {
        outFile.close();
    }
}