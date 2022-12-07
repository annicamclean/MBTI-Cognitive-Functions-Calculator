import java.util.Scanner;

public class Question {
    public Question () {}

    //will ask you what your MBTI type is
    public static void firstQuestion() {
        Scanner input = new Scanner(System.in);
        String letters;
        MBTIType person;
        char choice = 'Y';
        while (choice == 'Y') {
            System.out.println("What is your MBTI type?");
            System.out.println("An example would be ESFJ");
            letters = input.nextLine();
            person = new MBTIType();
            person.MBTIArrays(letters);
            System.out.println("\nWould you like to run it again? Use 'Y' for yes and 'N' for no");
            choice = input.next().charAt(0);
            choice = Character.toUpperCase(choice);
        }
    }
    public static void secondQuestion() {

    }
}
