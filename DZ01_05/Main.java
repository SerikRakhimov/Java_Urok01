//
// Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел..
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       	int num;
        Scanner in;
	String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

	while (true){
 
		try{
		        in = new Scanner(System.in);
        		System.out.print("Month number (1-12) = ");
        		num = in.nextInt();
			if ((1 <= num) && (num <= 12)){
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

        in.close();
	
	System.out.printf(months[num - 1]);

    }
}
