import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        //������� ��������� ������ �����.
        //��������, �������� 140 -> ������� 142, �������� 93 -> ������� 94.

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println(number + 2);
        } else {
            System.out.println(number + 1);
        }
    }
}