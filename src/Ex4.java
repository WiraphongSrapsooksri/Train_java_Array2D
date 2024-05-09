public class Ex4 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Rotate the 2D array by 90 degrees clockwise
        int rows = arr2D.length;
        int cols = arr2D[0].length;
        int[][] rotatedArr = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedArr[j][rows - i - 1] = arr2D[i][j];
            }
        }

        // Print the rotated array
        for (int[] row : rotatedArr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


/*

จงเขียนโปรแกรมเพื่อหมุน Array 2D ไปทางขวา 90 องศา

ก่อน
1 2 3
4 5 6
7 8 9

หลัง
7 4 1
8 5 2
9 6 3


 */