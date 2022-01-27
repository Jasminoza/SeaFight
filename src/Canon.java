import java.util.ArrayList;
import java.util.Scanner;

public class Canon {
    public String shootingCell;
    public ArrayList<String> shootedCellList = new ArrayList<>();

    public void checkShotValue(GameField gameField) {         //Проверяем введенное значение на корректность.
        Scanner sc = new Scanner(System.in);
        boolean correctCell = false;
        String cell = sc.nextLine();

        while (!correctCell) {
            try {
                int shootingCellInt = Integer.parseInt(cell);
                if (shootingCellInt <= 0 || shootingCellInt > gameField.fieldSize) {
                    System.out.println("Выбранная ячейка находится за пределами игрового поля, введите другое значение.");
                    cell = sc.nextLine();
                } else {
                    correctCell = true;
                    shootingCell = cell;
                }
            } catch (Exception e) {
                System.out.println("Введено неверное значение, введите число.");
                cell = sc.nextLine();
            }
        }
    }

    public void startShooting(GameField gameField) {
        if (shootedCellList.contains(shootingCell)) {
            System.out.println("Вы уже сюда стреляли! Выберите другую ячейку.");
        } else {
            shootedCellList.add(shootingCell);
            int hit = (gameField.fleetLocation.contains(shootingCell) ? 1 : 0);

            switch (hit) {
                case (1):
                    System.out.println(gameField.fleetLocation.toString());
                    System.out.println("Вы попали!");
                    break;

                case (0):

                    System.out.println("К сожалению, вы промазали.");
                    break;
            }
        }
    }
}
