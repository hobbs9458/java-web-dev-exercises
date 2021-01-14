package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //create ArrayList of Integers
        ArrayList<Integer> arrayListOfInts = new ArrayList<>();
        arrayListOfInts.add(9);
        arrayListOfInts.add(4);
        arrayListOfInts.add(3);
        arrayListOfInts.add(7);
        arrayListOfInts.add(6);
        arrayListOfInts.add(4);
        arrayListOfInts.add(4);
        arrayListOfInts.add(2);
        arrayListOfInts.add(8);
        arrayListOfInts.add(1);
        System.out.println(arrayListOfInts);

        //call addEvens to add the even ints in the array list
        int seeTotal = addEvens(arrayListOfInts);
        System.out.println(seeTotal);

        //create String of sentences and remove punctuation
        String practiceString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        practiceString = practiceString.replaceAll(",", "");
        practiceString = practiceString.replaceAll("\\.", "");


        //convert string to an ArrayList
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(practiceString.split(" ")));

        //ask user for number to print out user's specified lettered word
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number. We will print out words with only that number of letters: ");
        int userNum = input.nextInt();


        //call method to print words with the users specified number of letters (userNum)
        printFiveLetteredWords(myList, userNum);


    }

    //method to add even numbers in an ArrayList
    public static int addEvens(ArrayList<Integer> arrayList) {
        int total = 0;
        for(Integer num : arrayList) {
            if(num % 2 == 0) {
                total += num;
            }
        }
        return total;
    }

    //method to print all 5 lettered words from ArrayList
    public static void printFiveLetteredWords(ArrayList<String> list, int num) {
        ArrayList<String> wordStorage = new ArrayList<String>();
        for(String str : list) {
            if(str.length() == num) {
                System.out.println(str);
                wordStorage.add(str);
            }
        }
        if(wordStorage.size() == 0) {
            System.out.println("There are no words with that many letters in the string.");
        }
    }
}
