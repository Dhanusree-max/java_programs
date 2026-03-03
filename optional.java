public class optional {
    public static void main(String[] args) {

        int matrix[][] = {
                { 0, 1, 2, 3 },
                { 1, 0, 3, 2 },
                { 2, 3, 0, 1 },
                { 3, 2, 1, 0 }
        };

        int row, column;

        for (row = 0; row < 4; row++) {
            for (column = 0; column < 4; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
