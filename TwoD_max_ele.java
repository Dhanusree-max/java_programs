/*import java.util.Scanner;

public class TwoD_max_ele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();// 3

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();// 3

        // Declaring 2D array
        int[][] arr = new int[rows][cols];

        // Taking input for 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {// 0<3 and 1<3 and 2<3 after this the loop ends
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }
        System.out.println("Maximum element of array is: " + max);
    }
}*/

// the above one is over all matrix of two d array element

// this one is each column max element
/*import java.util.Scanner;

public class TwoD_max_ele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();// 3

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();// 3

        // Declaring 2D array
        int[][] arr = new int[rows][cols];

        // Taking input for 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {// 0<3 and 1<3 and 2<3 after this the loop ends
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < cols; i++) {    // (or) for(int i=0;i<rows;i++){
            int max = arr[i][0];            //int max[0][i];
            for (int j = 0; j < rows; j++) {    //for (int j = 0; j < cols; j++) {
                if (arr[j][i] > max) {          //if(arr[j][i]>max){
                    max = arr[j][i];            //max=arr[j][i];
                }                               //}} this will also work
            }
            System.out.println("Maximum element of array is: " + max);
        }
    }
}*/
// max element for each row in 2d array
import java.util.Scanner;

public class TwoD_max_ele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();// 3

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();// 3

        // Declaring 2D array
        int[][] arr = new int[rows][cols];

        // Taking input for 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {// 0<3 and 1<3 and 2<3 after this the loop ends
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        /*
         * for (int i = 0; i < rows; i++) {
         * int max = arr[i][0];
         * for (int j = 0; j < cols; j++) {
         * if (arr[i][j] > max) {
         * max = arr[i][j];
         * }
         * }
         * System.out.println("Maximum element of array is: " + max);
         * }
         */
        // the commented code is for row max element
        // diagnal sum
        int sum = 0;

        /*
         * for (int i = 0; i < rows; i++) {
         * for (int j = 0; j < cols; j++) {
         * if (i == j) { // diagonal condition
         * sum += arr[i][j];
         * }
         * }
         * }
         */
        /*
         * for (int i = 0; i < rows; i++) { // this is one logic of reverse diagnal
         * for (int j = 0; j < cols; j++) {
         * if (i + j == cols - 1) {
         * sum += arr[i][j];
         * }
         * }
         * }
         */
        for (int i = 0; i < rows; i++) { // this is another logic of reverse diagnal
            sum += arr[i][2 - i];
        }
        System.out.println("Primary diagonal sum is: " + sum);
    }
}
