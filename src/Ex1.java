public class Ex1 {
    public static void main(String[] args) {
        int rows = 5; // จำนวนแถวของรูปสามเหลี่ยม

        // แบบที่ 1: รูปสามเหลี่ยมตรง
        System.out.println("แบบที่ 1: รูปสามเหลี่ยมตรง");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // แบบที่ 2: รูปสามเหลี่ยมกลับหัว
        System.out.println("แบบที่ 2: รูปสามเหลี่ยมกลับหัว");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // แบบที่ 3: รูปสามเหลี่ยมมุมฉาก
        System.out.println("แบบที่ 3: รูปสามเหลี่ยมมุมฉาก");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
