import java.util.Scanner;

public class Question {
    public Question () {}

    //will ask you what your MBTI type is
    public static void firstQuestion() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your MBTI type?");
        System.out.println("An example would be ESFJ");
        String letters = input.next();
        MBTIType person = new MBTIType();
        person.MBTIArrays(letters);
    }
    public static void secondQuestion() {

    }
}
