import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //Джон едет на поезде к Мэри. Шерлок Холмс решил вычислить,
        //где сейчас находится Джон: ближе к нему или к Мэри.
        //Шерлок знает, с какой скоростью едет поезд и сколько часов он уже едет.
        //Также он знает, сколько километров длится полная дорога от него к  Мэри.
        //В программу вводится 3 числа: время в пути, скорость поезда, длина полного пути.
        //Вывести на экран имя персонажа, к которому сейчас ближе Джон

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
