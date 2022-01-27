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
        waitAlittle();

        System.out.println("\n" + "Корабль построен. Его размер - " + fleet.fleetSize + " ячейки!");
        System.out.println("Корабль отправился в путь...");
        waitAlittle();

        System.out.println("\n" + "Корабль занял боевую позицию! Пора стрелять!");
        gameField.setFleetPosition(fleet);
        System.out.println("Введите номер поля, куда будем стрелять. (От 1 до " + gameField.fieldSize + ")");
        System.out.println(gameField.fleetLocation.toString());

        while (!canon.shootedCellList.containsAll(gameField.fleetLocation)) { //Стреляем, пока не потопим весь корабль
            canon.checkShotValue(gameField);
            canon.startShooting(gameField);
            if (!canon.shootedCellList.containsAll(gameField.fleetLocation)) {
                System.out.println("Делайте следующий ход!");
            } else {
                System.out.println("Поздравляем! Количество выстрелов: " + canon.shootedCellList.size() + ".");
            }
        }
    }

    public static void sayHelloToGamer() {
        System.out.println("\n" + "Добро пожаловать в игру Морской бой.");
        System.out.println("В ней Вам предстоит угадать, где расположен корабль и потопить его.");
        System.out.println("Игровое поле представляет собой прямую с ячейками.");
        System.out.println("Ну что ж, приступим!" + "\n");
    }

    public static void waitAlittle() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
    }
}

