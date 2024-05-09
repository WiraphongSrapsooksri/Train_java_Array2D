public class Ex7 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Print the main diagonal
        System.out.print("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        // Print the secondary diagonal
        System.out.print("Secondary diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - i - 1] + " ");
        }
        System.out.println();
    }
}

/*
จงเขียนโปรแกรมเพื่อหาเส้นทแยงมุมของเมตริกซ์ (Array 2D) โดยเส้นทแยงมุมหลักคือเส้นที่ผ่านจากมุมบนซ้ายไปยังมุมล่างขวา และเส้นทแยงมุมรองคือเส้นที่ผ่านจากมุมบนขวาไปยังมุมล่างซ้าย
1 2 3
4 5 6
7 8 9

เส้นทแยงมุมหลัก: 1 5 9
เส้นทแยงมุมรอง: 3 5 7


 */
