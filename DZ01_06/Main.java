/*
Java имеет 8 примитивных типов данных; char, boolean, byte, short, int, long, float и double. В этом упражнении мы будем работать с примитивами, используемыми для хранения целочисленных значений (byte, short, int и long):

byte - это 8-разрядное целое число со знаком.
short - это 16-разрядное целое число со знаком.
Int - это 32-разрядное целое число со знаком.
long - это 64-разрядное целое число со знаком.
Учитывая целое входное значение, вы должны определить, какие примитивные типы данных способны правильно хранить эти входные данные.

Пример:
Вводим с консоли 
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Вывод:
 -150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	long num;
	String st;
        Scanner in;
	String[] types = {"byte", "short", "int", "long"};
	long[][] intervals = { { -128, 127 }, { -32768, 32767 }, {-2147483648, 2147483647}, {-9223372036854775808L, 9223372036854775807L}};

	while (true){
	        in = new Scanner(System.in);
       		System.out.print("Number = ");
       		st = in.next();
 		try{
			num = Long.parseLong(st);
			break;
	        }
		catch(Exception ex){
			System.out.printf("%s can't be fitted anywhere\n", st);
			continue;
		}  
	}
        in.close();

	System.out.printf("%d can be fitted in:\n", num);
	for (int i = 0; i < types.length; i++){
		if ((intervals[i][0] <= num) && (num <= intervals[i][1])){
			System.out.printf("* %s\n", types[i]);
		}
	}

    }

}
