//package toDoListClean;
//
///**
// * Created by rodneytressler on 10/11/16.
// */
//public class Test {
//    package ToDo;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.io.IOException;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.io.FileReader;
//    /**
//     * Created by christiancampbell on 10/10/16.
//     */
//    public class ToDoList {
//        public static void toDo() throws IOException {
//
//
////        Scanner s = new Scanner(new File(fileName));
////        ArrayList<String> groceries = new ArrayList<String>();
////        while (s.hasNext()){
////            groceries.add(s.next());
////        }
////        s.close();
////
////        Scanner p = new Scanner(new File(fileName));
////        ArrayList<String> personal = new ArrayList<String>();
////        while (p.hasNext()){
////            personal.add(p.next());
////        }
////        p.close();
////
////        Scanner c = new Scanner(new File(fileName));
////        ArrayList<String> chores = new ArrayList<String>();
////        while (c.hasNext()){
////            chores.add(c.next());
////        }
////        c.close();
//
//            String groc;
//            String per;
//            String chore;
//
//
//
//            PrintWriter grocFile = new PrintWriter(new FileWriter("ToDoList.txt", true));
//            PrintWriter choreFile = new PrintWriter(new FileWriter("toDo.txt", true));
//            PrintWriter persFile = new PrintWriter(new FileWriter("pers.txt", true));
//
//
//
//
//
//            ArrayList<String> groceries = new ArrayList<>();
//            ArrayList<String> personal = new ArrayList<>();
//            ArrayList<String> chores = new ArrayList<>();
//
//
//
//            Scanner grocFiles = new Scanner (new FileReader("groc.txt"));
//            while(grocFiles.hasNextLine()){
//                groc = (grocFiles.nextLine());
//                groceries.add(groc);
//            }
//            grocFile = new PrintWriter(new FileWriter("groc.txt"));
//            for (int i = 0; i < groceries.size(); i++){
//                grocFile.println(groceries.get(i));
//            }
//            grocFile.close();
//
//
//            Scanner persFiles = new Scanner (new FileReader("toDo.txt"));
//            while(persFiles.hasNextLine()){
//                per = (persFiles.nextLine());
//                personal.add(per);
//            }
//
//
//            Scanner choreFiles = new Scanner (new FileReader("pers.txt"));
//            while(choreFiles.hasNextLine()){
//                chore = (choreFiles.nextLine());
//                chores.add(chore);
//            }
//
//
//
//
//            while (true) {
//                System.out.println("****************" + "\n" + "Please Select 1 to list all items" + "\n" + "Please select 2 to add an item." + "\n" + "Please select 3 to remove items" + "\n" + "Please select 4 to display a help menu" + "\n" + "Please select 5 to quit" + "\n" + "****************");
//
//
//                Scanner response = new Scanner(System.in);
//                String choice = response.nextLine();
//
//
//
//                if (choice.equals("1")) {
//                    while(true){
//                        System.out.println("Groceries: " + groceries + "\n" + "Personal: " + personal + "\n" + "Chores: " + chores);
//
//                        break;}
//                }
//                else if (choice.equals("4")){
//                    System.out.println("Use this list to enter things into a To Do list, remove things, and show all things. High priority items are located first on the list. ");
//                }
//                else if (choice.equals("5")){
//                    System.out.println("Thank you for using this app! Your list is now located in a text file called ToDoList.txt!");
//
//                    choreFile = new PrintWriter(new FileWriter("toDo.txt"));
//                    for (int i = 0; i < chores.size(); i++){
//                        choreFile.println(chores.get(i));
//
//                    }
//                    grocFile = new PrintWriter(new FileWriter("groc.txt"));
//                    for (int i = 0; i < groceries.size(); i++){
//                        grocFile.println(groceries.get(i));
//                    }
//                    persFile = new PrintWriter(new FileWriter("pers.txt"));
//                    for (int i = 0; i <personal.size(); i++){
//                        persFile.println(personal.get(i));
//                    }
//
//                    grocFile.close();
//                    persFile.close();
//                    choreFile.close();
//                    break;
//                }
//
//                else if (choice.equals("3")) {
//                    while(true) {
//
//                        System.out.print("What section would you like to delete an item from? (Type 1 for grocery, type 2 for personal, type 3 for chores) (Type none to escape)");
//                        Scanner delete = new Scanner(System.in);
//                        String removeSection = delete.nextLine();
//
//                        if (removeSection.equals("1")) {
//                            System.out.println("Current items in grocery: " + groceries);
//                            System.out.println("What item would you like to delete ");
//                            Scanner delete1 = new Scanner(System.in);
//                            String removeSections = delete1.nextLine();
//                            groceries.remove(removeSections);
//                            System.out.println(groceries);
//                        }
//                        else if (removeSection.equals("2")) {
//                            System.out.println("Current items in personal: " + personal);
//                            System.out.println("What item would you like to delete ");
//
//                            Scanner delete2 = new Scanner(System.in);
//                            String removeSections1 = delete2.nextLine();
//                            personal.remove(removeSections1);
//                            System.out.println(personal);
//                        }
//                        else if (removeSection.equals("3")) {
//                            System.out.println("Current items in chores: " + chores);
//                            System.out.println("What item would you like to delete ");
//                            Scanner delete3 = new Scanner(System.in);
//                            String removeSections2 = delete3.nextLine();
//                            chores.remove(removeSections2);
//                            System.out.println(chores);
//                        }
//
//                        else{
//                            break;
//                        }
//
//
//                    }
//                }
//
//
//
//                else if (choice.equals("2")) {
//                    while (true) {
//                        System.out.print("Which section do you want to add to ( Press 1 for Grocery, Press 2 for Personal, Press 3 for Chores) (Type 4 to escape)");
//                        Scanner section = new Scanner(System.in);
//                        String section1 = section.nextLine();
//
//
//                        if (section1.equals("1") || section1.equals("one")) {
//                            System.out.print("Which item do you want to add to groceries ");
//                            Scanner grocery = new Scanner(System.in);
//                            String grocery1 = grocery.nextLine();
//
//
//
//                            System.out.print("Do you want this to be a priority? y/n");
//                            Scanner YorN = new Scanner(System.in);
//                            String priority = YorN.nextLine();
//
//                            if(priority.equals("y")){
//                                groceries.add(0, grocery1);
//                                System.out.println("Grocery: " + groceries);
//                            }
//                            else{
//                                groceries.add(grocery1);
//                                System.out.println(" Groceries:" + groceries);}
//
//                        } else if (section1.equals("2") || section1.equals("two")) {
//                            System.out.print("Which objective do you want to add to personal ");
//                            Scanner personal1 = new Scanner(System.in);
//                            String personal2 = personal1.nextLine();
//
//
//
//
//                            System.out.print("Do you want this to be a priority? y/n ");
//                            Scanner YorN1 = new Scanner(System.in);
//                            String priority = YorN1.nextLine();
//
//                            if(priority.equals("y")){
//                                personal.add(0, personal2);
//                                System.out.println("Personal: " + personal);
//                            }
//                            else{
//                                personal.add(personal2);
//                                System.out.println(" Personal:" + personal);}
//
//
//                        } else if (section1.equals("3") || section1.equals("three")) {
//                            System.out.print("Which objective do you want to add to chores ");
//                            Scanner chores1 = new Scanner(System.in);
//                            String chores2 = chores1.nextLine();
//
//
//
//                            System.out.print("Do you want this to be a priority? y/n ");
//                            Scanner YorN2 = new Scanner(System.in);
//                            String priority2 = YorN2.nextLine();
//
//                            if(priority2.equals("y")){
//                                chores.add(0, chores2);
//                                System.out.println("Chores : " + chores);
//                            }
//                            else{
//                                chores.add(chores2);
//                                System.out.println("Chores :" + chores);}
//
//
//
//                        } else {
//                            break;
//                        }
//
//
//                    }
//
//
//                }
//
//
//
//            }
//        }
//    }
//}
