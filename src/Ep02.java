//import java.util.Scanner;

//public class Ep02 {
//     EXERCISE 1:
//    static void main() {
//        char t = '*';
//        for (int i = 0; i < 4; i++) {
//            for (int j = 1; j <= i+1; j++) {
//                System.out.print(t);
//            }
//            System.out.println();
//        }
//    }
//
//     EXERCISE 2:
//    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 4 - i; j > 1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    EXERCISE 3:
//    static void main(String[] args) {
//        System.out.println("How many rows you want: ");
//        Scanner input = new Scanner(System.in);
//        int totalRows = input.nextInt();
//        for (int row = 1; row <= totalRows; row++) {
//            int stars = row*2 -1;
//            int spaces = totalRows - row;
//            for (int k = spaces; k > 0; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        input.close();
//    }
//}
//
