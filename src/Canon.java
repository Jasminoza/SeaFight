import java.util.Scanner;

public class Canon {
    public String shootingCell;
    boolean correctCell = false;
    int shotsCounter = 0;

    public void checkShotValue(GameField gameField) {         //Проверяем введенное значение на корректность.
        Scanner sc = new Scanner(System.in);

        while (!correctCell) {
            try {
                String cell = sc.nextLine();
                int shootingCellInt = Integer.parseInt(cell);
                if (shootingCellInt <= 0 || shootingCellInt > gameField.fieldSize) {
                    System.out.println("Выбранная ячейка находится за пределами игрового поля, введите другое значение.");
                } else {
                    correctCell = true;
                    shootingCell = cell;
                    System.out.println("Выбранная ячейка - " + shootingCell + ".");
                }
            } catch (Exception e) {
                System.out.println("Введено неверное значение, введите число.");
            }
        }
        sc.close();
    }

    public void startShooting(GameField gameField) {
        //for (String fleetLocation : gameField.fleetLocation)
            if (gameField.fleetLocation.contains(shootingCell)) {
                shotsCounter++;
                gameField.fleetLocation.set (gameField.fleetLocation.indexOf(shootingCell), "-5");
                System.out.println(gameField.fleetLocation.toString());
                System.out.println("Вы попали!");
            } else {
                shotsCounter++;
                System.out.println("К сожалению, вы промазали.");
            }
    }
}
