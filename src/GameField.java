import java.util.ArrayList;
import java.util.Scanner;

public class GameField { //Создаем класс игровое поле.
    public int fieldSize = 0; //Объявляем и задаем размер игрового поля.
    public ArrayList<String> fleetLocation = new ArrayList<>();


    public int setFieldSize() { //Создаем метод для задания размера игрового поля.
        Scanner sc = new Scanner(System.in); //Вызываем сканер.
        System.out.println("Выберите размер игрового поля (от 5 до 30)."); //Запрашиваем у игрока размер игрового поля.
        fieldSize = sc.nextInt();
        while (fieldSize < 5 || fieldSize > 30) { //Проверяем, чтобы игровое поле не было слишком маленьким или слишком большим.
            System.out.println("Размер игрового поля не может быть меньше 5 или больше 30.");
            System.out.println("Выберите размер игрового поля.");
            fieldSize = sc.nextInt();
        }
        return fieldSize;
    }

    public void setFleetPosition(Fleet fleet) {
        int randomNum = (int) (Math.random() * (fieldSize - fleet.fleetSize));
        for (int x = 1; fleetLocation.size() <= (fleet.fleetSize - 1); x++) {
            fleetLocation.add(randomNum + x + "");
        }
    }
}
