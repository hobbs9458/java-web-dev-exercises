package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        //set scanner
        Scanner input = new Scanner(System.in);

        //create HashMap of student ID's and names
        HashMap<Integer, String> students = new HashMap<>();
        System.out.println("Enter your students (or Enter to finish): ");
        String newName;
        int newStudentId;
        do {
            System.out.println("Student Name: ");
            newName = input.nextLine();

            if (!newName.equals("")) {
                System.out.println("ID: ");
                newStudentId = input.nextInt();
                students.put(newStudentId, newName);

                //Read in the newline before looping back
                input.nextLine();
            }

        } while (!newName.equals(""));

        System.out.println("Class roster: ");

        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Id: " + student.getKey() + ", Name: " + student.getValue());
        }

    }
}
