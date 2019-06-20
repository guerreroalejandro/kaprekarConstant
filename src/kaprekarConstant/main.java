package kaprekarConstant;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int numIte=0;
		int num;
		
		System.out.println("Introduzca un número de 4 dígitos");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		
		while (num > 9999) {
			System.out.println("Introduzca un número de 4 dígitos");
			sc = new Scanner(System.in);
			num = sc.nextInt();
		}
		
		if (num==6174) {
			num = CalcKaprekar.calcularKaprekar(num);
			numIte++;
			System.out.println(num + " numero de iteraciones: " + numIte);
		}
		else {
			while(num!=6174) {
				num = CalcKaprekar.calcularKaprekar(num);
				numIte++;
				System.out.println(num + " numero de iteraciones: " + numIte);
			}
		}

	}

}
