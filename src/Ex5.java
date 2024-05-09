public class Ex5 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {1, 2, 3}};

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];

        // Add the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        for (int[] row : sum) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


/*

จงเขียนโปรแกรมเพื่อรวมสองเมตริกซ์ (Array 2D) เข้าด้วยกัน
ตัวอย่างเช่น ให้เมตริกซ์สองเมตริกซ์ดังนี้:
1 2 3
4 5 6

และ

7 8 9
1 2 3

Answer
8 10 12
5 7 9

 */