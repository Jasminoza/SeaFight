import java.io.IOException;
import java.util.Scanner;

public class Canon {
    public String shootingCell;
    boolean correctCell = false;

    public void checkShotValue() {         //Проверяем введенное значение на корректность.
        Scanner sc = new Scanner(System.in);


        while (correctCell == false)
    {
        try {
            String cell = sc.nextLine();
            int shootingCellInt = Integer.parseInt(cell);
            correctCell = true;
            shootingCell = cell;
            System.out.println("Выбранная ячейка - " + shootingCell + ".");
        } catch (Exception e) {
            System.out.println("Введено неверное значение, введите число.");
        }
    }
         return;
}

    public void startShooting() {

    }
}
