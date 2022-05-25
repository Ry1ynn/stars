import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String star = "*";
        String stars = "";
        for (int i=0; i<x; i++) {
            stars = stars + star;
            System.out.println(stars);
        }
    }
}
