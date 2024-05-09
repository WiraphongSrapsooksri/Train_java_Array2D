public class Ex8 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate the sum of the main diagonal
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonalSum += matrix[i][matrix.length - i - 1];
        }

        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }
}

/*

จงเขียนโปรแกรมเพื่อหาผลบวกของเลขทุกตัวในแนวทแยงของเมตริกซ์ (Array 2D) ทั้งเส้นทแยงมุมหลักและเส้นทแยงมุมรอง
1 2 3
4 5 6
7 8 9

ผลลัพธ์ที่ต้องการคือผลบวกของเลขตามเส้นทแยงมุมหลักและเส้นทแยงมุมรอง:

ผลบวกเส้นทแยงมุมหลัก: 15
ผลบวกเส้นทแยงมุมรอง: 15

 */
