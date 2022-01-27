import java.util.ArrayList;
import java.util.Collections;

public class MyGame {

    public static void main(String[] args) {
        Fleet fleet = new Fleet(); //Создаем экземпляр корабля.
        GameField gameField = new GameField(); //Создаем экземпляр игрового поля.
        Canon canon = new Canon(); //Создаем экземпляр пушки.

        sayHelloToGamer(); //Приветствуем игрока.

        gameField.setFieldSize(); //Задаем размер игрового поля.
        fleet.setFleetSize();//Задаем размер корабля.

        System.out.println("\n" + "Строим корабль....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        System.out.println("\n" + "Корабль построен. Его размер - " + fleet.fleetSize + " ячейки!");
        //System.out.println("Размер игрового поля: " + gameField.fieldSize + ".");
        System.out.println("Корабль отправился в путь...");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
        }

        System.out.println("\n" + "Корабль занял боевую позицию! Пора стрелять!");
        gameField.setFleetPosition(fleet);
        System.out.println("Введите номер поля, куда будем стрелять. (От 1 до " + gameField.fieldSize + ")");
        System.out.println(gameField.fleetLocation.toString());

        while (Collections.frequency(gameField.fleetLocation, "-5") < fleet.fleetSize) { //Стреляем, пока не потопим весь корабль
            canon.checkShotValue(gameField);
            canon.startShooting(gameField);
            if (Collections.frequency(gameField.fleetLocation, "-5") < fleet.fleetSize) {
                System.out.println("Делайте следующий ход!");
            } else {
                System.out.println("Поздравляем! Вы потопили корабль за " + canon.shotsCounter + " попыток.");
            }
        }

        /* НЕОБХОДИМО:
        получить от пользователя стринговое значение хода +++++
        проверить его на возможность преобразования в инт (проверка на нормальный ввод) +++++
        проверить, чтобы ход не был меньше 1 и больше размера поля ++++
        если все хорошо, отправить ход на проверку вхождения в arrayList fleetLocation. ++++
        если такое вхождение есть, заменить элемент на -5 ++++
        запустить новый ход
        остановиться если весь arrayList содержит только -5.


         */
    }

    public static void sayHelloToGamer() {
        System.out.println("\n" + "Добро пожаловать в игру Морской бой.");
        System.out.println("В ней Вам предстоит угадать, где расположен корабль и потопить его.");
        System.out.println("Игровое поле представляет собой прямую с ячейками.");
        System.out.println("Ну что ж, приступим!" + "\n");
    }
}

