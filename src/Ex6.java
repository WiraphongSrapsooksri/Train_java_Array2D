public class Ex6 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] product = new int[rows1][cols2];

        // Multiply the two matrices

        for (int i = 0; i <  matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result
        for (int[] row : product) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


/*

จงเขียนโปรแกรมเพื่อหาผลคูณของเมตริกซ์ (Array 2D) สองเมตริกซ์
1 2
3 4

และ

5 6
7 8

Answer
19 22
43 50
 */