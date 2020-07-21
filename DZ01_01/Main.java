//
// Приветствовать любого пользователя при вводе его имени через командную строку.
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	Scanner in = new Scanner(System.in);
        System.out.print("Your name = ");
        String st = in.nextLine();
          
        System.out.printf("Hello, %s \n", st);
        in.close();

    }
}
