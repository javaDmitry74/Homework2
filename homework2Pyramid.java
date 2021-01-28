import java.util.Scanner;

public class homework2Pyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of Pyramid X and Y with space between them = ");
        int x = scanner.nextInt();     //we ask user enter size of our pyramid
        int y = scanner.nextInt();     // it will have x and y sides

        int[][] arr = new int[x][y];    //create an array and put in it our x and y
        for (int i = 0; i < arr.length; i++) {          // running through rows and columns with cycle
            for (int j = 0; j < arr[i].length; j++) {
                int ii;        // it our variables where we will write our values
                int ij;
                if (i < x/2) {
                    ii = Math.min(i, j);  //we using math to write our values to the array
                } else {                  // the way we need see fit
                    ii = Math.min(x - 1 - i, j);
                }
                if (j < y/2) {
                    ij = Math.min(i, j);
                } else {
                    ij = Math.min(i, y - 1 - j);
                }
                arr[i][j] = Math.min(ii, ij);    //at end of each cycle we will write
            }                                    //values of i and j to our array
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");  //printing our array to look like pyramid
            }
            System.out.println();
        }
    }
}



