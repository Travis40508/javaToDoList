package toDoListClean;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class Groceries {
    public static ArrayList<String> newList = new ArrayList<>();
    public static ArrayList<String> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static String fileName = "groceries.txt";

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
        System.out.println("Groceries: " + list);
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
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        outFile.print(list);
        outFile.close();
    }
    public static void read() throws IOException {
        Scanner inFile = new Scanner(new FileReader(fileName));
        while (inFile.hasNext()){
            list.add(inFile.next());
        }
        inFile.close();
    }
}