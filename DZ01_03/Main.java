//
// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       	int num;
	double a;
        Scanner in;
	while (true){
 
		try{
		        in = new Scanner(System.in);
        		System.out.print("Number of random numbers = ");
        		num = in.nextInt();
			if (num > 0){
				break;
			}
			else{
				continue;
			}
	        }
		catch(Exception ex){
			continue;
		}  
	}

	for (int i = 0; i < num; i++){
		a = Math.random();
		System.out.printf(" %.5f\n", a);
	}

	for (int i = 0; i < num; i++){
		a = Math.random();
		System.out.printf(" %.5f", a);
	}

        in.close();

    }
}
