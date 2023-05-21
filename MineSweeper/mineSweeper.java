import java.util.Scanner;

public class MineSweeper {
    private char[][] mineField;
    private boolean[][] mineLocations;
    private int rows;
    private int columns;
    private int mines;

    public MineSweeper(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        this.mineField = new char[rows][columns];
        this.mineLocations = new boolean[rows][columns];
        initializeMineField();
        placeMines();
    }

    private void initializeMineField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mineField[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        int count = 0;
        while (count < mines) {
            int randomRow = (int) (Math.random() * rows);
            int randomCol = (int) (Math.random() * columns);
            if (!mineLocations[randomRow][randomCol]) {
                mineLocations[randomRow][randomCol] = true;
                count++;
            }
        }
    }

    private boolean isValidPoint(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < columns;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidPoint(i, j) && mineLocations[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void printMineField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mineField[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        while (true) {
            printMineField();
            System.out.print("Satır Giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int col = scanner.nextInt();

            if (!isValidPoint(row, col)) {
                System.out.println("Geçersiz nokta! Lütfen tekrar deneyin.");
                continue;
            }

            if (mineLocations[row][col]) {
                System.out.println("Game Over!!");
                break;
            }

            int adjacentMines = countAdjacentMines(row, col);
            mineField[row][col] = (char) (adjacentMines + '0');

            if (adjacentMines == 0) {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (isValidPoint(i, j) && mineField[i][j] == '-') {
                            int adjMines = countAdjacentMines(i, j);
                            mineField[i][j] = (char) (adjMines + '0');
                        }
                    }
                }
            }

            boolean win = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (!mineLocations[i][j] && mineField[i][j] == '-') {
                        win = false;
                        break;
                    }
                }
            }
            if (win) {
                System.out.println("Oyunu Kazandınız!");
                printMineField();
                break;
            }
        }

        scanner.close();
    }
}
