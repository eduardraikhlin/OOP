package Homework5.view;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserView {
    Controller controller = new Controller();
    Scanner scan = new Scanner(System.in);
    int inCommand;

    public void userChoice() {
        while (true) {
            System.out.println("Select the type of user to add:\n"
                    + "1 - add a teacher\n"
                    + "2 - add a student\n"
                    + "3 - exit");
            inCommand = scan.nextInt();
            scan.nextLine();
            switch (inCommand) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Please, enter a number 1 to 3.");
                    break;
            }
        }
    }

    public void addTeacher() {
        System.out.print("Input a name: ");
        String name = scan.nextLine();
        System.out.print("Input a last name: ");
        String lastName = scan.nextLine();
        System.out.print("Input a birthday in the format: YEAR/MONTH/DATE: ");
        String temp = scan.nextLine();
        String[] tempDate = temp.split("/");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthDay = new GregorianCalendar(year, month, date);
        System.out.print("Input a discipline: ");
        String disciplines = scan.next();
        System.out.print("Input a department: ");
        String department = scan.next();
        System.out.print("Rating: ");
        Double rating = scan.nextDouble();
        System.out.println(controller.createNewTeacher(name, lastName, birthDay, disciplines, department, rating));
    }

    public void addStudent() {
        System.out.print("Input a name: ");
        String name = scan.nextLine();
        System.out.print("Input a last name: ");
        String lastName = scan.nextLine();
        System.out.print("Input a birthday in the format: YEAR/MONTH/DATE: ");
        String temp = scan.nextLine();
        String[] tempDate = temp.split("/");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthDay = new GregorianCalendar(year, month, date);
        System.out.print("Group:");
        int group = scan.nextInt();
        System.out.print("Speciality:");
        String speciality = scan.next();
        System.out.print("Average student score: ");
        Double meanBall = scan.nextDouble();
        System.out.println(controller.createNewStudent(name, lastName, birthDay, group, speciality, meanBall));
    }
}
