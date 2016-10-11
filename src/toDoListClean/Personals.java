package toDoListClean;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class Personals {
    public static ArrayList<String> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void addPersonals() {
        while(true) {
            System.out.println("Which Personals Item Would You Like to Add?");
            String response5 = scanner.nextLine().toLowerCase();
            System.out.println("Is this item of High Priority?");
            String response31 = scanner.nextLine().toLowerCase();
            if(response31.toLowerCase().substring(0, 1).equals("y")) {
                list.add(0, response5);
            } else {
                list.add(response5);
            }
            System.out.println("Add Another?");
            String response6 = scanner.nextLine();
            if(response6.toLowerCase().substring(0,1).equals("n")) {
                break;
            }
        }
    }
    public static void listPersonals() {
        System.out.println("Personals: " + list);
    }
    public static void removePersonals() {
        while (true) {
            listPersonals();
            System.out.println("Which Item Would you Like to Remove?");
            String response11 = scanner.nextLine().toLowerCase();
            list.remove(response11);
            System.out.println("Remove Another?");
            String response12 = scanner.nextLine();
            if(response12.toLowerCase().substring(0 , 1).equals("n")) {
                break;
            }

        }
    }
    public static void write() throws IOException{
        String fileName = "personals.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        outFile.print(list);
        outFile.close();
    }
    public static void read() throws IOException {

    }
}
