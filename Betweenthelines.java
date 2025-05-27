import java.util.Scanner;

public class Betweenthelines {
    public static void main(String[] args) {
        // Betweenthelines

        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String noun2;
        String noun3;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun2 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun3 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("On a " + adjective1 + " day, I walked past a " + noun1 + " alone,");
        System.out.println("The " + noun1 + " reached out with a " + noun2 + ", as if it were " + adjective2 + ".");
        System.out.println("I drew closer, and it began to " + verb1 + " with a " + adjective3 + " sound,");
        System.out.println("And my heart filled with " + noun3 + " beyond description.");



        scanner.close();

    }
}
