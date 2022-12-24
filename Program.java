import java.util.Random;

public class Program {

    private static final int MAX_NUMBER = 30;
    public static void main(String[] args) {
        int number = getNumber();
        int result = getResult(number);
        showVisualResult(number);
        showResult(number, result);
    }

    public static int getNumber() {
        return new Random().nextInt(MAX_NUMBER);
    }

    public static int getResult(int num) {
        return num * (num + 1) / 2;
    }

    public static void showVisualResult(int num) {
        int numSpases = num - 1;
        for (int i = 1; i <= num; i++) {
            String spaces = "";
            for (int s = 0; s < numSpases; s++) {
                spaces += " ";
            }
            System.out.print(spaces);
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            numSpases--;
        }
    }

    public static void showResult(int num, int res) {
        System.out.println(num + "-е треугольное число равно " + res);
    }
}