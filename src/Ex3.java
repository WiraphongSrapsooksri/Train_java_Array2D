public class Ex3 {
    public static void main(String[] args) {
        int[][] arr2D = {{5, 9, 8}, {3, 3, 7}, {6, 4, 2}};

        int max = arr2D[0][0]; // Initialize max with the first element
        int min = arr2D[0][0]; // Initialize min with the first element
        int maxRow = 0, maxCol = 0;
        int minRow = 0, minCol = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                    maxRow = i;
                    maxCol = j;
                } else if (arr2D[i][j] < min) {
                    min = arr2D[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Maximum value: " + max + " at position (" + maxRow + ", " + maxCol + ")");
        System.out.println("Minimum value: " + min + " at position (" + minRow + ", " + minCol + ")");
    }
}

/*
จงเขียนโปรแกรมเพื่อหาค่าสูงสุดและค่าต่ำสุดใน Array 2D และแสดงตำแหน่งของค่าเหล่านั้น

5 9 8
1 3 7
6 4 2

ผลลัพธ์ที่ต้องการคือ:

ค่าสูงสุด: 9 ตำแหน่ง (0, 1)
ค่าต่ำสุด: 1 ตำแหน่ง (1, 0)


 */