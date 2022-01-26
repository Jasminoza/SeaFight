import java.util.ArrayList;
import java.util.Scanner;

public class Fleet { //Создаем класс корабль.
    public int fleetSize = 0; //Объявляем размер корабля.

    public void setFleetSize() {
        while (fleetSize == 0) {
            fleetSize = (int) (Math.random() * 5);
        }
    }
}



    /*public void setFleetSize() { // Создаем метод для задания размера корабля.
        Scanner sc = new Scanner(System.in); //Вызываем сканер.
        System.out.println("Введите размер боевого корабля (от 3 до 5)."); //Запрашиваем у игрока размер корабля.
        fleetSize = sc.nextInt();
        while (fleetSize <3 || fleetSize > 5){//Проверяем, чтобы корабль не был слишком маленьким или слишком большим.
            System.out.println("Размер корабля не может быть меньше 3 или больше 5.");
            System.out.println("Введите размер корабля.");
            fleetSize = sc.nextInt();
        }
        sc.close();*/






