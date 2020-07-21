//
// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int num, sum, prz;
	boolean isnums;
	isnums = true;
	sum = 0;
	prz = 1;
	if (args.length > 0){
        	System.out.printf("Arguments:");
		for (int i = 0; i < args.length; i++){

			try{
				num = Integer. parseInt(args[i]);
		        }
			catch(Exception ex){
				isnums = false;
		        	System.out.printf(" Not a number entered = '" + args[i] + "'");
				break;
			} 
 
			System.out.print(" " + num);
			sum = sum + num;
			prz = prz * num; 
				
		}

		if(isnums==true){
			System.out.printf(", sum = %d, numbers = %d. \n", sum, prz);
		}

	}

	else{
        	System.out.printf("No arguments");
	}

    }
}
