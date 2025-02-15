import java.util.Scanner;

public class MagicPotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long power = scanner.nextLong();
        System.out.println(isMagicalPotion(power) ? "YES" : "NO");
    }

    private static boolean isMagicalPotion(long power) {
        long cubeRoot = Math.round(Math.pow(power, 1.0 / 3.0));
        return cubeRoot * cubeRoot * cubeRoot == power;
    }
}