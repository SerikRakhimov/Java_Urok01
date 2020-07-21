//
// Отобразить в окне консоли аргументы командной строки в обратном порядке.
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	if (args.length > 0){
        	System.out.printf("Arguments:");
		for (int i = args.length - 1; i >=0 ; i--){
		    System.out.print(" " + args[i]);
		}
	}

	else{
        	System.out.printf("No arguments");
	}

    }
}
