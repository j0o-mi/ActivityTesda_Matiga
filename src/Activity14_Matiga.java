// import java important java utilities
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Activity14_Matiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create an array list that stores a values inside that grows once we add elements.
        ArrayList<Integer> list = new ArrayList<>();
        // initialize a variable
        int remove = 0;

        // loop the user to input exact 4 (as per instruction) scores.
        for(int i = 0; i < 4; i++) {
            System.out.print("Enter the scores you get: ");
            list.add(sc.nextInt()); // adds the value inside the array list
            sc.nextLine();
        }

        // display the scores.
        System.out.println("Scores: " + list);

        // another task - ask the user to remove a value in the array list.
        System.out.print("Enter a Score to remove: ");
        remove = sc.nextInt();

        // remove by value - not by index.
        list.remove(Integer.valueOf(remove));
        System.out.println("After removing: " + list.toString());   // print out the result

        // Find highest score using Collections utility class
        int highest = Collections.max(list);
        System.out.println("Highest score: " + highest);

        // Add at beginning — index 0 shifts existing elements right
        System.out.print("Enter a score to add at the beginning: ");
        int addBeginning = sc.nextInt();
        list.add(0, addBeginning);

        // Add at end — no index means append
        System.out.print("Enter a score to add at the end: ");
        int addEnd = sc.nextInt();
        list.add(addEnd);

        // display the updated collections of array list.
        System.out.println("After adding at beginning and end: " + list);

        sc.close();
    }
}