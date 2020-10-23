import java.util.ArrayList;
import java.util.Scanner;

public class PrvoCisla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit;
        do {
            System.out.println("Kolik prvocisel chcete vypsat?");
            String limitString = scan.nextLine();
            try {
                limit = Integer.parseInt(limitString);
            } catch (java.lang.NumberFormatException e) {
                limit = 0;
            }
        } while (limit <= 1);
        ArrayList<Integer> pN = new ArrayList<>();
        ArrayList<Integer> cN = new ArrayList<>();
        cN.add(1);
        for (int pNCan = 2; pN.size() < limit; pNCan++) {
            if (!cN.contains(pNCan)) {
                pN.add(pNCan);
                for (int multiple = 2; (multiple * pNCan) <= Math.pow(limit, 2); multiple++) {
                    if (!cN.contains(multiple * pNCan)) {
                        cN.add(multiple * pNCan);
                    }
                }
            }
        }
        log(pN);
    }
    public static void log(ArrayList<Integer> pN) {
        System.out.println("\n-------------------");
        System.out.println("Prvo cisla:");
        pN.forEach((element) -> doLock(element));
    }
    public static void doLock(int input) {
        if (input != 0) {
            System.out.print(input + "-");
        }
    }
}