import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //���� ���� �� ������ � ����. ������ ����� ����� ���������,
        //��� ������ ��������� ����: ����� � ���� ��� � ����.
        //������ �����, � ����� ��������� ���� ����� � ������� ����� �� ��� ����.
        //����� �� �����, ������� ���������� ������ ������ ������ �� ���� �  ����.
        //� ��������� �������� 3 �����: ����� � ����, �������� ������, ����� ������� ����.
        //������� �� ����� ��� ���������, � �������� ������ ����� ����

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter travel time");
        double travelTime = scanner.nextDouble();

        System.out.println("Ender train speed");
        double trainSpeed = scanner.nextDouble();

        System.out.println("Enter travel length");
        double travelLength = scanner.nextDouble();

        double count = travelLength / trainSpeed;
        double count2 = count - travelTime;

        if (count2 > travelTime) {
            System.out.println("John is closer to Sherlock");
        }
        if (count2 < travelTime) {
            System.out.println("John is closer to Marry");
        } else {
            System.out.println("John half way");
        }


    }
}
