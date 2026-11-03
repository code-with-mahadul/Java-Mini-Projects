import java.util.Scanner;

public class MadLibsGame{
    //Mad libs game

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2; 
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("Enter an Adjective (Description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a Noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another Adjective (Description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another Adjective (Description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to the " +adjective1+ " zoo.");
        System.out.println("In an exhibit, I saw a " +noun1+ ".");
        System.out.println(noun1 + " was " +adjective2 + " and " + verb1 + "!");
        System.out.println("I was " +adjective3 + "!");

        scanner.close();
    }
}