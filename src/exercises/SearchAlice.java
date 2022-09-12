package exercises;
import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args){
        String theSentenece = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        theSentenece = theSentenece.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term:");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();
        boolean found = theSentenece.contains(searchTerm);
        System.out.println("The search term was " + found);

    }
}
