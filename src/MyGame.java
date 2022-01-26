import java.util.ArrayList;

public class MyGame {

    public static void main(String[] args) {
        MyGame myGame = new MyGame();
        Fleet fleet = new Fleet(); //Создаем экземпляр корабля.
        GameField gameField = new GameField(); //Создаем экземпляр игрового поля.

        System.out.println("\n" + "Добро пожаловать в игру Морской бой.");
        System.out.println("В ней Вам предстоит угадать, где расположен корабль и потопить его.");
        System.out.println("Игровое поле представляет собой прямую с ячейками.");
        System.out.println("Ну что ж, приступим!" + "\n");

        gameField.setFieldSize(); //Задаем размер игрового поля.
        fleet.setFleetSize();//Задаем размер коробля.
        System.out.println("\n" + "Строим корабль....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        System.out.println("\n" + "Корабль построен! Его размерность - " + fleet.fleetSize + "!");
        System.out.println("Размер вашего игрового поля: " + gameField.fieldSize + ".");
        System.out.println("Корабль отправился в путь...");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
        }

        System.out.println("\n" + "Корабль занял боевую позицию! Пора стрелять!");
        gameField.setFleetPosition(fleet);

    }


}

