import java.util.Scanner;

public class GameField { //Создаем класс игровое поле.
    public int fieldSize = 0; //Объявляем и задаем размер игрового поля.

    public int setFieldSize() { //Создаем метод для задания размера игрового поля.
        Scanner sc = new Scanner(System.in); //Вызываем сканер.
        System.out.println("Введите размер игрового поля (от 5 до 30)."); //Запрашиваем у игрока размер игрового поля.
        fieldSize = sc.nextInt();
        while (fieldSize < 5 || fieldSize > 30) { //Проверяем, чтобы игровое поле не было слишком маленьким или слишком большим.
            System.out.println("Размер игрового поля не может быть меньше 5 или больше 30.");
            System.out.println("Введите размер игрового поля.");
            fieldSize = sc.nextInt();

        }
        return fieldSize;
    }

}
