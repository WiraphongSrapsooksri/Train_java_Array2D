public class  Ex2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Calculate row sums
        int[] rowSum = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];
            }
            rowSum[i] = sum;
        }

        // Print the result
        for (int sum : rowSum) {
            System.out.print(sum + " ");
        }
    }
}
/*
    จงเขียนโปรแกรมเพื่อหาผลรวมของเลขทุกตัวในแถวของ Array 2D โดยที่ผลรวมของแต่ละแถวจะถูกเก็บไว้ใน Array 1D

        ตัวอย่างเช่น ให้ Array 2D ดังนี้:

        1 2 3
        4 5 6
        7 8 9

        Answer 6 15 24
*/




