import java.util.Scanner;

public class PredposledniSlovo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] sentenceWords = input.split(" ");
        System.out.println(sentenceWords[sentenceWords.length - 2]);
    }
}