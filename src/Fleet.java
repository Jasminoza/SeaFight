
public class Fleet { //Создаем класс корабль.
    public int fleetSize = 0; //Объявляем размер корабля.

    public void setFleetSize() {
        while (fleetSize == 0) {
            fleetSize = (int) (Math.random() * 5); //Задаем размер корабля от 1 до 5.
        }
    }
}
