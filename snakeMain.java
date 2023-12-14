import java.util.Scanner;

public class snakeMain {
    public static void main(String[] args) {
        snake snake01 = new snake();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai x : ");
        snake01.x = scan.nextInt();
        System.out.print("Masukkan nilai y : ");
        snake01.y = scan.nextInt();
        System.out.print("Masukkan nilai tinggi : ");
        snake01.height = scan.nextInt();
        System.out.print("Masukkan nilai lebar : ");
        snake01.width = scan.nextInt();

        System.out.println("===============================");

        snake01.moveRight();
        snake01.moveUp();
        snake01.moveRight();
        snake01.moveDown();
        // snake01.moveUp();
        // snake01.moveLeft();
        // snake01.moveDown();
        // snake01.moveRight();
        snake01.checkPosition();
       }
       
}
